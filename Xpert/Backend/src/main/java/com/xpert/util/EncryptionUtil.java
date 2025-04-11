package com.xpert.util;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

@Component
public class EncryptionUtil {

    @Value("${encryption.secret-key}")
    private String secretKey;

    private SecretKeySpec keySpec;

    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static final int IV_SIZE = 16;

    @PostConstruct
    public void init() {
        this.keySpec = new SecretKeySpec(secretKey.getBytes(), ALGORITHM);
    }

    public String encrypt(String value) {
        try {
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);

            // Generate a new random IV
            byte[] iv = new byte[IV_SIZE];
            new SecureRandom().nextBytes(iv);
            IvParameterSpec ivSpec = new IvParameterSpec(iv);

            cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
            byte[] encrypted = cipher.doFinal(value.getBytes());

            // Combine IV and encrypted data
            byte[] ivAndEncrypted = new byte[IV_SIZE + encrypted.length];
            System.arraycopy(iv, 0, ivAndEncrypted, 0, IV_SIZE);
            System.arraycopy(encrypted, 0, ivAndEncrypted, IV_SIZE, encrypted.length);

            return Base64.getEncoder().encodeToString(ivAndEncrypted);
        } catch (Exception e) {
            throw new RuntimeException("Encryption error", e);
        }
    }

    public String decrypt(String encrypted) {
        try {
            byte[] ivAndEncrypted = Base64.getDecoder().decode(encrypted);

            // Extract IV and encrypted data
            byte[] iv = new byte[IV_SIZE];
            byte[] ciphertext = new byte[ivAndEncrypted.length - IV_SIZE];
            System.arraycopy(ivAndEncrypted, 0, iv, 0, IV_SIZE);
            System.arraycopy(ivAndEncrypted, IV_SIZE, ciphertext, 0, ciphertext.length);

            IvParameterSpec ivSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);

            byte[] decrypted = cipher.doFinal(ciphertext);
            return new String(decrypted);
        } catch (Exception e) {
            throw new RuntimeException("Decryption error", e);
        }
    }
}

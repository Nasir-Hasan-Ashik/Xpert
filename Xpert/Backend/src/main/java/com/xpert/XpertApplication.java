package com.xpert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xpert.entity.Users;
import com.xpert.enums.UserRole;
import com.xpert.enums.UserStatus;
import com.xpert.repository.UserRepository;

@SpringBootApplication
public class XpertApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(XpertApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);

//        Users user = new Users();
//        user.setEmail("jlllhjbd@example.com");
//        user.setPhone("1234567890");
//        user.setPasswordHash("hashedpassword");
//        user.setFirstName("John");
//        user.setLastName("Doe");
//        user.setStatus("Active");
//        user.setIsActive(true);
//        user.setIsVerified(true);
//
//        userRepository.save(user);
//        System.out.println("User saved successfully!");
		
//		userRepository.findAll().forEach(user ->
//	    System.out.println("User: " + user.getFirstName() + " " + user.getLastName() + ", ID: " + user.getId())
//	); 
		
//		Users newUser = new Users();
//		newUser.setEmail("newuser@example.com");
//		newUser.setPhone("01700000000");
//		newUser.setPasswordHash("securehashedpassword");
//		newUser.setFirstName("Ali");
//		newUser.setLastName("Khan");
//		newUser.setStatus(UserStatus.ACTIVE);
//		newUser.setRole(UserRole.CUSTOMER);
//		newUser.setIsActive(true);
//		newUser.setIsVerified(true);
//
//		userRepository.save(newUser);
//		System.out.println("✅ User created: " + newUser.getFirstName() + " " + newUser.getLastName());
//		
		userRepository.findAll().forEach(user ->
	    System.out.println("User: " + user.getFirstName() + " " + user.getLastName() + ", ID: " + user.getId())
	);


	

    }
		
	

}

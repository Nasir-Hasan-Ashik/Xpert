package com.xpert.service.impl;

import com.xpert.dto.user.UpdateUserProfileDTO;
import com.xpert.dto.user.UserProfileDTO;
import com.xpert.entity.UserProfile;
import com.xpert.entity.Users;
import com.xpert.repository.UserProfileRepository;
import com.xpert.repository.UserRepository;
import com.xpert.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserProfileDTO getUserProfile(UUID userId) {
        UserProfile profile = userProfileRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User profile not found"));

        return mapToDTO(profile);
    }

    @Override
    public UserProfileDTO updateUserProfile(UUID userId, UpdateUserProfileDTO dto) {
        UserProfile profile = userProfileRepository.findById(userId)
                .orElseGet(() -> {
                    // If profile doesn't exist, create new one
                    Users user = userRepository.findById(userId)
                            .orElseThrow(() -> new RuntimeException("User not found"));

                    UserProfile newProfile = new UserProfile();
                    newProfile.setUser(user);
                    newProfile.setUserId(user.getId());
                    return newProfile;
                });

        profile.setImage(dto.getImage());
        profile.setDescription(dto.getDescription());
        profile.setExperiencesInShort(dto.getExperiencesInShort());
        profile.setCv(dto.getCv());
        profile.setCompletedWorks(dto.getCompletedWorks());

        UserProfile saved = userProfileRepository.save(profile);
        return mapToDTO(saved);
    }

    @Override
    public List<String> getNotifications(UUID userId) {
        UserProfile profile = userProfileRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User profile not found"));
        return profile.getNotifications();
    }

    @Override
    public List<String> updateNotifications(UUID userId, List<String> notifications) {
        UserProfile profile = userProfileRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User profile not found"));
        profile.setNotifications(notifications);
        userProfileRepository.save(profile);
        return notifications;
    }

    private UserProfileDTO mapToDTO(UserProfile profile) {
        return new UserProfileDTO(
                profile.getUserId(),
                profile.getImage(),
                profile.getDescription(),
                profile.getExperiencesInShort(),
                profile.getCv(),
                profile.getCompletedWorks(),
                profile.getNotifications()
        );
    }
}

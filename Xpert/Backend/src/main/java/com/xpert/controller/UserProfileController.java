package com.xpert.controller;

import com.xpert.dto.user.UpdateUserProfileDTO;
import com.xpert.dto.user.UserProfileDTO;
import com.xpert.service.UserProfileService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/user-profiles")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    // Get profile by userId
    @GetMapping("/{userId}")
    public UserProfileDTO getUserProfile(@PathVariable UUID userId) {
        return userProfileService.getUserProfile(userId);
    }

    // Update profile
    @PutMapping("/{userId}")
    public UserProfileDTO updateUserProfile(
            @PathVariable UUID userId,
            @Valid @RequestBody UpdateUserProfileDTO dto) {
        return userProfileService.updateUserProfile(userId, dto);
    }

    // Get notifications
    @GetMapping("/{userId}/notifications")
    public List<String> getNotifications(@PathVariable UUID userId) {
        return userProfileService.getNotifications(userId);
    }

    // Update notifications
    @PutMapping("/{userId}/notifications")
    public List<String> updateNotifications(
            @PathVariable UUID userId,
            @RequestBody List<String> notifications) {
        return userProfileService.updateNotifications(userId, notifications);
    }
}

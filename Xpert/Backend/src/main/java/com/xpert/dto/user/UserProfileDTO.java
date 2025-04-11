package com.xpert.dto.user;

import java.util.List;
import java.util.UUID;

public class UserProfileDTO {

    private UUID userId;
    private String image;
    private String description;
    private String experiencesInShort;
    private String cv;
    private Integer completedWorks;
    private List<String> notifications;

    // Constructors
    public UserProfileDTO() {}

    public UserProfileDTO(UUID userId, String image, String description, String experiencesInShort,
                          String cv, Integer completedWorks, List<String> notifications) {
        this.userId = userId;
        this.image = image;
        this.description = description;
        this.experiencesInShort = experiencesInShort;
        this.cv = cv;
        this.completedWorks = completedWorks;
        this.notifications = notifications;
    }

    // Getters and Setters
    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getExperiencesInShort() { return experiencesInShort; }
    public void setExperiencesInShort(String experiencesInShort) { this.experiencesInShort = experiencesInShort; }

    public String getCv() { return cv; }
    public void setCv(String cv) { this.cv = cv; }

    public Integer getCompletedWorks() { return completedWorks; }
    public void setCompletedWorks(Integer completedWorks) { this.completedWorks = completedWorks; }

    public List<String> getNotifications() { return notifications; }
    public void setNotifications(List<String> notifications) { this.notifications = notifications; }
}

package com.xpert.dto.user;

import jakarta.validation.constraints.Size;

public class UpdateUserProfileDTO {

    private String image;

    @Size(max = 5000, message = "Description too long")
    private String description;

    @Size(max = 3000, message = "Experiences in short is too long")
    private String experiencesInShort;

    private String cv;

    private Integer completedWorks;

    // Constructors
    public UpdateUserProfileDTO() {}

    public UpdateUserProfileDTO(String image, String description, String experiencesInShort,
                                String cv, Integer completedWorks) {
        this.image = image;
        this.description = description;
        this.experiencesInShort = experiencesInShort;
        this.cv = cv;
        this.completedWorks = completedWorks;
    }

    // Getters and Setters
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
}

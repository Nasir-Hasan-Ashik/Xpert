package com.xpert.dto.service;

import com.xpert.enums.ServiceType;

import java.math.BigDecimal;
import java.time.Instant;

public class ServiceDTO {
    private Integer id;
    private String title;
    private String description;
    private Integer categoryId;
    private String categoryName;
    private String expertId;
    private String expertFullName;
    private ServiceType serviceType;
    private BigDecimal price;
    private Instant createdAt;
    private Instant updatedAt;

    // All-args constructor
    public ServiceDTO(Integer id, String title, String description, Integer categoryId, String categoryName,
                      String expertId, String expertFullName, ServiceType serviceType, BigDecimal price,
                      Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.expertId = expertId;
        this.expertFullName = expertFullName;
        this.serviceType = serviceType;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Integer getCategoryId() { return categoryId; }
    public void setCategoryId(Integer categoryId) { this.categoryId = categoryId; }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }

    public String getExpertId() { return expertId; }
    public void setExpertId(String expertId) { this.expertId = expertId; }

    public String getExpertFullName() { return expertFullName; }
    public void setExpertFullName(String expertFullName) { this.expertFullName = expertFullName; }

    public ServiceType getServiceType() { return serviceType; }
    public void setServiceType(ServiceType serviceType) { this.serviceType = serviceType; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
}

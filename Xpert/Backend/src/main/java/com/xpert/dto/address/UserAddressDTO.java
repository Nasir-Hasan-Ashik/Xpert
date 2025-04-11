package com.xpert.dto.address;

import java.util.UUID;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserAddressDTO {
    private UUID id;
    private String title;
    private String country;
    private String city;
    private String state;
    private String zipCode;
    private String streetAddress;
    private Boolean isDefault;

    // Getters & Setters
//    public UUID getId() { return id; }
//    public void setId(UUID id) { this.id = id; }
//
//    public String getTitle() { return title; }
//    public void setTitle(String title) { this.title = title; }
//
//    public String getCountry() { return country; }
//    public void setCountry(String country) { this.country = country; }
//
//    public String getCity() { return city; }
//    public void setCity(String city) { this.city = city; }
//
//    public String getState() { return state; }
//    public void setState(String state) { this.state = state; }
//
//    public String getZipCode() { return zipCode; }
//    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
//
//    public String getStreetAddress() { return streetAddress; }
//    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }
//
//    public Boolean getIsDefault() { return isDefault; }
//    public void setIsDefault(Boolean isDefault) { this.isDefault = isDefault; }
}

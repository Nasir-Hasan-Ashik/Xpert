package com.xpert.dto.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class CreateUserAddressDTO {

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Country is required")
    private String country;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "Zip code is required")
    private String zipCode;

    @NotBlank(message = "Street address is required")
    private String streetAddress;

    @NotNull(message = "Default address status is required")
    private Boolean isDefault;

    // Getters & Setters
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

package com.example.demo.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String streetName;
    private String city;
    private String country;

    public Address() {
        // default constructor
    }

    public Address(String streetName, String city, String country) {
        this.streetName = streetName;
        this.city = city;
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [streetName=" + streetName + ", city=" + city + ", country=" + country + "]";
    }
}

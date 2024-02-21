package com.example.demo.Autowiring;

public class Address {
    private String street;
    private String location;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Address() {
        super();
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

}

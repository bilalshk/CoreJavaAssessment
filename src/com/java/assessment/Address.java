package com.java.assessment;

/**
 * Created by bilalshaikh on 1/31/17.
 */
public class Address {
    private String street;
    private String city;
    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static Address addAddress(String street, String city, String state) {
        Address address = new Address();
        address.setStreet(street);
        address.setCity(city);
        address.setState(state);
        return address;
    }
}

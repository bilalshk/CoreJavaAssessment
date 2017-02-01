package com.java.assessment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bilalshaikh on 1/31/17.
 */
public class Employee {
    private int id;
    private String name;
    private List<Address> addresses;

    public Employee() {
        addresses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public static Employee createEmployee(int id, String name) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        return employee;
    }
}

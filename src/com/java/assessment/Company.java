package com.java.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bilalshaikh on 1/31/17.
 */
public class Company {
    private int id;
    private String name;
    private List<Department> departments;

    public Company() {
        departments = new ArrayList<>();
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

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public static Company createCompany(int id, String name) {
        Company companies = new Company();
        companies.setId(id);
        companies.setName(name);
        return companies;
    }
}

package com.java.assessment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bilalshaikh on 1/31/17.
 */
public class Project {
    private int id;
    private String name;
    private List<Employee> employees;

    public Project() {
        employees = new ArrayList<>();
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public static Project createProject(int id, String name) {
        Project project = new Project();
        project.setId(id);
        project.setName(name);
        return project;
    }
}

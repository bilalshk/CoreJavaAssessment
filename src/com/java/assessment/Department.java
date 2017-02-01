package com.java.assessment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bilalshaikh on 1/31/17.
 */
public class Department {
    private int id;
    private String name;
    private List<Project> projects;

    public Department() {
        projects = new ArrayList<>();
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

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public static Department createDepartment(int id, String name) {
        Department  department = new Department();
        department.setId(id);
        department.setName(name);
        return department;
    }
}

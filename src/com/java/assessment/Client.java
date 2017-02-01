package com.java.assessment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by bilalshaikh on 1/31/17.
 */
public class Client {
    public static void main(String[] args) {

        List<Company> companies = new ArrayList<>();

        //Companies
        Company company1 = Company.createCompany(1, "AppDirect");
        Company company2 = Company.createCompany(2, "Amdocs");

        //Department
        Department department1 = Department.createDepartment(1, "IT");
        Department department2 = Department.createDepartment(2, "QA");
        Department department3 = Department.createDepartment(3, "HR");
        Department department4 = Department.createDepartment(4, "Admin");

        //Project
        Project project1 = Project.createProject(1, "ProjectOne");
        Project project2 = Project.createProject(2, "ProjectTwo");
        Project project3 = Project.createProject(3, "ProjectThree");
        Project project4 = Project.createProject(4, "ProjectFour");
        Project project5 = Project.createProject(5, "ProjectFive");
        Project project6 = Project.createProject(6, "ProjectSix");
        Project project7 = Project.createProject(7, "ProjectSeven");
        Project project8 = Project.createProject(8, "ProjectEight");

        //Employee
        Employee employee1 = Employee.createEmployee(1, "Bhavya");
        Employee employee2 = Employee.createEmployee(2, "Rawjyot");
        Employee employee3 = Employee.createEmployee(3, "Naina");
        Employee employee4 = Employee.createEmployee(4, "Swapan");
        Employee employee5 = Employee.createEmployee(5, "Natesh");
        Employee employee6 = Employee.createEmployee(6, "Rishabh");
        Employee employee7 = Employee.createEmployee(7, "Mehak");
        Employee employee8 = Employee.createEmployee(8, "Anchal");
        Employee employee9 = Employee.createEmployee(9, "Priti");
        Employee employee10 = Employee.createEmployee(10, "Arsh");
        Employee employee11 = Employee.createEmployee(11, "Ravi");
        Employee employee12 = Employee.createEmployee(12, "Nikhil");
        Employee employee13 = Employee.createEmployee(13, "Akansha");
        Employee employee14 = Employee.createEmployee(14, "Abhishek");
        Employee employee15 = Employee.createEmployee(15, "Badal");
        Employee employee16 = Employee.createEmployee(16, "Deepak");

        //Address
        Address homeaddress1 = Address.addAddress("Kondhwa1", "Pune", "Maharashtra");
        Address officeaddress1 = Address.addAddress("Magarpatta1", "Pune", "Maharashtra");
        Address homeaddress2 = Address.addAddress("Kondhwa2", "Pune", "Maharashtra");
        Address officeaddress2 = Address.addAddress("Magarpatta2", "Pune", "Maharashtra");
        Address homeaddress3 = Address.addAddress("Kondhwa3", "Pune", "Maharashtra");
        Address officeaddress3 = Address.addAddress("Magarpatta3", "Pune", "Maharashtra");
        Address homeaddress4 = Address.addAddress("Kondhwa4", "Pune", "Maharashtra");
        Address officeaddress4 = Address.addAddress("Magarpatta4", "Pune", "Maharashtra");
        Address homeaddress5 = Address.addAddress("Kondhwa5", "Pune", "Maharashtra");
        Address officeaddress5 = Address.addAddress("Magarpatta5", "Pune", "Maharashtra");
        Address homeaddress6 = Address.addAddress("Kondhwa6", "Pune", "Maharashtra");
        Address officeaddress6 = Address.addAddress("Magarpatta6", "Pune", "Maharashtra");
        Address homeaddress7 = Address.addAddress("Kondhwa7", "Pune", "Maharashtra");
        Address officeaddress7 = Address.addAddress("Magarpatta7", "Pune", "Maharashtra");
        Address homeaddress8 = Address.addAddress("Kondhwa8", "Pune", "Maharashtra");
        Address officeaddress8 = Address.addAddress("Magarpatta8", "Pune", "Maharashtra");
        Address homeaddress9 = Address.addAddress("Kondhwa9", "Pune", "Maharashtra");
        Address officeaddress9 = Address.addAddress("Magarpatta9", "Pune", "Maharashtra");
        Address homeaddress10 = Address.addAddress("Kondhwa10", "Pune", "Maharashtra");
        Address officeaddress10 = Address.addAddress("Magarpatta10", "Pune", "Maharashtra");
        Address homeaddress11 = Address.addAddress("Kondhwa11", "Pune", "Maharashtra");
        Address officeaddress11 = Address.addAddress("Magarpatta11", "Pune", "Maharashtra");
        Address homeaddress12 = Address.addAddress("Kondhwa12", "Pune", "Maharashtra");
        Address officeaddress12 = Address.addAddress("Magarpatta12", "Pune", "Maharashtra");
        Address homeaddress13 = Address.addAddress("Kondhwa13", "Pune", "Maharashtra");
        Address officeaddress13 = Address.addAddress("Magarpatta13", "Pune", "Maharashtra");
        Address homeaddress14 = Address.addAddress("Kondhwa14", "Pune", "Maharashtra");
        Address officeaddress14 = Address.addAddress("Magarpatta14", "Pune", "Maharashtra");
        Address homeaddress15 = Address.addAddress("Kondhwa15", "Pune", "Maharashtra");
        Address officeaddress15 = Address.addAddress("Magarpatta15", "Pune", "Maharashtra");
        Address homeaddress16 = Address.addAddress("Kondhwa16", "Pune", "Maharashtra");
        Address officeaddress16 = Address.addAddress("Magarpatta16", "Pune", "Maharashtra");

        //Department List
        company1.addDepartment(department1);
        company1.addDepartment(department2);

        //Project List
        department1.addProject(project1);
        department1.addProject(project2);
        department2.addProject(project3);
        department2.addProject(project4);

        //Employee List
        project1.addEmployee(employee1);
        project1.addEmployee(employee2);
        project2.addEmployee(employee3);
        project2.addEmployee(employee4);
        project3.addEmployee(employee5);
        project3.addEmployee(employee6);
        project4.addEmployee(employee7);
        project4.addEmployee(employee8);

        //Address List
        employee1.addAddress(homeaddress1);
        employee1.addAddress(officeaddress1);
        employee2.addAddress(homeaddress2);
        employee2.addAddress(officeaddress2);
        employee3.addAddress(homeaddress3);
        employee3.addAddress(officeaddress3);
        employee4.addAddress(homeaddress4);
        employee4.addAddress(officeaddress4);
        employee5.addAddress(homeaddress5);
        employee5.addAddress(officeaddress5);
        employee6.addAddress(homeaddress6);
        employee6.addAddress(officeaddress6);
        employee7.addAddress(homeaddress7);
        employee7.addAddress(officeaddress7);
        employee8.addAddress(homeaddress8);
        employee8.addAddress(officeaddress8);

        //Department List
        company2.addDepartment(department3);
        company2.addDepartment(department4);

        //Project List
        department3.addProject(project5);
        department3.addProject(project6);
        department4.addProject(project7);
        department4.addProject(project8);

        //Employee List
        project5.addEmployee(employee9);
        project5.addEmployee(employee10);
        project6.addEmployee(employee11);
        project6.addEmployee(employee12);
        project7.addEmployee(employee13);
        project7.addEmployee(employee14);
        project8.addEmployee(employee15);
        project8.addEmployee(employee16);

        //Address List
        employee9.addAddress(homeaddress9);
        employee9.addAddress(officeaddress9);
        employee10.addAddress(homeaddress10);
        employee10.addAddress(officeaddress10);
        employee11.addAddress(homeaddress11);
        employee11.addAddress(officeaddress11);
        employee12.addAddress(homeaddress12);
        employee12.addAddress(officeaddress12);
        employee13.addAddress(homeaddress13);
        employee13.addAddress(officeaddress13);
        employee14.addAddress(homeaddress14);
        employee14.addAddress(officeaddress14);
        employee15.addAddress(homeaddress15);
        employee15.addAddress(officeaddress15);
        employee16.addAddress(homeaddress16);
        employee16.addAddress(officeaddress16);

        companies.add(company1);
        companies.add(company2);

        //Display All Details

        for (Company c:companies
                ) {

            System.out.println("Company: " +c.getId()+ "\t" +c.getName());
            List<Department> d = c.getDepartments();

            for (int i = 0; i < d.size() ; i++) {
                System.out.println();
                System.out.println("\tDepartment: " +d.get(i).getId()+ "\t" +d.get(i).getName());

                int j=0;

                Department d1 = d.get(i);

                List<Project> p = d1.getProjects();

                while(j<p.size()) {

                    Project p1 = p.get(j);
                    System.out.println();
                    System.out.println("\t\tProject: " +p1.getId()+ "\t" + p1.getName());

                    List<Employee> e = p1.getEmployees();

                    Iterator<Employee> itr = e.iterator();

                    while(itr.hasNext()){

                        Employee e1 =itr.next();

                        int k=0;

                        Address a = e1.getAddresses().get(k);
                        System.out.println();
                        System.out.println("\t\t\tEmployee: " +e1.getId()+ "\t"+ e1.getName());
                        System.out.println();
                        System.out.println("\t\t\t\tHome Address: " +a.getStreet()+ "\t" +a.getCity()+ "\t" +a.getState());

                        k++;

                        a = e1.getAddresses().get(k);
                        System.out.println("\t\t\t\tOffice Address:" +a.getStreet()+ "\t" +a.getCity()+ "\t" +a.getState());
                    }
                    j++;
                }
            }
        }
    }
}

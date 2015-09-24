package za.ac.ngosa.factory;

import za.ac.ngosa.domain.Manager;

import java.util.Map;

/**
 * Created by OWNER on 2015/04/24.
 *
    private String firstName;
    private String lastName;
    private String password;
     private int age;
     private String position;
     private double salary;
     private String address;
     private String phoneNum;
 */


public class EmployeeFactory {

    public static Manager createManager(
            Map<String,String> values, int numOfEmployees, long
            id) {
        Manager manager = new Manager
                .Builder(id)
                .phoneNumber(values.get("phoneNumber"))
                .name(values.get("name"))
                .numberOfEmployees(numOfEmployees)
                .jobTitle(values.get("jobTitle"))
                .department(values.get("department"))
                .build();

        return manager;

    }
}

package records;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        Employee employee = new Employee("John", 30, "IT");
        System.out.println(employee);
        EmployeeRecord employeeRecord = new EmployeeRecord("John", 30, "IT");
        System.out.println(employeeRecord);


        EmployeeRecord employeeRecord2 = new EmployeeRecord("David", 20, "IT");
        EmployeeRecord employeeRecord3 = new EmployeeRecord("Jack", 25, "AA");
        EmployeeRecord employeeRecord4 = new EmployeeRecord("David", 20, "IT");

        System.out.println(employeeRecord2.equals(employeeRecord3));
        System.out.println(employeeRecord2.equals(employeeRecord4));
        System.out.println(employeeRecord2.hashCode());
        System.out.println(employeeRecord3.hashCode());

        System.out.println(employeeRecord2 == employeeRecord4);
        System.out.println(employeeRecord2 == employeeRecord3);


    }
}
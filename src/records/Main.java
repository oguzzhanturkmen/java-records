package records;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, "IT");
        System.out.println(employee);
        EmployeeRecord employeeRecord = new EmployeeRecord("John", 30, "IT");
        System.out.println(employeeRecord);

    }
}
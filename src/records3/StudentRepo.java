package records3;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {

    List<StudentDTO> students = new ArrayList<>();

    public void save(StudentDTO student) {
        students.add(student);
    }

    public void delete(StudentDTO student) {
        students.remove(student);
    }

    public void listStudents() {
        students.forEach(student ->
                System.out.println("Name: " + student.getFullName() + ", Student Number: " + student.getStudentNumber()));
    }

    public void listStudentsByFirstName(String firstName) {
        students.stream().filter(student -> student.getFirstName().equals(firstName)).forEach(student ->
                System.out.println("Name: " + student.getFullName() + ", Student Number: " + student.getStudentNumber()));
    }

    public void listStudentsByLastName(String lastName) {
        students.stream().filter(student -> student.getLastName().equals(lastName)).forEach(student ->
                System.out.println("Name: " + student.getFullName() + ", Student Number: " + student.getStudentNumber()));
    }

    public void listStudentsByStudentNumber(String studentNumber) {
        students.stream().filter(student -> student.getStudentNumber().equals(studentNumber)).forEach(student ->
                System.out.println("Name: " + student.getFullName() + ", Student Number: " + student.getStudentNumber()));
    }

    public void listStudentsByFullName(String firstName, String lastName) {
        students.stream().filter(student -> student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)).forEach(student ->
                System.out.println("Name: " + student.getFullName() + ", Student Number: " + student.getStudentNumber()));
    }


}

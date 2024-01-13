package records3;

public class Main {
    public static void main(String[] args) {

        StudentRepo studentRepo = new StudentRepo();

        StudentDTO studentDTO = new StudentDTO("John", "Doe", "123456");
        studentRepo.save(studentDTO);

        StudentDTO studentDTO2 = new StudentDTO("Jane", "Doe");
        studentRepo.save(studentDTO2);

        System.out.println("All students: Before change");
        studentRepo.listStudents();

        StudentDTO newStudentDTO = new StudentDTO(studentRepo.students.get(1).getFirstName(), studentRepo.students.get(1).getLastName(), "654321");

        studentRepo.delete(studentRepo.students.get(1));
        studentRepo.save(newStudentDTO);

        System.out.println("All students: After change");
        studentRepo.listStudents();
    }
}

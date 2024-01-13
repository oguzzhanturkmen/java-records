package records3;

public record StudentDTO(String firstName, String lastName, String studentNumber) {

    public StudentDTO(String firstName, String lastName) {
        this(firstName, lastName, "N/A");
    }

    public StudentDTO(String firstName) {
        this(firstName, "N/A", "N/A");
    }

    public StudentDTO() {
        this("N/A", "N/A", "N/A");
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

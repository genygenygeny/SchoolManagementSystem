package org.geny.dto;

public class Teacher {
    private static int nextId = 1;
    private String firstName;
    private String lastName;
    private String id;
    private Department department;

    /**
     * AllArgsConstructor creates an instance of the class.
     * @param firstName first name of teacher
     * @param lastName last name of teacher
     * @param department department of teacher
     */
    public Teacher(String firstName, String lastName, Department department) {
        this.id = String.format("T%03d", nextId++);
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    /**
     * ToString() is a method that represents a Teacher object as a formatted String.
     * @return returns a formatted String
     * @author Geny Tang
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", department=" + department +
                '}';
    }
}

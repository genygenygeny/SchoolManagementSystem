package org.geny.dto;

/**
 * This class has access to Department.
 * Contains attributes such as firstName, lastName, id and department.
 *
 * @author Geny Tang
 */
public class Teacher {
    private static int nextId = 1;
    private String firstName;
    private String lastName;
    private String id;
    private Department department;

    /**
     * AllArgsConstructor creates an instance of the class.
     *
     * @param firstName  first name of teacher.
     * @param lastName   last name of teacher.
     * @param department department of teacher.
     */
    public Teacher(String firstName, String lastName, Department department) {
        this.id = String.format("T%03d", nextId++);
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    /**
     * ToString() is a method that represents a Teacher object as a formatted String.
     *
     * @return returns a formatted String.
     * @author Geny Tang
     */
    @Override
    public String toString() {
        return "Teacher{" + ", id='" + id + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                '}';
    }
}

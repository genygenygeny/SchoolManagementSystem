package org.geny.dto;

/**
 * Contains attributes such as id and departmentName.
 * The attributes are given to the objects of this class.
 *
 * @author Geny Tang
 */
public class Department {
    private static int nextId = 1;
    private String id;
    private String departmentName;

    /**
     * AllArgumentsConstructor creates an instance of the class.
     *
     * @param departmentName name of the department.
     * @author Geny Tang
     */
    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }

    /**
     * ToString() is a method that represents a Department object as a formatted String.
     *
     * @return returns a formatted String.
     * @author Geny Tang
     */
    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}

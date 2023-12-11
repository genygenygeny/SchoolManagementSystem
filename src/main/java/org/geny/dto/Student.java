package org.geny.dto;

import lombok.Getter;
import java.util.Arrays;

@Getter

/**
 * This class has access to Department and Course.
 * Contains attributes, such as, firstName, lastName, id, courses, courseNum and department.
 * The attributes are given to the objects of this class.
 *
 * @author Geny Tang
 */
public class Student {
    private static final int MAX_COURSES_PER_STUDENT = 5;
    private static int nextId = 1;
    private String firstName;
    private String lastName;
    private String id;
    private Course[] courses;
    private int courseNum;
    private Department department;

    /**
     * AllArgumentsConstructor creates an instance of the class.
     *
     * @param firstName  first name of student.
     * @param lastName   last name of student.
     * @param department department of student.
     * @author Geny Tang
     */
    public Student(String firstName, String lastName, Department department) {
        this.id = String.format("S%03d", nextId++);
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    /**
     * ToString() is a method that represents a Student object as a formatted String.
     *
     * @return returns a formatted String.
     * @author Geny Tang
     */
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", courseNum=" + courseNum +
                ", department=" + department +
                '}';
    }

    public void registerStudentCourse(Course course) {
        if (courseNum < MAX_COURSES_PER_STUDENT) {
            for (int i = 0; i < courseNum; i++) {
                if (course == courses[i]) {
                    System.out.println("Student already registered to course.");
                }
            }
            courses[courseNum] = course;
            courseNum++;
        } else {
            System.out.println("Student has reached maximum courses");
        }
    }
}

package org.geny.dto;

/**
 * This class has access to Course, Teacher, Department and Student.
 * Contains methods that manage the school system.
 * @author Geny Tang
 */
public class SchoolManagementSystem {

    /**
     * Confirms whether a department exists in the school system.
     * @return returns null if the department does not exist.
     * @author Geny Tang
     */
    public Department findDepartment() {}

    /**
     * Adds a department into the school system.
     * If the max department has been reached then adding a new department failed.
     * @author Geny Tang
     */
    public void addDepartment() {}

    /**
     * Displays all departments of the school system
     * @author Geny Tang
     */
    public void printDepartments() {}

    /**
     * Confirms whether a course exists in the school system.
     * @return returns null if the course does not exist.
     * @author Geny Tang
     */
    public Course findCourse() {}

    /**
     * Registers a student to a certain course of the school system
     * @author Geny Tang
     */
    public void registerCourse() {}

    /**
     * Adds a course into a department of the school system.
     * @author Geny Tang
     */
    public void addCourse() {}

    /**
     * Confirms whether a teacher exists in the school system.
     * @return returns null if the teacher does not exist.
     * @author Geny Tang
     */
    public Teacher findTeacher() {}

    /**
     * Modifies the teacher of a course of the school system.
     * @author Geny Tang
     */
    public void modifyCourseTeacher() {}

    /**
     * Adds a teacher into a course of the school system.
     * @author Geny Tang
     */
    public void addTeacher() {}

    /**
     * Displays all teachers of the school system.
     * @author Geny Tang
     */
    public void printTeachers() {}

    /**
     * Confirms whether a student exists in the school system.
     * @return returns null if a student does not exist.
     * @author Geny Tang
     */
    public Student findStudent() {}

    /**
     * Adds a student into the school system.
     * @author Geny Tang
     */
    public void addStudent() {}

    /**
     * Displays all students of the school system.
     * @author Geny Tang
     */
    public void printStudents() {}
}

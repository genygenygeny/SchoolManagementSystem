package org.geny.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * This class has access to Department, Teacher and Student.
 * Contains attributes such as courseName, id, credit, teacher, students, studentNum and department.
 * The attributes are given to the objects of this class.
 *
 * @author Geny Tang
 */
@Getter
@Setter
public class Course {
    private static final int MAX_STUDENTS_PER_COURSE = 5;
    private static int nextId = 1;
    private String courseName;
    private String id;
    private double credit;
    private Teacher teacher;
    private Student[] students;
    private int studentNum;
    private Department department;

    /**
     * AllArgumentsConstructor creates an instance of the class.
     *
     * @param courseName name of course.
     * @param credit     number of credits of course.
     * @param department the department of course.
     * @author Geny Tang
     */
    public Course(String courseName, double credit, Department department) {
        this.id = String.format("C%03d", nextId++);
        this.students = new Student[MAX_STUDENTS_PER_COURSE];
        this.studentNum = 0;
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
    }

    public String toStringStudents(Student[] students) {
        String studentsStr = "";

        for (Student student : students) {
            if (student != null) {
                studentsStr += student.getFirstName() + " " + student.getLastName() + "\n";
            }
        }
        return studentsStr;
    }

    /**
     * ToString() is a method that represents a Course object as a formatted String.
     *
     * @return returns a formatted String.
     * @author Geny Tang
     */
    @Override
    public String toString() {
        String teacherStr = "";
        if (teacher != null) {
            teacherStr += getTeacher().getFirstName() + getTeacher().getLastName();
        }

        String departmentStr = "";
        if (department != null) {
            departmentStr += getDepartment().getDepartmentName();
        }

        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", id='" + id + '\'' +
                ", credit=" + credit +
                ", teacher=" + teacherStr +
                ", students=" + toStringStudents(students) +
                ", studentNum=" + studentNum +
                ", department=" + departmentStr +
                '}';
    }

    public void registerCourseStudent(Student student) {
        if (studentNum < MAX_STUDENTS_PER_COURSE) {
            students[studentNum] = student;
            studentNum++;
        }
    }
}

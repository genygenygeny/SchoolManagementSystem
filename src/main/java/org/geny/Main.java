package org.geny;

import org.geny.dto.SchoolManagementSystem;

/**
 * Computer Science final project
 * @author Geny Tang
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();

        schoolManagementSystem.addDepartment("Computer Science");
        schoolManagementSystem.addDepartment("Psychology");
        schoolManagementSystem.addDepartment("Health");
        schoolManagementSystem.addDepartment("Music");
        schoolManagementSystem.addDepartment("Languages");
        schoolManagementSystem.addDepartment("Physics");

        schoolManagementSystem.printDepartments();

        System.out.println(schoolManagementSystem.findDepartment("D001"));

        for (int i = 0; i < 201; i++) {
            schoolManagementSystem.addStudent("Geny", "Tang", "D001");
        }

        schoolManagementSystem.printStudents();

        for (int i = 0; i < 21; i++) {
            schoolManagementSystem.addTeacher("Yi", "Wang", "D001");
        }

        schoolManagementSystem.printTeachers();

        for (int i = 0; i < 31; i++) {
            schoolManagementSystem.addCourse("English", 5, "D005");
        }

        schoolManagementSystem.printCourses();

        schoolManagementSystem.modifyCourseTeacher("T001", "C001");
        schoolManagementSystem.modifyCourseTeacher("T001", "C031");
        schoolManagementSystem.modifyCourseTeacher("T022", "C031");

        schoolManagementSystem.registerCourse("S001", "C001");
        schoolManagementSystem.registerCourse("S222", "C001");
        schoolManagementSystem.registerCourse("S001", "C032");

        schoolManagementSystem.registerCourse("S002", "C001");
        schoolManagementSystem.registerCourse("S003", "C001");
        schoolManagementSystem.registerCourse("S004", "C001");
        schoolManagementSystem.registerCourse("S005", "C001");
        schoolManagementSystem.registerCourse("S006", "C001");

        schoolManagementSystem.registerCourse("S001", "C003");
        schoolManagementSystem.registerCourse("S001", "C004");
        schoolManagementSystem.registerCourse("S001", "C005");
        schoolManagementSystem.registerCourse("S001", "C006");
        schoolManagementSystem.registerCourse("S001", "C007");
    }
}

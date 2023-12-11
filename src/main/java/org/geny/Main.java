package org.geny;

import org.geny.dto.SchoolManagementSystem;
import org.geny.dto.Student;

/**
 * Computer Science final project
 * @author Geny Tang
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();
        schoolManagementSystem.addDepartment("Computer Science");
//        schoolManagementSystem.addStudent("Geny", "Tang");
    }
}

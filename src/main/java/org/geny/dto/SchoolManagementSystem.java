package org.geny.dto;

/**
 * This class has access to Course, Teacher, Department and Student.
 * Contains methods that manage the school system.
 *
 * @author Geny Tang
 */
public class SchoolManagementSystem {
    private static final int MAX_DEPARTMENT_NUM = 5;
    private static final int MAX_STUDENT_NUM = 200;
    private static final int MAX_COURSES_PER_STUDENT = 5;
    private static final int MAX_TEACHER_NUM = 20;
    private static final int MAX_COURSE_NUM = 30;
    private static final int MAX_STUDENTS_PER_COURSE = 5;

    private Department[] departments;
    private int departmentNum;
    private Student[] students;
    private int studentNum;
    private Teacher[] teachers;
    private int teacherNum;
    private Course[] courses;
    private int courseNum;

    /**
     * Confirms whether a department exists in the school system.
     *
     * @return returns null if the department does not exist.
     * @author Geny Tang
     */
    public Department findDepartment(String id) {
        for (Department department : departments) {
            if (department.getId().equals(id)) {
                return department;
            }
        }
        // department not found
        return null;
    }

    /**
     * Adds a department into the school system.
     * If the max department has been reached then adding a new department failed.
     *
     * @author Geny Tang
     */
    public void addDepartment(Department department) {
        if (departmentNum < MAX_DEPARTMENT_NUM) {
            // add the department
            departments[departmentNum] = department;
        } else {
            // reached capacity
            System.out.printf("There are %d departments already. Add department failed.", MAX_DEPARTMENT_NUM);
        }
    }

    /**
     * Displays all departments of the school system
     *
     * @author Geny Tang
     */
    public void printDepartments() {
        for (Department department : departments) {
            if (department != null) {
                System.out.println(departments);
            }
        }
    }

    /**
     * Confirms whether a course exists in the school system.
     *
     * @return returns null if the course does not exist.
     * @author Geny Tang
     */
    public Course findCourse(String id) {
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                return course;
            }
        }
        // course not found
        return null;
    }

    /**
     * Registers a student to a certain course of the school system
     *
     * @author Geny Tang
     */
    public void registerCourse(String studentId, String courseId) {
        Student student = findStudent(studentId);
        Course course = findCourse(courseId);

        // Check if both exist
        if (student == null || course == null) {
            System.out.println("Student or course does not exist, ID not found.");
            return;
        }

        // Maxed courses?
        if (student.getCourseNum() >= MAX_COURSES_PER_STUDENT) {
            System.out.println("Student has already registered the max number of courses.");
            return;
        }

        // Maxed students?
        if (course.getStudentNum() >= MAX_STUDENTS_PER_COURSE) {
            System.out.println("Course already has the max number of students.");
        }

        // Register a student to a course
        student.registerCourse(course);
        System.out.println("Course successfully registered for student.");
    }

    /**
     * Adds a course into a department of the school system.
     *
     * @author Geny Tang
     */
    public void addCourse(Course course) {
        if (courseNum < MAX_COURSE_NUM) {
            // add the course
            courses[courseNum] = course;
        } else {
            // reached the capacity
            System.out.printf("There are %d courses already. Add course failed.", MAX_COURSE_NUM);
        }
    }

    /**
     * Displays all courses of the school system
     *
     * @author Geny Tang
     */
    public void printCourses() {
        for (Course course : courses) {
            if (course != null) {
                System.out.println(courses);
            }
        }
    }

    /**
     * Confirms whether a teacher exists in the school system.
     *
     * @return returns null if the teacher does not exist.
     * @author Geny Tang
     */
    public Teacher findTeacher(String id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(id)) {
                return teacher;
            }
        }
        // teacher not found
        return null;
    }

    /**
     * Modifies the teacher of a course of the school system.
     *
     * @author Geny Tang
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        Teacher teacher = findTeacher(teacherId);
        Course course = findCourse(courseId);

        if (teacher != null && course != null) {
            // modifying teacher of a course
            course.setTeacher(teacher);
            System.out.println("Successfully modified teacher of the course.");
        } else {
            System.out.println("Failed to modify teacher of the course. Given ID not found.");
        }
    }

    /**
     * Adds a teacher into a course of the school system.
     *
     * @author Geny Tang
     */
    public void addTeacher(String firstName, String lastName, Department department, String id) {
        if (teacherNum < MAX_TEACHER_NUM) {
            // add the teacher
            teachers[teacherNum] = new Teacher(firstName, lastName, department, id);
        } else {
            System.out.printf("There are %d teachers already. Add teacher failed.", MAX_TEACHER_NUM);
        }
    }

    /**
     * Displays all teachers of the school system.
     *
     * @author Geny Tang
     */
    public void printTeachers() {
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teachers);
            }
        }
    }

    /**
     * Confirms whether a student exists in the school system.
     *
     * @return returns null if a student does not exist.
     * @author Geny Tang
     */
    public Student findStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        // student not found
        return null;
    }

    /**
     * Adds a student into the school system.
     *
     * @author Geny Tang
     */
    public void addStudent(Student student) {
        if (studentNum < MAX_STUDENT_NUM) {
            // add the student
            students[studentNum] = student;
        } else {
            // reached capacity
            System.out.printf("There are %d students already. Add student failed.", MAX_STUDENT_NUM);
        }
    }

    /**
     * Displays all students of the school system.
     *
     * @author Geny Tang
     */
    public void printStudents() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(students);
            }
        }
    }
}

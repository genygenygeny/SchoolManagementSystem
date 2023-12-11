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

    public SchoolManagementSystem() {
        this.departments = new Department[MAX_DEPARTMENT_NUM];
        this.departmentNum = 0;
        this.students = new Student[MAX_STUDENT_NUM];
        this.studentNum = 0;
        this.teachers = new Teacher[MAX_TEACHER_NUM];
        this.teacherNum = 0;
        this.courses = new Course[MAX_COURSE_NUM];
        this.courseNum = 0;
    }

    /**
     * Confirms whether a department exists in the school system.
     *
     * @return returns null if the department does not exist.
     * @author Geny Tang
     */
    public Department findDepartment(String id) {
        for (Department department : departments) {
            if (department != null && department.getId().equals(id)) {
                return department;
            }
        }
        return null;
    }

    /**
     * Adds a department into the school system.
     * If the max department has been reached then adding a new department failed.
     *
     * @author Geny Tang
     */
    public void addDepartment(String departmentName) {

        if (departmentNum < MAX_DEPARTMENT_NUM) {
            departments[departmentNum] = new Department(departmentName);
            System.out.println("Add" + departments[departmentNum] + " successfully.");
            departmentNum++;
        } else {
            System.out.println("Max departments reached, add a new department failed.");
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
                System.out.println(department);
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
            if (course != null && course.getId().equals(id)) {
                return course;
            }
        }
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

        if (student == null) {
            System.out.println("Cannot find student.");
            return;
        }

        if (course == null) {
            System.out.println("Cannot find course.");
        }

        if (student.getCourseNum() >= MAX_COURSES_PER_STUDENT) {
            System.out.println("Student has already registered the max number of courses.");
            return;
        }

        if (course != null && course.getStudentNum() >= MAX_STUDENTS_PER_COURSE) {
            System.out.println("Course already has the max number of students.");
            return;
        }

        student.registerStudentCourse(course);
        System.out.println("Course successfully registered for student.");
        if (course != null) {
            course.registerCourseStudent(student);
        }
        System.out.println("Student successfully registered for course.");
    }

    /**
     * Adds a course into a department of the school system.
     *
     * @author Geny Tang
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        Department department = findDepartment(departmentId);

        if (department != null) {
            if (courseNum < MAX_COURSE_NUM) {
                courses[courseNum] = new Course(courseName, credit, department);
                System.out.println("Add" + courses[courseNum] + " successfully.");
                courseNum++;
            } else {
                System.out.println("Max courses reached, add a new course failed.");
            }
        } else {
            System.out.println("Department does not exist.");
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
                System.out.println(course);
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
            if (teacher != null && teacher.getId().equals(id)) {
                return teacher;
            }
        }
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
    public void addTeacher(String firstName, String lastName, String departmentId) {
        Department department = findDepartment(departmentId);

        if (department != null) {
            if (teacherNum < MAX_TEACHER_NUM) {
                teachers[teacherNum] = new Teacher(firstName, lastName, department);
                System.out.println("Add" + teachers[teacherNum] + " successfully.");
                teacherNum++;
            } else {
                System.out.println("Max teachers reached, add a new teacher failed.");
            }
        } else {
            System.out.println("Department does not exist");
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
                System.out.println(teacher);
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
            if (student != null && student.getId().equals(id)) {
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
    public void addStudent(String firstName, String lastName, String departmentId) {
        Department department = findDepartment(departmentId);

        if (department != null) {
            if (studentNum < MAX_STUDENT_NUM) {
                students[studentNum] = new Student(firstName, lastName, department);
                System.out.println("Add" + students[studentNum] + " successfully.");
                studentNum++;
            } else {
                System.out.println("Max students reached, add a new student failed.");
            }
        } else {
            System.out.println("Department does not exist.");
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
                System.out.println(student);
            }
        }
    }
}

package sit707_tasks;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println("Student enrolled successfully!");
    }

    public List<Student> viewStudents() {
        return students;
    }

    public void removeStudent(String studentId) {
        Student toRemove = null;
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                toRemove = student;
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }
}
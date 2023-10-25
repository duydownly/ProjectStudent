package demo;
import java.util.ArrayList;

public class StudentInformationSystem {
    private ArrayList<Student> studentList;

    public StudentInformationSystem() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            studentList.add(student);
            System.out.println("Student added: " + student.toString());
        } else {
            System.out.println("Error: Student object is null and cannot be added.");
        }
    }

    public void printStudentList() {
        if (studentList.isEmpty()) {
            System.out.println("Student list is empty.");
        } else {
            System.out.println("List of Students:");
            for (Student student : studentList) {
                System.out.println(student.toString());
            }
        }
    }
    public void deleteStudent(Student student) {
        if (studentList.contains(student)) {
            studentList.remove(student);
            System.out.println("Student deleted: " + student.toString());
        } else {
            System.out.println("Error: Student not found in the system.");
        }
    }
}


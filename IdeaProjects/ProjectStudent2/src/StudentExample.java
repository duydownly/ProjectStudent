public class StudentExample {

    public static void main(String[] args) {
        StudentExample studentExample = new StudentExample();
        studentExample.firstMethod();
    }

    public void firstMethod() {
        System.out.println("Entering firstMethod");

        // Creating a student
        Student student = new Student(1, "John", 85.5);

        // Calling the second method
        secondMethod(student);

        System.out.println("Exiting firstMethod");
    }

    public void secondMethod(Student student) {
        System.out.println("Entering secondMethod");

        // Creating another student
        Student anotherStudent = new Student(2, "Jane", 92.0);

        // Displaying information about the students
        System.out.println("Student in firstMethod: " + student);
        System.out.println("Student in secondMethod: " + anotherStudent);

        System.out.println("Exiting secondMethod");
    }
}

class Student {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + '}';
    }
}

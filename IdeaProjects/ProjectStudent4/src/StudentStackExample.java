import java.util.Stack;

public class StudentStackExample {
    public static void main(String[] args) {
        // Create a stack to hold Student objects
        Stack<Student> studentStack = new Stack<>();

        // Check if the stack is empty
        if (studentStack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        // Create a Student object and push it onto the stack
        Student student1 = new Student(1, "John", 3.8);
        studentStack.push(student1);

        // Check if the stack is empty after pushing an element
        if (studentStack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }
}

class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
}

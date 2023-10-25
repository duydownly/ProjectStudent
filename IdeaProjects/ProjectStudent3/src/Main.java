// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
            Student student1 = new Student(1, "John", 3.8);
            Student student2 = new Student(2, "Jane", 3.9);
        Stack<Student> studentStack = new Stack<>();

//            System.out.println("Student 1:");
//            student1.displayInfo();
//            System.out.println("Student 2:");
//            student2.displayInfo();
        studentStack.push(student1);
        studentStack.push(student2);
        // Pop the top student from the stack
//        Student topStudent = studentStack.pop();
        Student topStudent = studentStack.peek();

        // Display information about the peeked student
        System.out.println("Peeked Student:");
        System.out.println(topStudent);

        // The stack remains unchanged
        System.out.println("Stack after peek operation: " + studentStack);

        // Display the stack after pushing students
        System.out.println("Stack after push operations: " + studentStack);
    }
}
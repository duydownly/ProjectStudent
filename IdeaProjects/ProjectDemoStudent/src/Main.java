// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StudentInformationSystem sis = new StudentInformationSystem();

        // Add students to the system
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        Student student3 = new Student("Charlie", 103);

        sis.addStudent(student1);
        sis.addStudent(student2);
        sis.addStudent(student3);

        // Print the list of students
        sis.printStudentList();
        // Continuing from the Main class

// Add more students
        Student student4 = new Student("David", 104);
        Student student5 = new Student("Eva", 105);
        sis.addStudent(student4);
        sis.addStudent(student5);

// Print the list before deletion
        sis.printStudentList();

// Delete a student
        sis.deleteStudent(student2);

// Print the updated list after deletion
        sis.printStudentList();

    }
}
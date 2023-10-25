import java.util.Stack;

public class StudentInformationSystem {
    private static final int MAX_STUDENTS = 100;
    private Student[] students;
    private Stack<String> operationStack;

    public StudentInformationSystem() {
        this.students = new Student[MAX_STUDENTS];
        this.operationStack = new Stack<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            for (int i = 0; i < MAX_STUDENTS; i++) {
                if (students[i] == null) {
                    students[i] = student;
                    operationStack.push("Added student: " + student.name);
                    return;
                }
            }
        }
    }

    public void printStudentList() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public void undoLastOperation() {
        if (!operationStack.isEmpty()) {
            String lastOperation = operationStack.pop();
            System.out.println("Undoing operation: " + lastOperation);
        } else {
            System.out.println("No operations to undo.");
        }
    }

    public static void main(String[] args) {
        StudentInformationSystem sis = new StudentInformationSystem();

        // Adding students
        sis.addStudent(new Student(1, "Alice", 90.5));
        sis.addStudent(new Student(2, "Bob", 85.0));
        sis.addStudent(new Student(3, "Charlie", 75.2));

        // Print the student list
        System.out.println("Student List:");
        sis.printStudentList();

        // Undo the last operation
        sis.undoLastOperation();

        // Print the student list after undo
        System.out.println("Student List after Undo:");
        sis.printStudentList();
    }
}

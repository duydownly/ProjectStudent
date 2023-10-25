class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Getter methods for name and studentId

    @Override
    public String toString() {
        return "Student [Name: " + name + ", ID: " + studentId + "]";
    }
}

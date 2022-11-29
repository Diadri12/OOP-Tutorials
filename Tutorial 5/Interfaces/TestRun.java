package Interfaces;

public class TestRun {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Printing Student Details");
        student.print();
        Letter letter = new Letter();
        System.out.println("Printing Letter");
        letter.print();
    }
}

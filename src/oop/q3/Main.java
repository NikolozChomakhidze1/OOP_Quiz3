package oop.q3;

public class Main {
    public static void main(String[] args) {
        // Create university
        University uni = new University();

        // Create students
        Student me = new Student("Nikoloz", "Chomakhidze", "Georgia", "");
        Student friend1 = new Student("Anna", "Smith", "USA", "Likes Math");
        Student friend2 = new Student("John", "Doe", "Canada", "Plays football");

        // Add students to university
        uni.addStudent(me);
        uni.addStudent(friend1);

        // Print students
        System.out.println("Students in university:");
        uni.printStudents();

        // Test getStudentInfoStrange
        System.out.println("\nInfo for me (in uni):");
        System.out.println(uni.getStudentInfoStrange(me));

        System.out.println("\nInfo for me (not in uni):");
        uni.removeStudent(me);
        System.out.println(uni.getStudentInfoStrange(me));

        System.out.println("\nInfo for friend1:");
        System.out.println(uni.getStudentInfoStrange(friend1));

        System.out.println("\nInfo for friend2 (not in uni):");
        System.out.println(uni.getStudentInfoStrange(friend2));
    }
}

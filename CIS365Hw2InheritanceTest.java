// Inheritance Test by Domenic Eaton

public class CIS365Hw2InheritanceTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("John", 18, "Computer Science");

        System.out.println("Student 1: " + student1.toString());
        System.out.println("Student 2: " + student2.toString());

        student1.setName("Mary");
        student1.setAge(22);
        student1.setMajor("Math");

        student2.setMajor("Computer Science");

        System.out.println("******** After change ********");

        System.out.println("Student 1: " + student1.toString());
        System.out.println("Student 2: " + student2.toString());

        student1.greeting();
    }
}

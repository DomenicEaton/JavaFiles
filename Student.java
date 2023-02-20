// Student.java by Domenic Eaton

public class Student extends Human {
    private String major;

    public Student() {
        super();
        major = "no major";
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void greeting() {
        System.out.println("Hello, I am a Student, and my name is " + getName());
    }

    @Override
    public String toString() {
        return getName() + ", " + getAge() + " years old, " + major;
    }
}

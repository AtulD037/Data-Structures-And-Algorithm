package A_Java_Interview_Programs.Student;

public class Student {

    private String name;
    private int rollNo;
    private int marks;
    private int age;

    public Student(String name, int rollNo, int marks, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }
}

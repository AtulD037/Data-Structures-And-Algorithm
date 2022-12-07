package A_Java_Interview_Programs.Student;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Atul",1,90,15);
        Student s2 = new Student("Ankit",2,80,15);
        Student s3 = new Student("Bharat",3,70,15);
        Student s4 = new Student("Chirag",4,60,15);
        Student s5 = new Student("Nishant",5,50,15);

        // add all the student object to arraylist

        ArrayList<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println("Total students : "+list.size());

        for (Student student:
             list) {
            System.out.println(student);
        }

        System.out.println("\n Marks Greater than 80");

        list.stream().filter(student -> student.getMarks()>=80).forEach(student -> System.out.println(student.getName()+" : "+student.getMarks()));

        System.out.println("Highest Marks");

        int hm = list.stream().map(e->e.getMarks()).max(Integer::compare).get();
        System.out.println(hm);

        list.stream().filter(student -> student.getMarks()==hm).forEach(student -> System.out.println(student));
    }
}

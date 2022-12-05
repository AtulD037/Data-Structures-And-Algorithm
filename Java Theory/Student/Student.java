package Student;

public class Student {
    int rollNo;
    String name;
    float fee;


    public Student(int rollNo, String name, float fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }

    void display(){
        System.out.println(rollNo+" "+name+" "+fee);
    }

}

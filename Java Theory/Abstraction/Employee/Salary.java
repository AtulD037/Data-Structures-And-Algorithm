package Abstraction.Employee;

public class Salary extends Employee{

    private double salary; // Annual Salary

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    public void mailCheck(){
        System.out.println("Within Mail check of salary class");
        System.out.println("Mailing check to "+getName()+" with salary "+salary);
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double newSalary){
        if (newSalary>0.0){
            salary = newSalary;
        }
    }
    public double computePay(){
        System.out.println("Computing Salary pay for : "+getName());
        return salary/52;
    }
}

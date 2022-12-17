package Recursion;

public class NumbersExample {
    public static void main(String[] args) {
        // Write a function that takes a number and print it
        // Print first 5 numbers : 1 2 3 4 5
        print(1);

    }
    static void print(int n){
     if (n==5){
         System.out.println(n);
         return;
     }
        System.out.println(n);
        print(n+1);
    }
}

package Recursion;

public class Main {

    public static void main(String[] args) {
        // Write a function that print hello world
        message();

    }
    private static void message() {
        message1();
        System.out.println("hello World");
    }
    private static void message1() {
        System.out.println("hello World");
        message2();
    } private static void message2() {
        System.out.println("hello World");
        message3();
    } private static void message3() {
        System.out.println("hello World");
        message4();
    } private static void message4() {
        System.out.println("hello World");
        message5();
    } private static void message5() {
        System.out.println("hello World");
    }

}

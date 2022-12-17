package Recursion.Level1;

public class PrintNumberFromNto1 {
    public static void main(String[] args) {
        int n =7;
        printNum(n);
    }
    static void printNum(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

}

// Fibonacci Series

public class Fibonacci {

    public static void fibSeries(int n){
        int num_1 = 0;
        int num_2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(num_1+" ");
            int num3 = num_1+num_2;
            num_1=num_2;
            num_2=num3;
        }
    }

    public static void main(String[] args) {
        int n = 13;
        fibSeries(n);
    }

}
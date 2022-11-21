// Find list of prime numbers b/w 1 to n

import java.util.Arrays;

public class PrimeNumber{

    // Brute Force Approach
    private static void listprime(int n){
        if (n==0||n==1){
            System.out.println("Invalid Entry");
        }
        int count;
        for (int i = 2; i <= n; i++) {
            count=0;
            for (int j = 1; j <= i ; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i + " ");
            }
        }
    }

    // Using Sieve of Eratosthenes

    private static void sievePrime(int n){
        // Take an array of boolean
        boolean[] bool = new boolean[n];

        // Make every index position true
        Arrays.fill(bool, true);
//        System.out.println(Arrays.toString(bool));

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (bool[i]==true){
                for (int j = (i*i); j < n; j=j+i) {
                    bool[j]=false;
                }
            }
        }
//        System.out.println(Arrays.toString(bool));
        for (int i = 2; i < bool.length; i++) {
            if (bool[i]==true){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 50;
//        listprime(n);
        sievePrime(n);
    }
}

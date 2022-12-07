package A_Java_Interview_Programs;

import java.util.regex.Pattern;

public class BinaryNumberCheck {

    public static void isBinaryNumber(int number){
        boolean isBinary = true;

        int copyNumber = number;
        while (copyNumber!=0){
            int rem = copyNumber%10;
            if (rem>1){
                isBinary = false;
                break;
            }
            else {
                copyNumber = copyNumber/10;
            }
        }
        if (isBinary){
            System.out.println(number+" is a binary Number");
        }
        else {
            System.out.println(number+" is not a binary number");
        }
    }

    public static void main(String[] args) {
        isBinaryNumber(1011);
        isBinaryNumber(123);
    }

}

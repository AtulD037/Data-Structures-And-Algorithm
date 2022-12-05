package A_Java_Interview_Programs;

// Print Numbers from 0 to 100 Without Using Numeric value
public class NumberPrintRangeWithoutUsingNumericValue {

        public static void main(String[] args) {

                int one = 'A'/'A';
                String s = "..........";

            for (int i = 1; i <= s.length()*s.length(); i++) {
                System.out.print(i+" ");
                if (i%10==0){
                    System.out.println();
                }
            }

        }

}

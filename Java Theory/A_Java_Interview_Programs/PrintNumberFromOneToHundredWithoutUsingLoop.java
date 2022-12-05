package A_Java_Interview_Programs;

import java.util.stream.IntStream;

// Print Numbers From One To Hundred Without Using Loop
public class PrintNumberFromOneToHundredWithoutUsingLoop {

    public static void main(String[] args) {
        printNum(1);
        printRange(50,60);
        IntStream.range(1,101).forEach(System.out::println);
    }

    public static void printNum(int num){
        if (num<=100){
            System.out.print(num+" ");
            num++;
            printNum(num);
        }
    }

    public static void printRange(int startNum,int endNum){
       if (startNum<=endNum){
           System.out.println(startNum);
           startNum++;
       printRange(startNum,endNum);
       }
    }

}

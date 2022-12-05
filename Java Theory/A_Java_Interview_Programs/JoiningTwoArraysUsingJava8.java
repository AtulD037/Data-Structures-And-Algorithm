package A_Java_Interview_Programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoiningTwoArraysUsingJava8 {

    public static void main(String[] args) {
        String[] batsmen = {
                "Rohit",
                "Kohli",
                "Dhawan",
                "Shreyas",
                "Rishabh",
                "Shubham"
        };

        String[] bowler = {
                "Hardik",
                "Bhuvi",
                "Bumrah",
                "Chahal",
                "Jaddu"
        };

        Stream<String> sBat = Arrays.stream(batsmen);
        Stream<String> sBow = Arrays.stream(bowler);

        String[] fullteam = Stream.concat(sBat,sBow).toArray(String[]::new);

        System.out.println(Arrays.toString(fullteam));
    }


}

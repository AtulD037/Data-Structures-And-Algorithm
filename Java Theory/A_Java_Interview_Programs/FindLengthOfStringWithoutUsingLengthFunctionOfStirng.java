package A_Java_Interview_Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindLengthOfStringWithoutUsingLengthFunctionOfStirng {

    static void length(String s){
        System.out.println(s.toCharArray().length);
        System.out.println(s.lastIndexOf(""));

        Matcher match = Pattern.compile("$").matcher(s);
        match.find();
        int find = match.end();
        System.out.println(find);
    }

    public static void main(String[] args) {
        String name = "Atul";
        length(name);
    }

}

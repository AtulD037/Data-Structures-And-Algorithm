package A_Java_Interview_Programs;

import java.util.Locale;

public class VowelCountsUsingStream {

    public static void main(String[] args) {
        String str = "Quick Brown Fox Jumps Over Lazy Dog";
        str = str.toLowerCase(Locale.ROOT);
        long count = str.chars().filter(value -> (char)value=='a'||
                (char)value=='e'||
                (char)value=='i'||
                (char)value=='o'||
                (char)value=='u').count();

        System.out.println(count);
    }

}

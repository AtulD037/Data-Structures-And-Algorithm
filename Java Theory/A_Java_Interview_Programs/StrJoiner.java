package A_Java_Interview_Programs;

import java.util.StringJoiner;

public class StrJoiner {

    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",","[","]");

        joiner.add("Tom")
                .add("Jerry")
                .add("Lisa")
                .add("Atul");

        System.out.println(joiner.toString());
    }

}

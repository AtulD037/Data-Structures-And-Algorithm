package A_Java_Interview_Programs;

public class NumberOfOccurencesOfCharacterUsingJavaStreams {

    public static void main(String[] args) {
        String str = "Testing Solutions";

        long count = str.chars().filter(e->(char)e=='i' || (char)e=='s').count();

        System.out.println(count);
    }

}

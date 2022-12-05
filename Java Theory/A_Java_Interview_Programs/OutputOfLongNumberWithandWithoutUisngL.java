package A_Java_Interview_Programs;

public class OutputOfLongNumberWithandWithoutUisngL {
    public static void main(String[] args) {
        long l1 = 1000*60*60*24*365;
        long l2 = 1000*60*60*24*365L;

        System.out.println(l1);
        System.out.println(l2);
    }
}

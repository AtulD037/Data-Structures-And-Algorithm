package A_Java_Interview_Programs;

import javax.naming.InsufficientResourcesException;

public class IntegerCachingDemo {

    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;

        System.out.println(a==b);

        Integer c = 167;
        Integer d = 167;

        System.out.println(c==d);

    }

}

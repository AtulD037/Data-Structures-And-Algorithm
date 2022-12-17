package String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Atul Dhiman";
        char[] arr = name.toCharArray();
        System.out.println(arr);
        System.out.println(name.indexOf('A'));
        System.out.println("      atul    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}

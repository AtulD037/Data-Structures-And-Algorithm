package String;


public class Comparison {
    public static void main(String[] args) {
        String a = "Atul";
        String b = "Atul";
        String c =a ;

        System.out.println(a==b);

        String name1 = new String("Atul Dhiman");
        String name2 = new String("Atul Dhiman");

        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));
        System.out.println(c==a);
        System.out.println(c==b);
    }

}

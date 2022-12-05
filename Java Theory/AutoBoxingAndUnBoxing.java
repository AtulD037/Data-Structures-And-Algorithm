public class AutoBoxingAndUnBoxing {

    public static void main(String[] args) {
        // AutoBoxing
        int a = 20;
        Integer j = Integer.valueOf(a);
        System.out.println("AutoBoxing "+j);

        // Unboxing
        Integer x =  Integer.valueOf(3);
        int y = x.intValue();
        System.out.println("Unboxing "+y);
    }

}

package A_Java_Interview_Programs;

public class PrivateConstructor {
    private PrivateConstructor(){

    }

    static {
        PrivateConstructor privateConstructor = new PrivateConstructor();
    }

    public static void consCall(){
        PrivateConstructor privateConstructor = new PrivateConstructor();
    }

    public static void main(String[] args) {

    }
}

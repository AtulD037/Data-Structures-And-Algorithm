package A_Java_Interview_Programs;

public class SubstringIsPresent {

    public static boolean isSubstring(String main, String sub){
        return main.matches("(.*)"+sub+"(.*)");
    } public static boolean isSubstring1(String main, String sub){
        return main.contains(sub);
    } public static boolean isSubstring2(String main, String sub){
        return main.indexOf(sub)!=-1;
    }

    public static void main(String[] args) {
        System.out.println(isSubstring("naveen automation labs","labs"));
        System.out.println(isSubstring1("naveen automation labs","labs"));
        System.out.println(isSubstring2("naveen automation labs","labs"));
    }

}

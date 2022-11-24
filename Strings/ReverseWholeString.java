public class ReverseWholeString {

    static void reverseEveryChar(String string){
        String reverse = "";
        for (int i = 0; i < string.length(); i++) {
            reverse= string.charAt(i)+reverse;
        }
        System.out.println(reverse);
    }

    static String reverseUsingInbuiltMethods(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String string = "My name is Atul Dhiman";
        reverseEveryChar(string);
        System.out.println(reverseUsingInbuiltMethods(string));
    }



}

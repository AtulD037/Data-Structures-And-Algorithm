package String;

public class PalindromeProgram {
    public static void main(String[] args) {
        String s = "";
    }

    static boolean isPalindrome(String str){

        if (str==null|| str.length()==0){
            return true;
        }

        for (int i = 0; i < str.length()/2; i++) {

            char start = str.charAt(0);
            char end = str.charAt(str.length()-1);

            if (start!=end) return false;

        }
        return true;
    }
}

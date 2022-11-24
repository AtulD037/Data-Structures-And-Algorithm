public class CheckWetherAStringIsPalindrome {

    static boolean palindromeCheck(String str){

        StringBuilder sb = new StringBuilder(str);
        String reversestr = sb.reverse().toString();

        return str.equals(reversestr);
    }

    public static void main(String[] args) {
        String madam = "madam";
        System.out.println(palindromeCheck(madam));
        System.out.println(palindromeCheck("atul"));
        System.out.println(palindromeCheck("racecar"));


    }

}

// Find number of special Characters
public class FindSpecialCharacterInString {

    public static void findSpecialChar(String string){

        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))
                    && !Character.isLetter(string.charAt(i))
                    && !Character.isWhitespace(string.charAt(i))){
                count++;
            }
        }
        if (count>0){
            System.out.println("There are "+count +" special character in given string");
        }
        else {
            System.out.println("No special character in the string");
        }

    }

    public static void main(String[] args) {
        String str = "afnk#$^^#^@^lnl";
        findSpecialChar(str);
    }

}

public class CapitalizeEachFirstLetterInParagraph {

    static String capitalize(String str){

        String capstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i==0 || capstr.charAt(i-1)== ' '){
                capstr+=Character.toUpperCase(str.charAt(i));
            }
            else {
                capstr+=str.charAt(i);
            }
        }
        return capstr;
    }


    public static void main(String[] args) {
        String str = "the quick brown fox jumps over lazy dog";
        System.out.println(capitalize(str));
    }

}

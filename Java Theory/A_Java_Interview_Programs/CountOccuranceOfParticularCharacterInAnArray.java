package A_Java_Interview_Programs;

public class CountOccuranceOfParticularCharacterInAnArray {

    public static void main(String[] args) {
        String s = "I love coding";
//        count(s,'o');
//        getCharCount(s,'o');

        long count=s.chars().mapToObj(e->String.valueOf((char) e)).filter(e->e.equals("i")).count();
        System.out.println(count);
    }

    public static void count(String sentence,char val){

        char[] chars = sentence.toCharArray();

        int count = 0;
        for (char ch:
             chars) {
            if (ch==val){
                count++;
            }
        }

        System.out.println(val+":"+count);
    }

    private static void getCharCount(String str,char val){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==val){
                count++;
            }
        }
                System.out.println(val+":"+count);
    }


}

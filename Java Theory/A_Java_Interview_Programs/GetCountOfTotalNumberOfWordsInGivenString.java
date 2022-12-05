package A_Java_Interview_Programs;


public class GetCountOfTotalNumberOfWordsInGivenString {

    public static void main(String[] args) {
        String str = "NaveenAutomationLabYoutubeAutomationTesting";

        // Method - 1
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                count++;
            }
        }
        System.out.println("Number of letters in String are : "+count);


        // Method - 2
        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>=65 && str.charAt(i) <=90){
                count1++;
            }
        }
        System.out.println("Number of letters in String are : "+count1);

        // Method- 3
        int count2= 0 ;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                count2++;
            }
        }
        System.out.println("Number of letters in String are : "+count2);

        // Method -3 using streams

        long count4 = str.chars().filter(value -> value>='A'&&value<='Z').count();
        System.out.println(count4);

        long count5 = str.chars().filter(Character::isUpperCase).count();
        System.out.println(count5);

    }

}

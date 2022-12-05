package A_Java_Interview_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintCountOfDuplicateCharactersFromString {

    static void duplicateCharacter(String sentence){

        if (sentence==null){
            System.out.println("Null String");
        }
        if (sentence.isEmpty()){
            System.out.println("String is Empty");
        }
        if (sentence.length()==1){
            System.out.println("String has only one character");
        }

        char[] words = sentence.toCharArray();

        Map<Character,Integer> charmap = new HashMap<>();

        for (Character ch:
             words) {
            if (charmap.containsKey(ch)){
                charmap.put(ch,charmap.get(ch)+1);
            }
            else {
                charmap.put(ch,1);
            }
        }
        System.out.println(charmap);

        Set<Map.Entry<Character,Integer>> entrySet = charmap.entrySet();

        for (Map.Entry<Character,Integer> entry:
             entrySet) {
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + ":" +entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String sentence = "naveen";
        duplicateCharacter(sentence);
    }

}

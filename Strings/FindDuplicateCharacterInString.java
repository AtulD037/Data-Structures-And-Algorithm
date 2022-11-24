import java.util.*;

public class FindDuplicateCharacterInString {

    public static void findDuplicates(String str){

        Map<Character,Integer> hmap = new HashMap<>();

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            if (hmap.containsKey(charArray[i])){
                hmap.put(charArray[i],hmap.get(charArray[i])+1);
            }
            else {
                hmap.put(charArray[i],1);
            }

        }
        System.out.println(hmap);

    }

    public static void main(String[] args) {
        findDuplicates("AABBCCCCCCADFG");
    }
}

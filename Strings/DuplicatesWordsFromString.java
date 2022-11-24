import java.util.*;

public class DuplicatesWordsFromString {


    // Print Duplicates
    public static void printDuplicates(String string){

        String[] str = string.split(" ");

        HashMap<String,Integer> hmap = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            if (hmap.containsKey(str[i])){
                Integer count = hmap.get(str[i]);
                hmap.put(str[i],count+1);
            }
            else {
                hmap.put(str[i],1);
            }
        }

        System.out.println(hmap);

    }

    // Remove Duplicates

    public static void removeDuplicates(String string){
        String[] str = string.split(" ");

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < str.length; i++) {
            if (hashSet.contains(str[i])){
                continue;
            }
            else
                hashSet.add(str[i]);
        }

        System.out.println(hashSet);
    }

    public static void main(String[] args) {
        String string = "Atul atul atul dhiman dhiman a a a name name name q e jkl";
        printDuplicates(string);
        removeDuplicates(string);
    }
}

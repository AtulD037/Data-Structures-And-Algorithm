package A_Java_Interview_Programs;


import java.util.*;

public class DuplicateWordsInString {

    public static void duplicatesBruteForce(String sentence){
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            int count = 1;
            for (int j = i+1; j < words.length; j++) {
                if (words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }

            if (count>1 && words[i]!="0"){
                System.out.println(words[i]);
            }
        }


    }

    public static void duplicateHashMap(String sentence){
        String[] words = sentence.split(" ");

        HashMap<String,Integer> hmap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (hmap.containsKey(words[i])){
                Integer count = hmap.get(words[i]);
                hmap.put(words[i],count+1);
            }
            else hmap.put(words[i],1);
        }
        System.out.println(hmap);
    }

    public static void removeDuplicatesHashMap(String sentence){
        String[] words = sentence.split(" ");

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            if (hashSet.contains(words[i])){
                continue;
            }
            else hashSet.add(words[i]);
        }
        System.out.println(hashSet);
        ArrayList<String> list= new ArrayList<>(hashSet);

        // Sorting the hashset by converting it into arrayList

        Collections.sort(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        String sentence = "My name name name is is is is is is Atul atul atul atul atul";
        duplicatesBruteForce(sentence);
        duplicateHashMap(sentence);
        removeDuplicatesHashMap(sentence);
    }
}

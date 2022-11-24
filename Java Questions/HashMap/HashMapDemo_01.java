package HashMap;

import java.util.HashMap;

public class HashMapDemo_01 {

    public static void main(String[] args) {

        HashMap<Integer,String> m = new HashMap<>();

        m.put(101,"John");
        m.put(102,"David");
        m.put(103,"Scott");
        m.put(104,"Mary");
        m.put(105,"Tye");
        m.put(106,"X");

        System.out.println(m);          // {101=John, 102=David, 103=Scott, 104=Mary, 105=Tye, 106=X}
        System.out.println(m.get(105)); //Tye
        m.remove(103);              // Remove Scott
        System.out.println(m);          // {101=John, 102=David, 104=Mary, 105=Tye, 106=X}

        System.out.println(m.containsKey(101)); // True

        System.out.println(m.containsValue("David")); // True

        System.out.println(m.isEmpty());

        // To get All Entries as a set

        System.out.println(m.entrySet()); //[101=John, 102=David, 104=Mary, 105=Tye, 106=X]



    }

}

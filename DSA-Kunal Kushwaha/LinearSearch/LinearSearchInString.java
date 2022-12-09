package LinearSearch;

public class LinearSearchInString {

    public static void search(String str, char key){
        if (str.length()==0||str.length()==1){
            System.out.println("Invalid String or Only one Character is there");
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==key){
                System.out.println(key+" is present at " +i +"th index");
            }
        }
    }

    public static void main(String[] args) {
        String name = "Atul Dhiman";

        search("Atul Dhiman",'i');
    }

}

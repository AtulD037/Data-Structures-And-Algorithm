public class ReverseAStingPreservingLetters {

    static void reverse(String string){
        String[] str = string.split(" ");

        for (int i = str.length-1; i >=0 ; i--) {
            System.out.print(str[i]+ " ");
        }

        System.out.println();
        int start = 0;
        int end = str.length-1;

        while (start<end){
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+ " ");
        }
    }

    public static void main(String[] args) {
        String string = "My name is Atul Dhiman";
        reverse(string);
    }
}

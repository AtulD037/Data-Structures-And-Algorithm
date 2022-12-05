public class RotationOfStringIsPresent {

    // ABCD , CDAB

    public static boolean isrotation(String str1, String str2){
        boolean flag= false;
     if (str1.length()!= str2.length()){
         return flag;
     }

     if ((str1+str1).contains(str2)){
         return !flag;
     }
        return flag;
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        System.out.println(isrotation(str1,str2));
        if (isrotation(str1,str2)==true){
            System.out.println("Rotation is present");
        }
        else System.out.println("Rotation Not Found");


    }
}

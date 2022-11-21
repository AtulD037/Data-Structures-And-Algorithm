public class LeaderInAnArray {
    static void leader(int[] array){

        for (int i = 0; i < array.length; i++) {
            int j;
            for (j = i+1; j < array.length; j++) {
                if (array[j]>=array[i]){
                    break;
                }
            }
            if (j==array.length){
                System.out.println("Leader is : "+array[i]);
            }
        }
    }

    static void leaderRight(int[] array){
        int mfr = array[array.length-1];
        System.out.println("Leader is "+mfr);

        for (int i = array.length-2; i >=0 ; i--) {
            if (array[i]>mfr){
                System.out.println("Leader is "+array[i]);
                mfr=array[i];
            }

        }
    }


    public static void main(String[] args) {
        int[] array={15,16,3,6,2,1,4};
        leader(array);
        leaderRight(array);
    }
}

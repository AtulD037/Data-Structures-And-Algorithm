public class MajorityElementInAnArray {

    public static int major(int[] array){
        for (int i = 0; i < array.length; i++) {
            int count=0;
            for (int j = 0; j < array.length; j++) {
                if (array[i]==array[j]){
                    count++;
                }
                if(count>array.length/2){
                    return array[i];
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array ={1,2,4,2,2,4,3,2,3,2,2};
        int[] array2 = {6,6,3,2,1,3,3,2,3,2,3};
        System.out.println(major(array));
        System.out.println(major(array2));
    }

}

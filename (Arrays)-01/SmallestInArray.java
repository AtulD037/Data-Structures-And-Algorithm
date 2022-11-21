public class SmallestInArray {


    public static void smallest(int[] array){
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i]<smallest){
                smallest = array[i];
            }
        }
        System.out.println(smallest);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,0};
        smallest(array);
    }
}

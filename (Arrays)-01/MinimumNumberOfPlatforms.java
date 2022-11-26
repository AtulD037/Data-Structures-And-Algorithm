public class MinimumNumberOfPlatforms {

    public static int platform(int[] arr,int[] dep){

        // plat_needed indicates Number of platform needed at a time

        int plat_needed = 1; int result =1;

        // run loop to find the overlap
        for (int i = 0; i < arr.length; i++) {
            plat_needed =1;
            for (int j = 0; j < arr.length; j++) {
                if (i!=j){
                    if (arr[i]>=arr[j] && dep[j]>=arr[i]){
                        plat_needed++;
                    }
                }
            }
            result = Math.max(result,plat_needed);
        }
        return result;
   }

    public static void main(String[] args) {
        int[] arr= { 100, 300, 500 };
        int[] dep = { 900, 400, 600 };
        System.out.println(platform(arr,dep));;
    }

}

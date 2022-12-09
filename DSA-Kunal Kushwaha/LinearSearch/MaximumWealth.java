package LinearSearch;
/*You are given an m x n integer grid accounts where accounts[i][j] is the amount of
 money the is customer has in the  bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth*/
public class MaximumWealth {
    public static int maximumWealth(int[][] accounts)  {
        int ans = Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum = 0;
            for(int account=0;account<accounts[person].length;account++){
                sum += accounts[person][account];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
}

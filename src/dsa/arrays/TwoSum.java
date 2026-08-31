package dsa.arrays;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int arr[], int target){
        int n = arr.length;
        int ans[] = {};
        for(int i = 0; i <= n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    //ans = new int[]{arr[i], arr[j]}; for value
                    ans = new int[]{i, j};//for index
                   // return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {2, 1, 3, 5, 4, 6};
        int target = 9;
        //System.out.println(Arrays.toString(TwoSum.twoSum(a, target)));
        System.out.println(Arrays.toString(twoSum(a, target)));
    }
}

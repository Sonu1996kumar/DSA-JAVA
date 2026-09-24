package dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int arr[], int target){
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n-3; i++){
            for(int j = i+1; j<n-2; j++){
                for(int k = j+1; k<n-1; k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);

                        result.add(temp);
                    }
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,11,12,13};
        int target = 11;
        System.out.println(threeSum(num,target));
    }

}

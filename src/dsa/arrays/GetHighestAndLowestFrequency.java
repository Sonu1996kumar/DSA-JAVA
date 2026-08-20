package dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class GetHighestAndLowestFrequency {
    public static int[] getHighestAndLowestFreq(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        int highestFre = Integer.MIN_VALUE;
        int highestNum = -1;

        for(int key : freq.keySet()){
            int currentKey = key;
            int currentValue = freq.get(key);

            if(currentValue > highestFre){
                highestFre = currentValue;
                highestNum = currentKey;
            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;

        for(int key : freq.keySet()){
            int currentKey = key;
            int currentValue = freq.get(key);

            if(currentValue < lowestFreq){
                lowestFreq = currentValue;
                lowestNum = currentKey;
            }
        }

        int ans[] ={highestNum, lowestNum};
        return  ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,3,3,4,4,4,5,5,5,5,5,5};
        System.out.println(Arrays.toString(getHighestAndLowestFreq(arr)));
    }
}

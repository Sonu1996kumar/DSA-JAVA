package dsa.arrays;

import java.util.HashMap;

public class FindFirstRepeatingEle {
    public static int firstRepeatingElement(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int n : arr){
            freq.put(n, freq.getOrDefault(n,0)+1);
        }
        for(int i : arr){
            if(freq.get(i) > 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(firstRepeatingElement(arr));
    }
}

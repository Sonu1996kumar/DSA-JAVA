package dsa.arrays;

import java.util.HashMap;

public class ModeOfElement {
    public static int modeOfArray(int a[]){
        HashMap<Integer, Integer> freq =new HashMap<>();

        for(int num : a){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        //to check the value is store correctally or not
        /*for(int i : freq.keySet()){
            // i represent the key
            System.out.println(i +" -->" + freq.get(i));
        }*/

        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for(int key : freq.keySet()){
            int currentKey = key;
            int currentKeyFreq = freq.get(key);

            if(currentKeyFreq > maxFreq){
                //naya maxfre mil gya
                maxFreq = currentKeyFreq;
                maxFreqWaliKey = currentKey;
            }
        }
        return  maxFreqWaliKey;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,3,3,4,4,4,5,5,5,5,5,5};
        System.out.println(modeOfArray(arr));
    }
}

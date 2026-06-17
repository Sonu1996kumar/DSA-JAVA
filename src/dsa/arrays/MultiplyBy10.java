package dsa.arrays;

import java.util.Arrays;

public class MultiplyBy10 {
    public static int[] multipyBy10(int[] arr){
        int size = arr.length;
        int[] newArray = new int[size];

        for(int i=0; i<size; i++){
            int elemt = arr[i] * 10;
            newArray[i] = elemt;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 3};
        System.out.println(Arrays.toString(multipyBy10(a)));
    }
}

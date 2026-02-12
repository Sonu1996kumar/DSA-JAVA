package dsa.arrays;

import java.util.Arrays;

public class RotateArrayByOne {
    public static void rotateArrayBy1(int[] arr){
        int n = arr.length;
        int lastElement = arr[n-1];

        for(int i = n-2 ; i >=0; i--)
            arr[i+1] = arr[i];

        arr[0] = lastElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 10};
        //output [10, 3, 5, 8, 9, 1]

        rotateArrayBy1(arr);
        System.out.println("Array after rotation "+ Arrays.toString(arr));
    }
}

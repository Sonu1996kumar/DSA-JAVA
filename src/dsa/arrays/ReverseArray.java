package dsa.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr){
        int left = 0, right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    //Case 2: Object array (Integer[], String[])
//    Integer[] arr = {1, 2, 3, 4};
//    Collections.reverse(Arrays.asList(arr));

    //
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverseArray(arr);
//        for(int i = 0; i < arr.length; i++)
//        System.out.print(arr[i] +" ");
        System.out.println(Arrays.toString(arr));
    }
}

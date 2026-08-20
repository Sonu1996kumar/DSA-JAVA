package dsa.arrays;

import java.util.Arrays;

public class ShiftArray {
    public static void shiftBy1(int arr[]){
        int n = arr.length;
        int temp = arr[n-1];

        for(int i = n-1;i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60, 70};

        shiftBy1(a);
        System.out.println(Arrays.toString(a));
    }
}

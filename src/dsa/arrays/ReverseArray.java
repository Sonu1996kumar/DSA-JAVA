package dsa.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int a[]){
        int n = a.length;
        int i = 0;
        int j = n-1;

        while (i <= j){
           /* int temp = a[i];
            a[i] = a[j];
            a[j] = temp;*/
            //swap without using third variable
            a[i] = a[i] + a[j];
            a[j] = a[i] - a[j];
            a[i] = a[i] - a[j];

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int array[] = {1, 3, 6, 67, 8, 9};
        reverseArray(array);
        System.out.println(Arrays.toString(array));

    }
}

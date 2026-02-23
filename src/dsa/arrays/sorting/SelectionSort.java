package dsa.arrays.sorting;

import java.util.Arrays;

public class SelectionSort {
    /*Finding the minimum element from the unsorted part of the array.
    Swapping it with the first unsorted element.
    Moving the boundary of sorted and unsorted parts forward.
    Repeating until the array is sorted.
            👉 After every pass, one element is placed at the correct position.*/
    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i<n-1; i++){
            int minIndex = i;

            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[i])
                    minIndex=j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 4, 6, 8, 10, 12};
        selectionSort(arr);

        System.out.println("Array after Selection Sort "+ Arrays.toString(arr));

    }
}

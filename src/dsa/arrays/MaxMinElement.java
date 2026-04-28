package dsa.arrays;

public class MaxMinElement {
    public static void main(String[] args) {
        int arr[] = {3, 2, -5, 21, 100};
        int n = arr.length;
        int maxElement = arr[0];
        int minElement = arr[0];
        for(int i = 0; i <= n-1; i++){
            if( arr[i] >maxElement){
                maxElement = arr[i];
            }
        }
        System.out.println("Maximum element is "+maxElement);

        for(int i = 0; i <= n-1; i++){
            if( arr[i] < minElement){
                minElement = arr[i];
            }
        }
        System.out.println("Maximum element is "+minElement);
    }
}

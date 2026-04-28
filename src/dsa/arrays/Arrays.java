package dsa.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Declaration
       /* int arr[];

        //Allocation
        arr = new int[];

        //Initialization
        int brr[] = {1, 3, 5};*/

        //taking input
        int arr[] = new int[5];
        int n = arr.length;

        //taking input
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <= n-1; i++){
            System.out.println("Enter the value ");
             arr[i] = sc.nextInt();
        }

        //print value using for each loop
        System.out.println("Array contains the value :");
        for(int v : arr){
            System.out.println(v);
        }

    }
}

package dsa.arrays;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[1000];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i < n-1; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("Fibonacci Series is "+arr[n-1]);
    }
}

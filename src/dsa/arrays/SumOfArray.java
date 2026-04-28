package dsa.arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40,50};
        int n = arr.length;

        int sum = 0;
        int mul = 1;

        /*for(int i = 0; i <= n-1; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array :"+sum);*/

        for(int val : arr){
            sum += val;
        }
        System.out.println("Sum of array is : "+sum);

        for(int val : arr){
            mul *= val;
        }
        System.out.println("Multiplication of array is : "+mul);
    }
}

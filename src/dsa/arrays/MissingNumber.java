package dsa.arrays;

public class MissingNumber {
    public static int missingNum(int[] arr, int n){
        int sum = 0;

        for(int i : arr)
            sum += i;
        int ans = n*(n+1)/2;
        return ans - sum;

    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 2, 4};
        int missingNumber = missingNum(arr, n);
        System.out.println("Missing Number is "+missingNumber);

    }
}

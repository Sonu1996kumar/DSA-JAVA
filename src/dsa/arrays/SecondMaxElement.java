package dsa.arrays;

public class SecondMaxElement {
    public static int secondMaxEle(int[] arr){
        int n = arr.length;
        int ans = -1;
        for (int j : arr) {
            if (j > ans) {
                ans = j;
            }
        }

        int second = -1;
        for(int i = 0; i < n; i++){
            if(ans != arr[i]){
                second = Math.max(second, arr[i]);
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 6, 8, 10};
        int ans = secondMaxEle(arr);
        System.out.println("Second Max Element is "+ans);

    }
}

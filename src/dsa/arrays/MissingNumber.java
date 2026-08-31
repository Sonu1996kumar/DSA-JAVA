package dsa.arrays;

public class MissingNumber {
    public static int getMissingElement(int a[]){
        int xorSum = 0;
        for(int n : a){
            xorSum = xorSum ^ n;
        }
        int n = a.length;
        for(int i = 0; i <= n; i++){
            xorSum = xorSum ^ i;
        }

        return xorSum;
    }

    public static void main(String[] args) {
        int array[] = {2, 0, 1, 3, 4};
        System.out.println(getMissingElement(array));
    }
}

package dsa.arrays;

public class GetPosNegSumOfArray {
    public static int[] getPosNegSum(int[] array){
        int posSum = 0;
        int negSum = 0;
        int n = array.length;

        for(int i = 0; i < n; i++){
            if(array[i] > 0){
                posSum += array[i];
            }else{
                negSum += array[i];
            }
        }

        int ans[] ={posSum,negSum};
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, -4, -5, 2};
        int[] ans = getPosNegSum(a);
        System.out.println("Positive Sum is "+ans[0]);
        System.out.println("Negative Sum is "+ans[1]);
    }
}

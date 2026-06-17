package dsa.arrays;

public class ZeroOneCnt {
    public static int[] countZeroOne(int a[]){
        int zeroCnt = 0;
        int oneEnt = 0;

        for(int i=0; i< a.length; i++){
            if(a[i] == 0){
                zeroCnt++;
            }else{
                oneEnt++;
            }
        }
        int[] ans = {zeroCnt, oneEnt};
        return  ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0};
        int[] ans = countZeroOne(arr);

        System.out.println("Count of Zero is "+ans[0]);
        System.out.println("Count of One is "+ans[1]);
    }
}

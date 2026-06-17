package dsa.arrays;

public class AverageOfArrayElemnt {
    public static double getAverage(int[] arr){
        double sum = 0;
        for(int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum/size;
        return  avg;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3};
        System.out.println(getAverage(a));
    }
}

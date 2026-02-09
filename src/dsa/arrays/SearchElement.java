package dsa.arrays;

public class SearchElement {
    public static int searchElement(int[] arr, int x){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 50, 90};
        int x = 90;

        int i = searchElement(arr, x);
        if(i >= 0)
            System.out.println("index is "+ i);
        else
            System.out.println("index not found "+ -1);

    }
}

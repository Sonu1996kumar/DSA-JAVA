package dsa.arrays;

public class ExtremeElementInAlternateManner {
    public static void extremeElement(int a[]){
        int n = a.length;

        int i = 0;
        int j = n-1;
        while (i<=j){
            if(i==j){
                System.out.println(a[i]);
                return;
            }else {
                System.out.println(a[i]);
                i++;
                System.out.println(a[j]);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        extremeElement(arr);
    }
}

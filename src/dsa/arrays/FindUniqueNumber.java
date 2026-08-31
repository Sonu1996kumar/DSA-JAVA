package dsa.arrays;

public class FindUniqueNumber {
    public static int uniqueElement(int a[]){
        int uniqueEle = 0;
        for(int n : a){
            uniqueEle = uniqueEle ^ n;
        }
        return uniqueEle;
    }

    public static void main(String[] args) {
        int array[] = {2, 2 ,3, 3, 4, 4, 5, 6, 6};
        System.out.println(uniqueElement(array));

    }
}

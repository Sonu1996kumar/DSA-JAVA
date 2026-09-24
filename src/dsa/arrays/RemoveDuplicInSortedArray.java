package dsa.arrays;

public class RemoveDuplicInSortedArray {
    public static int removeDuplicateFromSortedArray(int arr[]){
       /* int ans = 1;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){

                ans ++;
            }

        }

        return ans;*/

        //2pointer approch
        int i = 0;
        int j = 1;
        int n = arr.length;

        while(j<n){
            if(arr[i] == arr[j]){
                j++;
            }else{
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int num[] = {1,2,2,2,2,3,3,4};
        System.out.println(removeDuplicateFromSortedArray(num));
    }
}

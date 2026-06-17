package dsa.arrays;

public class FindUnsortedElement {
    public static int getUnsortedElement(int a[]){
        //assuming array is in increasing order
        /*for(int i=0; i< a.length; i++){
            if(a[i+1] > a[i]){
                //sab theek hai kuch karne ki jarurat nhi hai
            }else{
                return a[i+1];
            }
        }*/
        for(int i=0; i< a.length; i++){
            if(a[i+1] < a[i]){
                //sahi tarika
                return a[i+1];
            }
        }
        return -1;//agar nhi mila element to ,kyunki return type int hai
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 4, 9};
        System.out.println(getUnsortedElement(a));
    }
}

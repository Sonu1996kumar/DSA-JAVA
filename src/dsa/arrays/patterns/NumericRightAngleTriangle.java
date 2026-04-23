package dsa.arrays.patterns;

public class NumericRightAngleTriangle {
    public static void main(String[] args) {
        int n = 5;

        /*for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }*/

        int count = 1;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(count++ +" ");
            }

            System.out.println();
        }
    }
}

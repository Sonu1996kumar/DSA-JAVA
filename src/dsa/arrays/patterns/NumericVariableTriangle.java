package dsa.arrays.patterns;

public class NumericVariableTriangle {
    public static void main(String[] args) {
        int n = 4;
        /*for(int row = 1; row <= n; row++){
            //part 1  space
            for(int col = 1; col <= n - row; col++){
                System.out.print("  ");
            }

            //part 2
            for(int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }

            //part 3
            int minValue = row;
            int decrementedRowVal = minValue -1;
            for(int col = 1; col <= row-1; col++){
                System.out.print(decrementedRowVal+" ");
                decrementedRowVal--;
            }
            System.out.println();
        }*/

        for(int row = 1; row <= n; row++) {
            //part 1  space
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            //part 2
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}

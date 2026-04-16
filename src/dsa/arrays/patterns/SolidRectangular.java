package dsa.arrays.patterns;

public class SolidRectangular {
    public static void main(String[] args) {
        int n = 3;
        int m = 5;

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= m; col++){
                //for each row -> m colums
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

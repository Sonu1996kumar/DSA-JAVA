package dsa.arrays.patterns;

public class SolidSquare {
    public static void main(String[] args) {

        int n = 4;

        for(int row = 1; row <=n; row++){
            //for each row -> n colums
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

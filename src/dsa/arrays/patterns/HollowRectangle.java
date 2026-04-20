package dsa.arrays.patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;

        /*for(int row = 1; row <= n; row++){
            if(row==1 || row ==n){
                for(int col = 1; col <= m; col++){
                    System.out.print("* ");
                }
            }else {
                for(int col = 1; col <= m; col++){
                    if(col==1 || col==m)
                       System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }*/

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <=m; col++) {
                if (row == 1 || row == n) {
                    System.out.print("* ");
                } else {
                    if (col == 1 || col == m) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

            }
            System.out.println();
        }
    }

}

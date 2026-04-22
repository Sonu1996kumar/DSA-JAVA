package dsa.arrays.patterns;

public class Butterfly {
    public static void main(String[] args) {
        int n = 4;

        for(int row = 1; row <= n; row++){
            //part1
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }

            //part2
            for(int col = 1; col <= 2*(n-row); col++){
                System.out.print("  ");
            }

            //part3
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }

            System.out.println();
        }

        //inverted symmetry half
        for(int row = 1; row <= n; row++){
            //part4
            for(int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }

            //part5
            for(int col = 1; col <= 2*(row-1); col++){
                System.out.print("  ");
            }

            //part6
            for(int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}

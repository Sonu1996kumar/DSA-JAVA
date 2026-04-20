package dsa.arrays.patterns;

public class HollowRightAngleTriangle {
    public static void main(String[] args) {
        int n = 6;
        for(int row = 1; row <= n; row++){
            if(row == 1 || row == 2 || row == 6){
                for(int col = 1; col <= row; col++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");

                for(int col = 1; col <= row -2; col++){
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

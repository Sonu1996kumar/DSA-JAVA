package dsa.arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        //Declaration
        int arr[][];

        //allocation
        arr = new int[2][3];

        //init
        int[][] brr = {{1, 2}, {2, 4}, {3, 5}
        };

        int rowLength = brr.length;
        int colLentgh = brr[0].length;

        //this block of code work for 2D array traversal
        for(int rowIndex = 0; rowIndex <= rowLength-1;rowIndex++){
            for(int colIndex = 0; colIndex <= colLentgh-1; colIndex++){
                //System.out.print(brr[rowIndex][colIndex] + " ");
            }
            //System.out.println();
        }

        //System.out.println("Variable 2D Array Colunm");
       //for variable colm value
        int crr[][] = { {1, 2},
                {1, 2, 3, 4, 5,},
                {1},
                {2, 4, 6, 0}
        };

        int crrLength = crr.length;
        for(int rowIndex = 0; rowIndex <= crrLength-1;rowIndex++){
            //colmn value at row
            int crrClmnLength = crr[rowIndex].length;
            for(int colIndex = 0; colIndex <= crrClmnLength-1; colIndex++){
                //System.out.print(crr[rowIndex][colIndex] + " ");
            }
            //System.out.println();
        }

        //2D Array Input taking
        int a[][] = new int[3][4];

        Scanner sc = new Scanner(System.in);

        //input
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
               // System.out.println("Enter the value for row=" + i + " and column=" + j );
               // a[i][j] = sc.nextInt();
            }
        }
//use any of one which one is comfertable i < n OR i <= n-1
        for(int rowIndex = 0; rowIndex <= a.length-1;rowIndex++){
            //colmn value at row
            int crrClmnLength = a[rowIndex].length;
            for(int colIndex = 0; colIndex <= crrClmnLength-1; colIndex++){
               // System.out.print(a[rowIndex][colIndex] + " ");
            }
            //System.out.println();
        }

        //Sum/mul
        int b[][] = {{1,2,3},{1,2,3}};

        int sum = 0;
        int mul = 1;
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                int val = b[i][j];
                sum += val;
                mul *= val;
            }
        }
        System.out.println("Value of SUM "+sum);
        System.out.println("Value of MUL "+mul);

        int maxValue = b[0][0];
        int minValue = b[0][0];
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
               if(b[i][j] > maxValue){
                   maxValue = b[i][j];
               } else if (b[i][j] < minValue) {
                   minValue = b[i][j];
               }
            }
        }
        System.out.println("Maximum value is "+ maxValue);
        System.out.println("Minimum value is "+ minValue);
    }

}
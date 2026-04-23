package dsa.arrays.patterns;

public class AlphabeticalTriangle {
    public static void main(String[] args) {
        int n = 5;

        /*for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                int a = col;
                int b = ('A' - 1);
                char value = (char)(a + b);
                //char finalValue = (char) value;

                System.out.print(value+" ");
            }
            System.out.println();
        }*/

        /*for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                *//*int a = col;  my logic
                int b = ('E' + 1);
                char value = (char)(b - a);*//*
                //char finalValue = (char) value;

                int a =n - col;
                int b = 'A';
                char value = (char)(a + b);

                System.out.print(value+" ");
            }
            System.out.println();
        }*/

        for(int row = 1; row <= n; row++){
            //part1
            for(int col = 1; col <= n-row; col++){
                System.out.print("  ");
            }
            //part2
            for(int col = 1; col <= row; col++){
                int a = col;
                int b = ('A' - 1);
                char value = (char)(a + b);
                System.out.print(value+" ");
            }

            //part3
            char toPrint = (char) (row + 'A'-2);
            for(int col = 1; col <= row-1; col++){
                System.out.print(toPrint+" ");
                toPrint--;
            }
            System.out.println();
        }
    }
}

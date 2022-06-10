package assignments.matrix;

import java.util.Scanner;

public class test {
    static void matrix2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int columns = sc.nextInt();

        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];

//        First matrix
        System.out.println("\nFill in first matrix\n");
        for (int i=0; i<rows; i++){
            System.out.println("Row "+ (i+1));
            for (int j = 0; j < columns; j++){
                firstMatrix[i][j] = sc.nextInt();
            }
        }

//        First matrix preview
        System.out.println("\nFirst Matrix Preview");
        for(int[] a : firstMatrix){
            for (int b : a){
                System.out.print(b+ " ");
            }
            System.out.println();
        }


//        Second matrix
        System.out.println("\nFill in second matrix\n");
        for (int i=0; i<rows; i++){
            System.out.println("Row "+ (i+1));
            for (int j = 0; j < columns; j++){
                secondMatrix[i][j] = sc.nextInt();
            }
        }

        //        Second matrix preview
        System.out.println("\nSecond Matrix Preview");
        for(int[] x : secondMatrix){
            for (int y : x){
                System.out.print(y+ " ");
            }
            System.out.println();
        }

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        matrix2();
    }
}

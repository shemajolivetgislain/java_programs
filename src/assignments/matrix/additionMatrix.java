package assignments.matrix;

import java.util.Scanner;

public class additionMatrix {
    public static void AdditionMatrix() {
        Scanner input = new Scanner(System.in);
        int r1, c1, r2, c2;    //Declaration of matrix size


        System.out.print("Enter the number of rows of first matrix:");
        r1 = input.nextInt();    //Initialization of first matrix size
        System.out.print("Enter the number of columns of first matrix:");
        c1 = input.nextInt();   //Initialize first matrix size
        System.out.print("Enter the number of rows of second matrix:");
        r2 = input.nextInt();   //Initialize second matrix size
        System.out.print("Enter the number of columns of second matrix:");
        c2 = input.nextInt();
        System.out.println("\nFill in a matrix\n");

        if (r1 == r2 && c1 == c2)
        {
            int[][] firstMatrix = new int[r1][c1];
            int[][] secondMatrix = new int[r2][c2];
            int[][] sumOfMatrix = new int[r1][c1];

//            loop to input data in first matrix
            System.out.println("the items of the first matrix: ");
            for (int i= 0; i < r1; i++)
            {
                for (int j = 0; j < c1; j++)
                {
                    firstMatrix[i][j]= input.nextInt();
                }
            }
            System.out.println(" ");

            System.out.println("the items of the second matrix: ");
            for (int i= 0; i < r2; i++)
            {
                for (int j = 0; j < c2; j++)
                {
                    secondMatrix[i][j]= input.nextInt();
                }
            }

            //  loop for reading what was written in the loop
            System.out.println("values of first matrix are: ");
            for (int i = 0; i < r1; i++)
            {
                for (int j = 0; j < c1; j++)
                {
                    System.out.print(firstMatrix[i][j]+" ");
                }
                System.out.println("");
            }
            //  loop for reading what was written in the loop
            System.out.println("values of second matrix are: ");
            for (int i = 0; i < r2; i++)
            {
                for (int j = 0; j < c2; j++)
                {
                    System.out.print(secondMatrix[i][j]+" ");
                }
                System.out.println("");
            }
//            doing summation of first and second matrix
            System.out.println("*******************************");
            for (int i = 0 ; i < r1; i++)
            {
                for (int j = 0; j < c1; j++)
                {
                    sumOfMatrix[i][j] = firstMatrix[i][j] + secondMatrix [i][j];
                }
            }
            System.out.println("summation of first and second matrix are : ");
            for (int i = 0; i < r1; i++)
            {
                for (int j = 0; j < c1; j++)
                {

                    System.out.print(sumOfMatrix[i][j]+" ");
                }
                System.out.println("");
            }

        }
        else {
            System.err.println("rows and and columns must be equal");
        }



    }
}

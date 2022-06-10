package assignments.matrix;
import java.util.Scanner;
import static assignments.matrix.additionMatrix.AdditionMatrix;
import static assignments.matrix.multiplicationMatrix.MultiplicationMatrix;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you what to add or multiple matrix:");
        System.out.println("Press 1 for adding Matrix");
        System.out.println("press 2 for multiplication of Matrix");
        choice = input.nextInt();
        switch (choice){
            case 1:
                AdditionMatrix();
                break;
            case  2:
                MultiplicationMatrix();
                break;
            default:
                System.err.println("you choice doesn't doest exist");
        }

    }
}

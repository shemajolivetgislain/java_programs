package assignments;
import java.util.Scanner;
import static assignments.addPositive.PositiveSummation;
import static assignments.squareOfPositive.squarePositive;
import static assignments.sumOfOdd.sumOdd;

public class main {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of number to looped");
        size = input.nextInt();
        PositiveSummation(size);
        sumOdd(size);
        squarePositive(size);
    }
}

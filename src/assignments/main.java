package assignments;
import java.util.Scanner;
import static assignments.addPositive.PositiveSummation;

public class main {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of number to looped");
        size = input.nextInt();
        PositiveSummation(size);

    }
}

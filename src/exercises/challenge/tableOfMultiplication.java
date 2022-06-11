package exercises.challenge;

import java.util.Scanner;

public class tableOfMultiplication {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to be");
        number = input.nextInt();
        for(int i = 1; i < 10; i++ ){
            System.out.println(String.format("table of multiplication of " + number + "*" + i + " = "  )+ number * i );
        }
    }
}

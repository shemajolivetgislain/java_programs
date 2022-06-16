package assignments;
import java.util.Scanner;

import conditions.switchcase;

import static assignments.addPositive.PositiveSummation;
import static assignments.squareOfPositive.squarePositive;
import static assignments.sumOfOdd.sumOdd;

public class main {
    public static void main(String[] args) {
        int size;
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of number to looped");
        size = input.nextInt();
        System.out.println("Please your choice");
        System.out.println("Press 1 to add number which are positive");
        System.out.println("press 2 to add square of positive numbers");
        System.out.println("Press 3 to get sum of odd numbers");
        choice = input.nextInt();
        switch(choice) {
            case 1: 
            PositiveSummation(size);
            break;
            case 2: 
            squarePositive(size);
            case 3:
            sumOdd(size);
        }
        
    }
    
}

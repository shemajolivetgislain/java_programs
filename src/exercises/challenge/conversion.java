package exercises.challenge;

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice1;
        String choice2;
        String choice3;
        System.out.print("Welcome to Treasure Island.");
        System.out.print("\"Your mission is to find the treasure.\"");
        System.out.print("left or right? \n");
        choice1 = input.next();
        if (choice1.equals("left")){
            System.out.print("choice is wait or swim\n");
            choice2 = input.next();
            if (choice2.equals("wait")){
                System.out.print("your choice color should be red, blue, yellow\n");
                choice3 = input.next();
                if (choice3.equals("red")){
                    System.out.print("It's a room full of fire. Game Over.\n");
                }
                else if (choice3.equals("yellow")) {
                    System.out.print("You found the treasure! You Win!\n");
                }
                else if (choice3.equals("blue")) {
                    System.out.print("You enter a room of beasts. Game Over.\n");
                }
                else {
                    System.err.println("You chose a door that doesn't exist. Game Over.\n");
                }

            }
            else {
                System.out.print("You get attacked by an angry trout. Game Over.\n");
            }

        }
        else {
            System.out.print("fall into a hole Game over");
        }
    }
}

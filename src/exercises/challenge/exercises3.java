package exercises.challenge;

import java.util.Scanner;

public class exercises3 {
    public static double ctof( ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Temperature");
        Double t = input.nextDouble();
        if (t < -271){
         System.out.println("Temperature below absolute zero!");
    }
        else {
            Double fahnert = (t*9/5)+32;
            System.out.println("the fahnert is:" + fahnert);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(ctof());
    }
}

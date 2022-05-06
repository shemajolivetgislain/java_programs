package exercises.challenge;

import java.util.Scanner;

public class exercise4 {
    public static double ElementaryOperations(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number");
        Double a = input.nextDouble();
        System.out.print("Enter the second number");
        Double b = input.nextDouble();
        Double add = a+b;
        Double sub = a-b;
        Double multiply = a*b;


        System.out.println(add);
        System.out.println(sub);
        System.out.println(multiply);
        if (b <= 0)
        {
            System.err.println("error");
        }
        else {
            Double divide = a/b;
            System.out.println(divide);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(ElementaryOperations());
    }

}


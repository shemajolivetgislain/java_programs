package exercises.challenge;

import java.util.Scanner;

public class exercise5 {
    public static double IsResultTheSame(){
        double a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter 2 numbers");
        a=input.nextDouble();
        b= input.nextDouble();
        if (a==b){
            System.out.println(a+b == a*b);
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(IsResultTheSame());
    }
}

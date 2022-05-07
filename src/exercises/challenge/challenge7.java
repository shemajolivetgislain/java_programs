package exercises.challenge;

import java.util.Scanner;

public class challenge7 {
    public static int SwapTwoNumbers(){
        Scanner input= new Scanner(System.in);
        int a,b;
        int temp=0;
        System.out.println("please enter two numbers");
        a = input.nextInt();
        b = input.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
        return 0;


    }

    public static void main(String[] args) {
        System.out.println(SwapTwoNumbers());
    }
}
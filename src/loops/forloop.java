package loops;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        int number;
        Scanner num = new Scanner(System.in);
        System.out.println("please enter the number");
        number = num.nextInt();
        for (int i =0; i <= number;i++){
            if (i%2 == 0)
            {
                System.out.println(i);
            }
            else{
                System.out.println("it even numbers");
            }
        }
    }
}

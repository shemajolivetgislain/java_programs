package arrays;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        int[] num = new int[5];
        int sum = 0;
        Double average = 0.0;
        Scanner scan = new Scanner(System.in);

        for (int i= 0; i<=num.length; i++){

            num[i] = scan.nextInt();
            System.out.println("please enter five number");
            sum += num[i];
            average += sum/num.length;
            System.out.println("the sum is" + sum);
            System.out.println("the average is" + average);

        }
    }

}

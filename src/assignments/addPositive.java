package assignments;

import java.util.Scanner;

public class addPositive {

    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of number to looped");
        size = input.nextInt();
        PositiveSummation(size);

    }
    public static int PositiveSummation(int size){
        int sum = 0;
        for (int i = 0; i <= size; i++){
            if (i > 0){
                sum += i;
            }
        }
        System.out.println("the summation of all positive numbers are :" + sum);

        return 0;
    }

}

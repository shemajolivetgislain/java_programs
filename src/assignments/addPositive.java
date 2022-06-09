package assignments;

import java.util.Scanner;

//Write a short Java method that takes an integer n and returns the sum of all
//        positive integers less than or equal to n.

public class addPositive {
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

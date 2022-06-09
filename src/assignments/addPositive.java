package assignments;

import java.util.Scanner;

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

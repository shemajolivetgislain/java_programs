package exercises;

import java.util.Scanner;

public class oneDimensional {
    public static void main(String[] args) {
        getdata();

    }
    public static void getdata(){
        Scanner input = new Scanner(System.in);
        int count;
        System.out.print("print enter the count");
        count = input.nextInt();
        double[] num = new double[count];
        double sum = 0;
        double avg = 0;

        for (int i= 1;i<= num.length; i++){
            num[i]  = input.nextDouble();
        sum= sum + num[i];
        }
        System.out.print(sum);

    }
}

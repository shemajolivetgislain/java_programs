package exercises;

import java.util.Scanner;

public class oneDimensional {
    public static void main(String[] args) {

    }
    public static double getdata(){
        Scanner input = new Scanner(System.in);
        double[] count = new double[];
        double sum = 0;
        double avg = 0;
        System.out.print("please enter count");
        count = input.nextInt();
        for (int i= 0;i<= count; i++){
        sum= sum + count[i];
        }
    }
}

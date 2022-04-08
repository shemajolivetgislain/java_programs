package mortage_calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortage_calc_v2 {
    public static void main(String[] args) {
        int principle = 0;
        final byte monthlyInYear = 12;
        final byte percent = 100;
        float annualInterestRate;
        float monthlyInterestRate=0;
        int numberPayments=0;
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("please enter principle: ");
            principle=scan.nextInt();
            if (principle>= 100 && principle<=1_000_000)
                break;

            System.err.print("enter value btn 1000 and 1,000,000");
        }
        while (true){
            System.out.print("enter the annual interestRate");
            annualInterestRate = scan.nextFloat();
            if (annualInterestRate>= 1 && annualInterestRate<=19)
                break;
            monthlyInterestRate = annualInterestRate/monthlyInYear/percent;
            System.err.print("enter value btn 1 and 30");
        }
        while (true){
            System.out.println("period in year:");
            byte years= scan.nextByte();
            if (years>= 1 && years<=30) {
                numberPayments = years * monthlyInYear;
                break;
            }
            System.err.print("years should btn 1 and 30");
        }

        double mortage = principle *(monthlyInterestRate*Math.pow(1+monthlyInterestRate, numberPayments))/Math.pow(1+monthlyInterestRate,numberPayments)-1;
        String mortageFormat = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println(mortageFormat);
    }
}

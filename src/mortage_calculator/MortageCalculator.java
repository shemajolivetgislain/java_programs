package mortage_calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    public static void main(String[] args) {
        int principle;
        final byte monthlyInYear = 12;
        final byte percent = 100;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principle :");
        principle = scan.nextInt();
        System.out.print("enter the annual interestRate");

        float annualInterestRate = scan.nextFloat();
        float monthlyInterestRate = annualInterestRate/monthlyInYear/percent;
        System.out.println("period in year:");
        byte years= scan.nextByte();
        int numberPayments = years*monthlyInYear;
        double mortage = principle *(monthlyInterestRate*Math.pow(1+monthlyInterestRate, numberPayments))/Math.pow(1+monthlyInterestRate,numberPayments)-1;
        String mortageFormat = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println(mortageFormat);
    }
}

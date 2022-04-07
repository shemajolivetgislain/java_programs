package conditions;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner count = new Scanner(System.in);
        int days = 0;
        System.out.println("please enter number of days");
        days = count.nextInt();
        switch (days){
            case 1:
                System.out.println("it is mondays");
                break;
            case 2:
                System.out.println("it is tuesdays");
                break;
            case 3:
                System.out.println("it is wensday");
                break;
            case 4:
                System.out.println("it is thursday");
                break;
            default:
                System.out.println("it's weekend");
        }

    }
}

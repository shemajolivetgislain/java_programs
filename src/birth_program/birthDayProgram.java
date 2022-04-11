package birth_program;

import java.time.Year;
import java.util.Scanner;

public class birthDayProgram {
    public static void guessBirthday(){
        int bDay = 22;
        int bMonth = 7;
        int year = 2000;
//variable which will be used to guess
        int guessDate;
        int guessMonth;
        int guessYear;
        Scanner input = new Scanner(System.in);
        //        for discovering
        System.out.print("enter some date: ");
        guessDate = input.nextInt();
        if (guessDate != bDay) System.err.print("you have failed");
        else System.out.println("this my birth date");

//        for discovering month
        System.out.print("enter some Month: ");
        guessMonth = input.nextInt();
        if (guessMonth != bMonth) System.err.print("you have failed");
        else System.out.println("this my birth Month");

        //  for discovering year
        System.out.print("enter some year: ");
        guessYear = input.nextInt();
        if (guessYear != year) System.err.print("you have failed");
        else System.out.println("this my birth year");


        System.out.println("My birth day is: " + guessYear+"/"+guessMonth+"/"+guessDate );
    }

    public static void main(String[] args) {
        guessBirthday();
    }
}

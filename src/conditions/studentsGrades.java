package conditions;

import java.util.Scanner;

public class studentsGrades {
    public static void main(String[] args) {
        int grades = 0;
        int counts;
        Scanner count = new Scanner(System.in);
        System.out.println("please enter your grades to know your classes");
        grades = count.nextInt();
        switch (grades/10){
            case 1:
                System.out.println("grade A");
                break;
            case 2:

                System.out.println("grade B");
                break;
            default:
                System.out.println("bye");
        }
    }
}

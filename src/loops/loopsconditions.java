package loops;

import java.util.Scanner;

public class loopsconditions {
    public static void main(String[] args) {
        int value=0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
        {
            System.out.print( "Enter 1st number:" );

            int inValue = scan.nextInt();
            if(inValue > value || i==0 )
                value = inValue;
            else break;
        }

    }
}

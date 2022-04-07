package Bank;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
    static int userChoice;
    static boolean quit = false;

	public static void main(String[] args) {
		
		normal user = new normal();
		
		user.getdata();
		user.putdata();
		user.start();
		
    }

}

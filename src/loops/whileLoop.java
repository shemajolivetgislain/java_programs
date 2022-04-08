package loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        String input = "";
        Scanner read = new Scanner(System.in);
        while (!input.equals("equal")){
            System.out.print("Input: ");
            input = read.next();
            System.out.println(input);
        }
    }
}

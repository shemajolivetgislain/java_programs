package Bank;

import java.util.Scanner;

public class normal extends Bank{
    static Scanner in = new Scanner(System.in);
    static int userChoice;
    static boolean quit = false;
    static float balance = 0f;
    static float amount;
    
    // START OF BANKING APP
    void start() {
	    System.out.println("WELCOME TO NEW BANKING APP \n");
        System.out.println("--------------------------------");
        System.out.println("     1. Make a transaction");
        System.out.println("     2. Exit/Quit");
        System.out.println("--------------------------------");
        System.out.print("Please Select to Continue: ");
        userChoice = s.nextInt();
        switch (userChoice) {
            case 1:
                Transaction();
                break;
            case 2:
                quit = true;
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        System.out.println("Bye!");
	    }   
    
    
	
    
      //MAKE DEPOSIT 
	  public static float MakeDeposit(){
	        float amount;
	        System.out.print("Amount to deposit: ");
	        amount = in.nextFloat();
	        if (amount <= 0) {
	            System.out.println("\n");
	            System.out.println("Can't deposit non-positive amount.");
	        }
	        else {
	            balance += amount;
	            System.out.println("\n");
	            System.out.println("$ " + amount + " has been deposited.");
	            System.out.println(" Your new balance is: $ " + balance);
	        }
	        return 0;
	    }
	  
	    //MAKE WITHDRAWAL 
	    public static float MakeWithdraw(){
	        System.out.print("Amount to withdraw: ");
	        amount = in.nextFloat();
	        if (amount <= 0 || amount > balance) {
	            System.out.println("\n");
	            System.out.println("Withdrawal can't be completed. There's no enough balance");
	        }
	        else {
	            balance -= amount;
	            System.out.println("\n");
	            System.out.println("$ " + amount + " has been withdrawn.");
	            System.out.println(" Your new balance is: $ " + balance);
	        }
	        return 0;
	    }
	    
	    //CHECK BALANCE	    
	    public static void NewBalance(){
	        System.out.println("\n");
	        System.out.println("Account Owner: " + name);
	        System.out.println("Account Number: " + accno);
	        System.out.println("Your balance: $" + balance);
	    }
	    
	    
	    //MAKE TRANSACTION
	    public int Transaction(){
	    
	    do {
            System.out.println("--------------------------------");
            System.out.println("    1. Deposit money");
            System.out.println("    2. Withdraw money");
            System.out.println("    3. Check balance");
            System.out.println("    4. Exit/Quit");
            System.out.println("--------------------------------");
            System.out.print("Please Select to Continue: ");
            userChoice = in.nextInt();
            
            switch (userChoice) {
                case 1:
                    MakeDeposit();
                    break;
                case 2:
                   MakeWithdraw();
                    break;
                case 3:
                   NewBalance();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println();
        } while (!quit);
	    return 0;
	    }

}

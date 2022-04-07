package Bank;
import java.util.*;

public class Bank {
	
	    Scanner s=new Scanner(System.in);
	    static String name;
	    static int accno;
	    static String accountowner;
	    static int userChoice;
	    static boolean quit = false;
	    
	    public void CreateAccount(){
	        System.out.println("Enter Username: ");
	        accountowner = s.next();
	        System.out.println("Enter Your Chosen Account-number: ");
	        accno = s.nextInt();
	        System.out.println("Account Has Successfully Created!");
//	        normal();
	    }
	    
	    void getdata()
	    {
	        System.out.println("enter name");
	        name=s.next();
	        System.out.println("enter account no");
	        accno=s.nextInt();
	    }
	    void putdata()
	    {
	        System.out.println("name is::"+name);
	        System.out.println("accno is::"+accno);
	    }
	    

}

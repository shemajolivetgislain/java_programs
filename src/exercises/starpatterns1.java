package exercises;

public class starpatterns1 {
    public static void main(String[] args) {
        //for Rows
        for (int i=2; i<=7; i++)
        {
//            for columns
            for (int j=7; j>=i; j-=1){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}

package loops;

public class forLoop {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 5; i>=1 ; i--){
           for (int j=5; j>=i; j--)
           {
               System.out.print(x + " ");
               x+= 2;
           }
            System.out.println("");
        }

    }
}

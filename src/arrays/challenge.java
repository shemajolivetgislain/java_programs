package arrays;

public class challenge {
   
        public static void main(String[] args) {
      
          int rows = 5;
      
          // outer loop
          for (int i = 1; i <= rows; ++i) {
      
            // inner loop to print the numbers
            for (int j = 1; j <= i; ++j) {
              System.out.print(j + " ");
            }
            System.out.println("");
          }
        }
      }
    


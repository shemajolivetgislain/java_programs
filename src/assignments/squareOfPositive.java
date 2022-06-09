package assignments;

//Write a short Java method that takes an integer n and returns the sum of
//  the squares of all positive integers less than or equal to n

public class squareOfPositive {
    public static int squarePositive(int size){
        int sum = 0;
        for (int i = 0; i <= size; i++){
            if (i > 0  ){
                System.out.println();
                sum += Math.pow(i, 2);
            }
        }

        System.out.println("sum of the squares of all positive integers :" + sum);
        return 0;
    }
}

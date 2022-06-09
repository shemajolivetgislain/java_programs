package assignments;

public class sumOfOdd {
        public static int sumOdd(int size){
            int sum = 0;
            for (int i = 0; i <= size; i++){
                if (i > 0 && i % 2 != 0 ){
                    sum += i;
                }
            }
            System.out.println("the summation of all positive numbers which are odd :" + sum);

            return 0;
        }


}

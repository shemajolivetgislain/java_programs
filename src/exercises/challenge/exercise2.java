package exercises.challenge;

public class exercise2 {
    public static Object ElementaryOperations(int a, int b){
        int[] ans = new int[4];
        ans[1] = a+b;
        ans[2]= a-b;
        ans[3] = a*b;
        ans[4]= (int) (a / b);
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = (int[]) ElementaryOperations(3,5);
        System.out.print(ElementaryOperations(3,5));
    }
}

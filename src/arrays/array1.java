package arrays;

public class array1 {
    public static void main(String[] args) {
        String[] car = {"Toyota","BMW","Ford","Mazda"};
        for (int i = 0 ; i<car.length; i++){
            if (car[i].startsWith("T")){
                System.out.println(car[i]);
            }

        }
    }
}

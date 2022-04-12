package exercises;

public class countName {
    public static void main(String[] args) {
        String[] names = {"jolivet","jojo","gislain"};
        for (int i=0; i<= names.length; i++){
            int minchar = names[i].length();
            if (minchar  == 4){
                System.out.println(names[i]);
            }
        }

    }
}

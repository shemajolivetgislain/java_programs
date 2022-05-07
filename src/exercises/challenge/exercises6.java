package exercises.challenge;

public class exercises6 {
    public static double TheCubeOf(double num)
    {
        return num * num * num;
    }

    public static void main(String[] args) {
        System.out.println(TheCubeOf(15));    // 3375
        System.out.println(TheCubeOf(0.25));  // 0.015625
        System.out.println(TheCubeOf(-12));   // -1728
        System.out.println(TheCubeOf(-0.1));
    }
}


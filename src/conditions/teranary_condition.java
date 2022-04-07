package conditions;

public class teranary_condition {
    public static void main(String[] args) {
        int income = 100000;
        String isHighIncome = income>90000? "you are a boss":"you're not boss";
        System.out.println(isHighIncome);
    }
}

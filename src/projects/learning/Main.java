package projects.learning;

public class Main{
    public static void main(String[] args) {
        SumOfFirstAndLastDigit sumOfFirstAndLastDigit = new SumOfFirstAndLastDigit();
        System.out.println(sumOfFirstAndLastDigit.sumFirstAndLastDigit(7));
        System.out.println(sumOfFirstAndLastDigit.sumFirstAndLastDigit(123456789));
        System.out.println(sumOfFirstAndLastDigit.sumFirstAndLastDigit(14));
        System.out.println(sumOfFirstAndLastDigit.sumFirstAndLastDigit(-16));
        System.out.println(sumOfFirstAndLastDigit.sumFirstAndLastDigit(4672));
        System.out.println(sumOfFirstAndLastDigit.sumFirstAndLastDigit(0));
    }
}

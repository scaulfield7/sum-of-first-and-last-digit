package projects.learning;

public class SumOfFirstAndLastDigit{
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        if(number < 10){
            return number;
        }else{
            int lastDigit = number % 10;
            int firstDigit;
            while(number >= 10){
                number /= 10;
            }
            firstDigit = number;
            return firstDigit + lastDigit;
        }
    }
}

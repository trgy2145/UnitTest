package exam2;

public class FizzBuzz {
    public String divideOrNotDivide(int number){
        if (number < 1 || number >100) {
            throw new IllegalArgumentException();
        }
        if (number % 3 ==0 && number % 5 == 0) {
            return "FizzBuzz";

        }
        else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return  String.valueOf(number);
    }
}

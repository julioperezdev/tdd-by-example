package guru.springframework;

public class Main {

    int number;

    public Main(int number) {
        this.number = number;
    }

    public String fizzBuzz (int number){

        if(isZero(number))
            return "00";

        if(isFizzBuzz(number))
            return "FizzBuzz";

        if(isFizz(number))
            return "Fizz";

        if(isBuzz(number))
            return "Buzz";

        return String.valueOf(number);
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private boolean isFizzBuzz(int number) {
        return number % 15 == 0;
    }

    private boolean isZero(int number) {
        return number == 0;
    }
}

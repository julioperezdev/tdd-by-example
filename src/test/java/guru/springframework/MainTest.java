package guru.springframework;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void itShouldReturnFizzIfDivisibleBy3() {
        Main main = new Main(3);
        String result = main.fizzBuzz(main.number);
        assertEquals("Fizz", result);
    }

    @Test
    void itShouldReturnBuzzIfDivisibleBy5() {
        Main main = new Main(5);
        String result = main.fizzBuzz(main.number);
        assertEquals("Buzz", result);
    }

    @Test
    void itShouldReturnFizzBuzzIfDivisibleBy3And5() {
        Main main = new Main(15);
        String result = main.fizzBuzz(main.number);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void idShouldReturnSameNumberBecauseDoesNotDivisibleBy3Or5() {
        Main main = new Main(4);
        String result = main.fizzBuzz(main.number);
        assertEquals("4", result);
    }

    @Test
    @Disabled
    void idShouldReturnSameNumberBecauseIsZero() {
        Main main = new Main(0);
        String result = main.fizzBuzz(main.number);
        assertEquals("00", result);
    }

}

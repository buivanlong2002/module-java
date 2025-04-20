package test.baitap3.src;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    public void testFizzBuzzTranslate() {
        int number = 1;
        String expected = "một";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzzTranslate2() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzzTranslate3() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzzTranslate4() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzzTranslate5() {
        int number = 23;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }
}
package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void when_number_is_1_return_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 1;

        String result = fizzBuzz.execute(input);

        assertEquals("1", result);
    }

    @Test
    public void when_number_is_multiple_of_3_return_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 3;

        String result = fizzBuzz.execute(input);

        assertEquals("Fizz", result);
    }

    @Test
    public void when_number_is_multiple_of_5_return_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 5;

        String result = fizzBuzz.execute(input);

        assertEquals("Buzz", result);
    }

    @Test
    public void when_number_is_multiple_of_7_return_Whizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 7;

        String result = fizzBuzz.execute(input);

        assertEquals("Whizz", result);
    }

    @Test
    public void when_number_is_multiple_of_3_and_5_return_FizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 15;

        String result = fizzBuzz.execute(input);

        assertEquals("FizzBuzz", result);
    }

    @Test
    public void when_number_is_multiple_of_3_and_7_return_FizzWhizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 21;

        String result = fizzBuzz.execute(input);

        assertEquals("FizzWhizz", result);
    }

    @Test
    public void when_number_is_multiple_of_5_and_7_return_BuzzWhizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 35;

        String result = fizzBuzz.execute(input);

        assertEquals("BuzzWhizz", result);
    }

    @Test
    public void when_number_is_multiple_of_3_and_5_and_7_return_FizzBuzzWhizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 105;

        String result = fizzBuzz.execute(input);

        assertEquals("FizzBuzzWhizz", result);
    }

    @Test
    public void when_number_contains_3_like_13_return_Fizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 13;

        String result = fizzBuzz.execute(input);

        assertEquals("Fizz", result);
    }

    @Test
    public void when_number_contains_3_like_30_return_Fizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 30;

        String result = fizzBuzz.execute(input);

        assertEquals("Fizz", result);
    }
}

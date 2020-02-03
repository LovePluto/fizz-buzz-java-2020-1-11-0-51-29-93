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
    public void when_number_is_3_return_Fizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 3;

        String result = fizzBuzz.execute(input);

        assertEquals("Fizz", result);
    }

    @Test
    public void when_number_is_5_return_Buzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 5;

        String result = fizzBuzz.execute(input);

        assertEquals("Buzz", result);
    }

    @Test
    public void when_number_is_7_return_Whizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 7;

        String result = fizzBuzz.execute(input);

        assertEquals("Whizz", result);
    }
}

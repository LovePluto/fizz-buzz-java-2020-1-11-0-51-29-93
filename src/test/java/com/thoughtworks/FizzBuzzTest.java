package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void when_number_return_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer input = 1;

        String result = fizzBuzz.execute(input);

        assertEquals("1", result);
    }
}

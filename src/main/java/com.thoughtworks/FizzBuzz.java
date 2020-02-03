package com.thoughtworks;

public class FizzBuzz {
    public String execute(int number) {

        String count = new String();
        if (number % 3 == 0) {
            count += "Fizz";
        }
        if (number % 5 == 0) {
            count += "Buzz";
        }
        if (number % 7 == 0) {
            count += "Whizz";
        }
        return stringIsEmpty(count) ? String.valueOf(number) : count;
    }

    private boolean stringIsEmpty(String input) {
        return input == null || input.length() == 0;
    }
}

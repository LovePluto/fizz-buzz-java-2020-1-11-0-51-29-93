package com.thoughtworks;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String execute(int number) {
        if (!numberContainChar('5', number)
                && numberContainChar('3', number)) {
            return FIZZ;
        }
        String count = "";
        if (number % 3 == 0) {
            count += FIZZ;
        }
        if (number % 5 == 0) {
            count += BUZZ;
        }
        if (number % 7 == 0) {
            count += WHIZZ;
        }
        return stringIsEmpty(count) ? String.valueOf(number) : count;
    }

    private boolean stringIsEmpty(String input) {
        return input == null || input.length() == 0;
    }

    private boolean numberContainChar(char contained, int number) {
        String temp = String.valueOf(number);
        return temp.contains(String.valueOf(contained));
    }
}

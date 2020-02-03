package com.thoughtworks;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    private static final String EMPTY_STRING = "";

    public String execute(int number) {
        if (!numberIsContainChar('5', number)
                && numberIsContainChar('3', number)) {
            return FIZZ;
        }
        StringBuilder temp = new StringBuilder();
        temp.append(getFizzByNumber(number));
        temp.append(getBuzzByNumber(number));
        temp.append(getWhizzByNumber(number));
        String count = temp.toString();
        return stringIsEmpty(count) ? String.valueOf(number) : count;
    }

    private boolean stringIsEmpty(String input) {
        return input == null || input.length() == 0;
    }

    private boolean numberIsContainChar(char contained, int number) {
        String temp = String.valueOf(number);
        return temp.contains(String.valueOf(contained));
    }

    private String getFizzByNumber(int number) {
        return number % 3 == 0 ? FIZZ : EMPTY_STRING;
    }

    private String getBuzzByNumber(int number) {
        return number % 5 == 0 ? BUZZ : EMPTY_STRING;
    }

    private String getWhizzByNumber(int number) {
        return number % 7 == 0 ? WHIZZ : EMPTY_STRING;
    }
}

package com.abhi.lambadaexamples;

interface Checker {
    boolean isEven(int number);
}

class CheckerImpl implements Checker {
    @Override
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

public class Example3 {
    public static void main(String[] args) {
        Checker checker = new CheckerImpl();
        System.out.println(checker.isEven(4)); // true
        System.out.println(checker.isEven(5)); // false
    }
}
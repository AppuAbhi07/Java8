package com.abhi.lambadaexamples;

interface NumberChecker {
    boolean isPositive(int num);
}

class NumberCheckerImpl implements NumberChecker {
    @Override
    public boolean isPositive(int num) {
        return num > 0;
    }
}

  class Example6 {
    public static void main(String[] args) {
        NumberChecker checker = new NumberCheckerImpl();
        System.out.println(checker.isPositive(5)); // Output: true
        System.out.println(checker.isPositive(-3)); // Output: false
    }
}

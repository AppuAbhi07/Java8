package com.abhi.lambadaexamples;


 class Example6WIthLmabda {
    public static void main(String[] args) {
        NumberChecker checker = num -> num > 0;
        System.out.println(checker.isPositive(5)); // Output: true
        System.out.println(checker.isPositive(-3)); // Output: false
    }
}

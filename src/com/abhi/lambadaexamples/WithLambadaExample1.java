package com.abhi.lambadaexamples;

public class WithLambadaExample1 {
    public static void main(String[] args) {
        Printer printer = message -> System.out.println(message);
        printer.print("Hello, World!");
    }
}

package com.abhi.functioalinterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);

        printMessage.accept("Hello, Java!"); // Output: Message: Hello, Java!
    }
}

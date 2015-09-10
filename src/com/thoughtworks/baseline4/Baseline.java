//takes the input from the user and calculate tax.
package com.thoughtworks.baseline4;

import java.util.Scanner;

public class Baseline {

    private ConsoleInput consoleInput;
    String userInput;

    public Baseline(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInput(new Scanner(System.in));
        Baseline baseline = new Baseline(consoleInput);
        baseline.start();
    }

    public void start() {
        userInput = consoleInput.getInput();
        parseInput(userInput);
    }

    public Product parseInput(String userInput) {
        String[] inputTokens = userInput.split(" ");
        double price = Double.parseDouble(inputTokens[inputTokens.length-1]);
        return new Product(price);
    }
}

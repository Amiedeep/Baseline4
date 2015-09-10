//takes the input from the user and calculate tax.
package com.thoughtworks.baseline4;

import java.util.ArrayList;
import java.util.Scanner;

public class Baseline {

    private ConsoleInput consoleInput;
    ArrayList<String> userInput;

    public Baseline(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
        userInput = new ArrayList<>();
    }

    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInput(new Scanner(System.in));
        Baseline baseline = new Baseline(consoleInput);
        baseline.start();
    }

    public void start() {
        String input;
        input = consoleInput.getInput();
        while(!input.equals("")) {
            userInput.add(input);
            parseInputAndCalculateTax(input);
            input = consoleInput.getInput();
        }
    }

    public double parseInputAndCalculateTax(String input) {
        return parseInput(input).calculateTax();
    }

    public Product parseInput(String userInput) {
        String[] inputTokens = userInput.split(" ");
        double price = Double.parseDouble(inputTokens[inputTokens.length-1]);
        return new Product(price);
    }
}

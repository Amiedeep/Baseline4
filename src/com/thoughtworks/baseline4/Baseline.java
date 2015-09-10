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
        displayOutput();
    }

    private void displayOutput() {
        System.out.println(userInput);
    }

    public double parseInputAndCalculateTax(String input) {
        Product product = parseInput(input);
        double tax = product.calculateTax();
        formatAndStoreInputIncludingTax(input, tax, product);
        return tax;
    }

    private void formatAndStoreInputIncludingTax(String input, double tax, Product product) {
        String[] inputTokens = input.split(" ");
        double price = product.getTotalPriceIncludingTaxes();
        inputTokens[inputTokens.length - 1] = ""+price;
        userInput.remove(input);

        userInput.add(String.join(" ", inputTokens));
    }

    public Product parseInput(String input) {
        String[] inputTokens = input.split(" ");
        double price = Double.parseDouble(inputTokens[inputTokens.length - 1]);
        return new Product(price);
    }
}

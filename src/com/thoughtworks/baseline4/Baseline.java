package com.thoughtworks.baseline4;

import java.util.Scanner;

//takes the input from the user and calculate tax.
public class Baseline {

    private ConsoleInput consoleInput;

    public Baseline(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInput(new Scanner(System.in));
        Baseline baseline = new Baseline(consoleInput);
        baseline.start();
    }

    public void start() {
        consoleInput.getInput();
    }
}

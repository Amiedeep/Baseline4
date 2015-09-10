package com.thoughtworks.baseline4;//takes the input from the user.
import java.util.Scanner;

public class ConsoleInput {

    private Scanner scanner;

    public ConsoleInput(Scanner scanner) {
        this.scanner = scanner;
    }
    public String getInput() {
        return scanner.nextLine();
    }
}

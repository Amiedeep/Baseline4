package com.thoughtworks.baseline4;

import com.thoughtworks.baseline4.ConsoleInput;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class ConsoleInputTest {

    private com.thoughtworks.baseline4.ConsoleInput consoleInput;

    @Test
    public void shouldReturnMeTheInputFromuserWhenICallGetInputMethod() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("some input".getBytes());
        System.setIn(inputStream);
        consoleInput = new ConsoleInput(new Scanner(System.in));

        assertEquals("some input", consoleInput.getInput());
    }
}
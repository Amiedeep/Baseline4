package com.thoughtworks.baseline4;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class BaselineTest {

    private Baseline baseline;
    private ConsoleInput consoleInput;
    ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        consoleInput = new ConsoleInput(new Scanner(System.in));
        baseline = new Baseline(consoleInput);
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void shouldStartTheApplicationAndWaitForUserInputAndDisplayOutputWhenICallStartMethod() {
        consoleInput = mock(ConsoleInput.class);
        baseline = new Baseline(consoleInput);

        when(consoleInput.getInput()).thenReturn("hxhd 4", "bd 5", "");

        baseline.start();

        verify(consoleInput, times(3)).getInput();

        assertEquals("[hxhd 4.4, bd 5.5]\n", outputStream.toString());
    }

    @Test
    public void shouldParseTheInputAndReturnMeTheObjectRequiredWhenICallParseInputMethod() {
        assertEquals(Product.class, baseline.parseInput("some input 4").getClass());
    }

    @Test
    public void shouldParseTheInputAndReturnMeTaxWhenICallParseInputAndCalculateTaxMethod() {

        assertEquals(64.80, baseline.parseInputAndCalculateTax("some product worth 647.747"));
    }
}
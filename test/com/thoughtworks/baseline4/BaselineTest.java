package com.thoughtworks.baseline4;

import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BaselineTest {

    private Baseline baseline;
    private ConsoleInput consoleInput;

    @Before
    public void setUp() {
        consoleInput = new ConsoleInput(new Scanner(System.in));
        baseline = new Baseline(consoleInput);
    }

    @Test
    public void shouldStartTheApplicationAndWaitForUserInputWhenICallStartMethod() {
        consoleInput = mock(ConsoleInput.class);
        baseline = new Baseline(consoleInput);

        baseline.start();

        verify(consoleInput, times(1)).getInput();
    }

    @Test
    public void shouldParseTheInputAndReturnMeTheObjectRequiredWhenICallParseInputMethod() {
        assertEquals(Product.class, baseline.parseInput("some input 4").getClass());
    }
}
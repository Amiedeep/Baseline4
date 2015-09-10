package com.thoughtworks.baseline4;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BaselineTest {

    private Baseline baseline;
    private ConsoleInput consoleInput;

    @Test
    public void shouldStartTheApplicationAndWaitForUserInputWhenICallStartMethod() {
        consoleInput = mock(ConsoleInput.class);
        baseline = new Baseline(consoleInput);

        baseline.start();

        verify(consoleInput, times(1)).getInput();
    }
}
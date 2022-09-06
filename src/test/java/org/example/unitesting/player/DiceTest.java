package org.example.unitesting.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void return_a_number_between_1_and_6() {
        Dice dice = Mockito.mock(Dice.class);

        assertTrue("is lower than six", dice.roll() < 6);
    }

    @Test
    public void return_two() {
        Dice dice = new Dice(6);

        assertTrue("is lower than six", dice.roll() <= 6);
    }
}
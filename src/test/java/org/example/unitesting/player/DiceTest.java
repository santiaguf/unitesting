package org.example.unitesting.player;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void return_a_number_between_1_and_6() {
        Dice dice = new Dice(6);

        assertTrue("is lower than six", dice.roll() < 6);
    }
}
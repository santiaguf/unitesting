package org.example.unitesting.player;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void loses_when_dice_number_is_to_low() {
        Dice dice = new Dice(6);
        Player player = new Player(dice, 2);
        assertEquals(false, player.play());
    }
}
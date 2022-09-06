package org.example.unitesting.player;

public class Player {

    private Dice dice;
    private int minNumberTowin;

    public Player(Dice dice, int minNumberTowin) {
        this.dice = dice;
        this.minNumberTowin = minNumberTowin;
    }

    public boolean play() {
        int diceNumber = dice.roll();
        return diceNumber > minNumberTowin;
    }
}

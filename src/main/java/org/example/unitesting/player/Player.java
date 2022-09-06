package org.example.unitesting.player;

public class Player {

    private Dice dice;
    private int minNumberTowin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberTowin = minNumberToWin;
    }

    public boolean play() {
        int diceNumber = dice.roll();
        return diceNumber > minNumberTowin;
    }
}

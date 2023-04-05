package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;

public class Simulation {
    private final Player player;
    private final Logger logger;

    public Simulation(Player player, Logger logger) {
        this.player = player;
        this.logger = logger;
    }

    public void loopUntilPlayerSucceed() {
        int currentTry = 1;
        int numberToGuess = player.getNumberToGuess();
        int guess = player.play();
        while (guess != numberToGuess) {
            logger.log("Try #" + currentTry + ": " + guess + " is " + (guess < numberToGuess ? "too low" : "too high"));
            guess = player.play();
            currentTry++;
        }
        logger.log("Success! The number to guess was " + numberToGuess + " and it took " + currentTry + " tries to guess it.");
    }
}

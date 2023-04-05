package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;

public class HumanPlayer implements Player {
    private final Logger logger = LoggerFactory.getLogger("player");
    private long lastGuess = 0;

    @Override
    public long askNextGuess() {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            logger.log("Enter a guess:");
            if (!scanner.hasNextLong()) {
                logger.log("Input must be a long number");
                scanner.nextLine();
                continue;
            }
            long num = scanner.nextLong();
            scanner.nextLine();
            lastGuess = num;
            return num;
        }

    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater) {
            logger.log("Your guess (" + lastGuess + ") was too low");
        } else {
            logger.log("Your guess (" + lastGuess + ") was too high");
        }
    }
}

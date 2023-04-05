public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
        logger.log("The number to guess is " + numberToGuess);
    }
    private boolean nextRound() {
        long guess = player.askNextGuess();
        logger.log("The player guessed " + guess);

        if (guess == numberToGuess) {
            logger.log("The player guessed the right number!");
            return true;
        } else if (guess < numberToGuess) {
            logger.log("The number to guess is greater");
            player.respond(true);
        } else {
            logger.log("The number to guess is lower");
            player.respond(false);
        }

        return false;
    }

    public void loopUntilPlayerSucceed() {
        boolean success = false;
        while (!success) {
            success = nextRound();
        }
	logger.log("Congratulations! You have found the number " + numberToGuess + "!");
    }
}

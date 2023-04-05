package fr.lernejo.guessgame;

public class Simulation {
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    private boolean nextRound() {
        // TODO Implement the nextRound method
        return false;
    }

    public void loopUntilPlayerSucceed(long limit) {
        boolean isFinished = false;
        long n = 0;
        long startTime = System.currentTimeMillis();
        while (!isFinished && n < limit) {
            isFinished = nextRound();
            n++;
        }
        long duringTime = System.currentTimeMillis() - startTime;
        // TODO log or print the duration
        if (isFinished)
            // TODO log or print the number of iterations
        else
            // TODO log or print the failure message
    }
}


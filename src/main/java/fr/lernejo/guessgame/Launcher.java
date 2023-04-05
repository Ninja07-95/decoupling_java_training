package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Launcher {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Launcher.class.getName());
        Simulation simulation = new Simulation(new HumanPlayer(), new RandomNumber(), logger);
        simulation.loopUntilPlayerSucceed();
    }
}


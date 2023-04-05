package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(Class<?> clazz) {
        return new ConsoleLogger(clazz);
    }
}


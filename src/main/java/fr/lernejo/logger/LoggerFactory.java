public class LoggerFactory {
    public static Logger getLogger(String name) {
        return new ConsoleLogger();
    }
}

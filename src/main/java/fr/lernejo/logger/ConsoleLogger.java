import java.util.Date;

public class ConsoleLogger implements Logger {
    public void log(String message) {
        Date now = new Date();
        System.out.println(now.toString() + " : " + message);
    }
}

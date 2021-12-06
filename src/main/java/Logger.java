import java.time.LocalDateTime;

public class Logger {
    protected int num = 1;
    private static Logger logger;
    public LocalDateTime time;

    private Logger() {}

    public void log(String msg) {
        System.out.println("[" + time.now() + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }
}

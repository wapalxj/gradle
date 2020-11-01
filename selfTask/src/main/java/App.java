import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;


public class App {
    static Logger log= (Logger) LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        log.info("vero");
    }
}

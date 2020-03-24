import org.apache.log4j.*;

public class Main {
    /**
     * 获取Logger
     */
    public static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("------------info--------------");
        logger.debug("------------debug--------------");
    }
}

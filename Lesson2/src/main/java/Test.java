import org.apache.log4j.Logger;

/**
 * Created by Yevhen Suturin
 */
public class Test {
    /**
     * test main method
     * @param args
     */
    static Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        logger.info("yo");
        System.out.println("Hello world!");
    }
}

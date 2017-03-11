package twerszko;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Tomasz on 2017-03-05.
 */
public class Main {
    private final static Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.info("port {}", TestPort.nextPort());
    }
}

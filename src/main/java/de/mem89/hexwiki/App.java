package de.mem89.hexwiki;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class App {

    public static void main(String[] args) {
        Logger LOGGER = LogManager.getLogger(App.class);

        LOGGER.info("This is an 'info' message");
        LOGGER.warn("This is a 'warn' message");
        LOGGER.error("This is an 'error' message");
        LOGGER.debug("This is a 'debug' message");
        LOGGER.trace("This is a 'trace' message");
    }
}

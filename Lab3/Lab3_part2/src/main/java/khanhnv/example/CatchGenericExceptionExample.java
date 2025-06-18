package khanhnv.example;

import java.util.logging.Logger;

public class CatchGenericExceptionExample {
    private static final Logger logger = Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            String s = null;

            if (s != null) {
                logger.info("Length: " + s.length());
            } else {
                logger.warning("Variable 's' is null.");
            }

        } catch (NullPointerException e) {
            logger.severe("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            logger.severe("Unexpected error: " + e.getMessage());
        }
    }
}

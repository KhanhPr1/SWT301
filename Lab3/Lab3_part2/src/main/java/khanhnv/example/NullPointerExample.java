package khanhnv.example;

import java.util.logging.Logger;

public class NullPointerExample {
    private static final Logger logger = Logger.getLogger(NullPointerExample.class.getName());

    public static void main(String[] args) {
        String text = null;

        if (text != null && !text.isEmpty()) {
            logger.info("Text is not empty");
        } else if (text == null) {
            logger.warning("Text is null");
        } else {
            logger.info("Text is empty");
        }
    }
}

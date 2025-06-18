package khanhnv.example;

import java.util.logging.Logger;

interface IPrinter {
    void print(String message);
}

class ConsolePrinter implements IPrinter {
    private static final Logger logger = Logger.getLogger(ConsolePrinter.class.getName());

    @Override
    public void print(String message) {
        logger.info(message);
    }
}

class Report {
    private final IPrinter printer;

    public Report(IPrinter printer) {
        this.printer = printer;
    }

    public void generate() {
        printer.print("Generating report...");
    }
}

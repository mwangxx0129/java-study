package com.xinxin.chain;

public class ChainClient {
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        System.out.println("=========tes case 1========");
        loggerChain.logMessage(AbstractLogger.INFO, "This is an info");
        System.out.println("=========tes case 2========");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug");
        System.out.println("=========tes case 3========");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error");
    }
}

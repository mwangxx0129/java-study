package com.xinxin.designpattern.chain;

public abstract class AbstractLogger {
    public static int INFO = 10;
    public static int DEBUG = 20;
    public static int ERROR = 30;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

     abstract void write(String message);

}

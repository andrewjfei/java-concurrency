package dev.andrewjfei.java.concurrency.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberUtil {

    private static Logger logger = LoggerFactory.getLogger(NumberUtil.class);

    public static int add(int a, int b) {
        logger.debug("Inputs [ a = {}, b = {} ]", a, b);
        return a + b;
    }

    public static int subtract(int a, int b) {
        logger.debug("Inputs [ a = {}, b = {} ]", a, b);
        return a - b;
    }

    public static int max(int a, int b) {
        logger.debug("Inputs [ a = {}, b = {} ]", a, b);
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        logger.debug("Inputs [ a = {}, b = {} ]", a, b);
        return a < b ? a : b;
    }

}

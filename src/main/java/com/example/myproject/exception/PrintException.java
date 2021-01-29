package com.example.myproject.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 异常日志打印
 */
public class PrintException {

    private static Logger logger = LoggerFactory.getLogger(PrintException.class);

    public static String getMessage(Exception e) {
        String swStr = null;
        try (
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw)) {
            e.printStackTrace(pw);
            pw.flush();
            sw.flush();
            swStr = sw.toString();
        } catch (IOException ex) {
            ex.printStackTrace();
            logger.error(ex.getMessage());
        }
        return swStr;
    }
}

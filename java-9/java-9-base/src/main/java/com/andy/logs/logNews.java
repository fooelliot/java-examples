package com.andy.logs;

import java.util.Currency;
import java.util.Set;

import static java.lang.System.Logger.Level.*;

/**
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-14 10:00
 **/
public class logNews {

//    private static final System.Logger logger = System.getLogger("Log4jLogger");
    private static final System.Logger logger = System.getLogger("Main");

    public static void main(String[] args) {

        Set<Currency> c = Currency.getAvailableCurrencies();
        System.out.println("# of currencies: " + c.size());
        logger.log(TRACE, "Entering application.");
        logger.log(ERROR, "An unknown error occurred.");
        logger.log(INFO, "info level log");
        logger.log(TRACE, "Exiting application.");
    }

}

package org.fundationjala.log4j;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Created by Administrator on 10/11/2016.
 */
public class Bar {
    static final Logger logger = LogManager.getLogger(Bar.class.getName());

    public boolean doIt() {
        logger.entry();
        logger.error("Did it again!");
        return logger.exit(false);
    }
}

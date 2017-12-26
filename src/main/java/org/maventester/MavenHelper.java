package org.maventester;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MavenHelper {

    private static final Logger log = LogManager.getLogger(MavenHelper.class);
    private String privStr = "";

    public MavenHelper(String str) {
        log.info("Constructor started");
        this.privStr = str;
        log.info("Constructor finished");
    }

    public String myMethod(String myStr) {
        log.info(" ... started");
        return this.privStr + myStr;
    }
}

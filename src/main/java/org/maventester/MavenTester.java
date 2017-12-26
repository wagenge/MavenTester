package org.maventester;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MavenTester {

    private static final Logger log = LogManager.getLogger(MavenTester.class);

    public static void main (String[] args) {

        MavenHelper mh = new MavenHelper("MavenHelper: ");

        log.info("Moin: {}", mh.myMethod("Hello World"));
    }
}

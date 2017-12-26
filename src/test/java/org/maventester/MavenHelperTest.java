package org.maventester;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.*;

public class MavenHelperTest {

    private static final Logger log = LogManager.getLogger(MavenHelperTest.class);

    @BeforeMethod
    public void setUp() {
        log.info("setUp");
    }

    @AfterMethod
    public void tearDown() {
        log.info("tearDown");
    }

    @Test(dataProvider = "testData_testMyMethod_ok")
    public void testMyMethod(String str0, String str1, String str2, String expStr) {
        log.info("test {} started", str0);


        MavenHelper mh = new MavenHelper(str1);
        String res = mh.myMethod(str2);

        assertEquals(res, expStr);
        assertThat(res).isEqualTo(expStr);

        log.info("test {} finished", str0);
    }

    //-----------------------------------------------------------------------------

    @DataProvider
    public Object[][] testData_testMyMethod_ok() {
        return new Object[][] {
                new Object[] {"test01",
                                "MavenHelper1: ",
                                "Hello World1",
                                "MavenHelper1: Hello World1"},
                new Object[] {"test02",
                                "MavenHelper2: ",
                                "Hello World2",
                                "MavenHelper2: Hello World2"},
        };
    }
}
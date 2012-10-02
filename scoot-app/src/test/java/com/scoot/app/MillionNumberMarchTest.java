package com.scoot.app;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

/**
 * MillionNumberMarch Tester.
 *
 * @author <Authors name>
 * @since <pre>01/17/2011</pre>
 * @version 1.0
 */
public class MillionNumberMarchTest extends TestCase {
    public MillionNumberMarchTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     *
     * Method: numberStringBuilder(final int numberMax)
     *
     */
    public void testNumberStringBuilder() throws Exception {
        //TODO: Test goes here...    \
        String output =  MillionNumberMarch.numberStringBuilder(1000);

        System.out.println("Printing the output of the string builder");

        System.out.println(output);

    }



    public static Test suite() {
        return new TestSuite(MillionNumberMarchTest.class);
    }
}

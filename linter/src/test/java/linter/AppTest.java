/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        //assertNotNull("app should have a greeting", classUnderTest.getGreeting());
       // assertNotNull("app should have a greeting", classUnderTest.getWeather());
        //assertEquals("51",classUnderTest.getWeather());
        assertEquals("will return later",classUnderTest.election());

    }
}

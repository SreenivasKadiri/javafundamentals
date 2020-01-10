package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void testSomeLibraryMethod() {
        Restaurant classUnderTest = new Restaurant();
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
        classUnderTest.setName("KFC");
        classUnderTest.setPrice(10);
        classUnderTest.setStars(5);
        System.out.println("The Restaurant Name is:"+classUnderTest.getName());
        System.out.println("The Restaurant Price is:"+classUnderTest.getPrice());
        System.out.println("The Restaurant Stars is:"+classUnderTest.getStars());

        assertEquals("KFC", classUnderTest.toString());

    }
}
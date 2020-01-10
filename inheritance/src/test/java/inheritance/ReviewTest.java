package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test public void testSomeLibraryMethod() {
        Review classUnderTest = new Review("Good Review", "Sreeni", 4);

        classUnderTest.setBody("The chicken wings are delicious");
        classUnderTest.setauthor("Awesome");
        classUnderTest.setStars(5);

        System.out.println("The Review Body is:"+classUnderTest.getBody());
        System.out.println("The Review Review is:"+classUnderTest.getAuthor());
        System.out.println("The Review Stars is:"+classUnderTest.getStars());

        assertEquals("The chicken wings are delicious", classUnderTest.toString());

    }
}
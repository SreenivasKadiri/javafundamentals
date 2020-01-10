package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantReviewTest {
    @Test public void testSomeLibraryMethod() {

        Restaurant newRest = new Restaurant("Pizza Hut",4, 10 );
        //newRest.setName("Pizza Hut");

        RestaurantReview classUnderTest = new RestaurantReview("Good Review", "Sreeni", 4, newRest);


        System.out.println("The RestaurantReviewTest Body is:"+classUnderTest.getBody());
        System.out.println("The RestaurantReviewTest Review is:"+classUnderTest.getAuthor());
        System.out.println("The RestaurantReviewTest Stars is:"+classUnderTest.getStars());
        System.out.println("The Restaurant name is:"+classUnderTest.g);

        //assertEquals("The chicken wings are delicious", classUnderTest.toString());

    }
}
package inheritance;

public class RestaurantReview extends Review {
    private Restaurant restaurant;


    RestaurantReview(String body, String author, int stars, Restaurant restaurant) {
        super (body,author,stars);
        this.restaurant = restaurant;
    }


}

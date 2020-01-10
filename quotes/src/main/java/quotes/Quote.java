package quotes;

public class Quote {
    private String author;
    private String text;

    public Quote(String author, String quote){
        this.author=author;
        this.text=quote;
    }


    @Override
    public String toString() {
        return "Quote{" +
                "author='" + author + '\'' +
                ", quote='" + text + '\'' +
                '}';
    }

    public String getQuote(){
        return "quote is: "+text;
    }
}

public class Book {
    private String title;
    private double price;

    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }
    public Book(String title){
        this.title = title;
        this.price = 0.0;
    }
    public double getPrice(){
        return price;
    }
}

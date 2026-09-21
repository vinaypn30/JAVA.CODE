import java.util.List;
class Book {
    String title;
    Book(String t) { this.title = t; }
}
public class AggregationDemo {
    List<Book> books;
    public AggregationDemo(List<Book> books) { this.books = books; }
    public static void main(String[] args) {
        java.util.List<Book> list = new java.util.ArrayList<>();
        list.add(new Book("A"));
        AggregationDemo lib = new AggregationDemo(list);
        System.out.println(lib.books.get(0).title);
    }
}

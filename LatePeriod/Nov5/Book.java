package Nov5;

public class Book implements Comparable<Book> {
    String title;
    int price;

    Book (String title ,int price){
        this.title = title;
        this.price = price;
    }
    @Override
    public int compareTo(Book book) {

        if (this.price < book.price) {
            return -1;
        } else if (this.price > book.price) {
            return 1;
        } else {
            return this.title.compareTo(book.title);
        }
    }

    public String toString(){
        return title;
    }

}

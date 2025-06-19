
public class Book extends AddB{
    String title;
    String author;
    int yearPublished;
    double price;    
    public static void main(String[] args) {
    
    AddB ab = new AddB();
    ab.AddBook("Java Programming", "John Smith", 2021, 39.99);
    ab.AddBook("Python Basics", "Jane Doe", 2020, 29.99);
    ab.AddBook("C++ Essentials", "Michael Johnson", 2019, 49.99);
    
    }
}

class AddB{
    int bookId = 0;
    String title;
    String author;
    int yearPublished;
    double price;    

    public void AddBook(String title, String author, int yearPublished, double price){

        Object[][] book = new Object[4][5];
        bookId += 1;

        book[0][0] = "Book " + bookId ;
        book[0][1] = "Title: " + title;
        book[0][2] = "Author: " + author;
        book[0][3] = "Year Published: " + yearPublished;
        book[0][4] = "Price: " + "$" + price;

        for (int w = book.length ; w <= book.length ; w++){
            for (int x = 0 ; x <= book.length ; x++){
                System.out.println(book[0][x]); 
            }
        }
        System.out.println();
    }
}

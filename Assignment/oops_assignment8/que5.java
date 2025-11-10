// Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.

import java.util.ArrayList;
class Library{
    ArrayList<Book>b = new ArrayList<Book>();

    public void addBook(Book book){
        b.add(book);
    }

    public void removeBook(Book book){
        b.remove(book);
    }

    public void displaybookddetail(){
        for(Book book:b){
            System.out.print(book.getFullDetail()+"\n");
        }
    }
}
class Book{
    private String title;
    private String author;
    private String isbn;
    public Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public Book(){}
    public String getFullDetail(){
        return title+"  : "+author+" : "+isbn;
    }


}
class Test{
    public static void main(String args[]){
        Book b1 = new Book("power","abc","5123");
        Book b2 = new Book("secret","xyz","1234");
        Book b3= new Book("karma","ABC","5678");
        Library bk=new Library();
        bk.addBook(b1);
        bk.addBook(b2);
        bk.addBook(b3);
        bk.displaybookddetail();
        System.out.println("_");
        bk.removeBook(b1);
        bk.displaybookddetail();


    }
}
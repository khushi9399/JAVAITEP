class Book{
    private String title;
    private String author;
    private int price;

    public void setTitle(String title){
        this.title=title;

    }
    public void setAuthor(String author){
        this.author=author;

    }
    public void setPrice(int price){
        this.price=price;

    }
    public void display(){
        System.out.println("book title="+title);
         System.out.println("book author="+author);
          System.out.println("book price="+price);
    }
}
class Test{
    public static void main(String args[]){
        Book b=new Book();
        b.setTitle(" You Can Win");
        b.setAuthor(" Rhonda");
        b.setPrice(299);
        b.display();
    }
}
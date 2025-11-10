class Movie{
    private String name;
    private String genre;
    private float rating;

    public void setName(String name){
        this.name=name;

    }
    public void setGenre(String genre){
        this.genre=genre;

    }
    public void setRating(float rating){
        this.rating=rating;

    }
    public void display(){
        System.out.println("Name="+name);
         System.out.println("genre="+genre);
          System.out.println("rating="+rating);
    }
    public boolean isHit(){
        if(this.rating>=8)
           return true;
        else
           return false;
    }
}
class Test{
    public static void main(String args[]){
        Movie m=new Movie();
        m.setName(" 3 Idiot");
        m.setGenre(" Motivational");
        m.setRating(5.2f);
        m.display();
        // m.isHit();
        // System.out.println(m.isHit()); //....if we want to only print..not store to any variable
         boolean movieIsHitOrNot = m.isHit(); //store in movieIsHitOrNot
         System.out.println(movieIsHitOrNot);
         
    }
}
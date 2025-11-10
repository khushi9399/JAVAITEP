// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    } 
    // public void setName(String name){
    //     this.name = name;
    // }
    //  public void setAge(int age){
    //     this.age = age;
    // }
    // public String getName(){
    //     return this.name;
    // }
    // public int getAge(){
    //     return this.age;
    // }
    public void display(){
        System.out.println("Name: "+name+ "Age: " +age);
    }
}
class Test{
    public static void main(String args[]){
     Person p1 = new Person("Ram ", 21);
     Person p2 = new Person("Shyam ", 22);
    //  p1.setAge(45);
    //  System.out.println(p1.getName() + " "+ p1.getAge());
    //  System.out.println(p2.getName() + " "+ p2.getAge());
     p1.display();
     p2.display(); 
    }
}


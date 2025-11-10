// Create a class Person with properties (name and age) with following features.
// Default age of person should be 18.
// A person object can be initialized with name and age.
// Method to display name and age of person.

import java.util.Scanner;
class Person{
    private String name;
    private int age;
 
    public void setName(String name){                //is it right or not..ask to anisha
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void display(){
        System.out.println("Name of person : "+this.name);
        System.out.println("Age of that person : "+this.age);
    }
}
class Test{
    public static void main(String args[]){
    Person p = new Person();
    p.setName("Khushi");
    p.setAge(18);
    p.display();

    }
}
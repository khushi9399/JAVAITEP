abstract class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract void eat();
    abstract void makeSound();

    public void showInfo(){
        System.out.println("Show the information of Animal--");
        System.out.println("Name of Animal : "+this.name);
        System.out.println("Age of Animal : "+this.age);
    }
}

interface Flyable{
    public void fly();
}

class Lion extends Animal{
    public Lion(String name, int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("Lion eats meat and primarily hunt large hoofed mammals");
    }

    public void makeSound(){
        System.out.println("Sound of lion is grunt, growl, moan, hiss and snarl");
    }
}

class Elephant extends Animal{
    public Elephant(String name, int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("Elephants eats grasses, leaves, fruits, roots etc.");
    }

    public void makeSound(){
        System.out.println("Sound of elephants is growls, squeaks, and snorts.");
    }
}

class Parrot extends Animal implements Flyable{
    public Parrot(String name, int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("Parrot eats seeds, nuts, fruits, vegetables, and sometimes insects.");
    }

    public void makeSound(){
        System.out.println("Sound of parrot as squawk, or sometimes a screech or chirp");
    }

    public void fly(){
        System.out.println("Parrot is fly..");
    }
}

class Test{
    public static void main(String args[]){
        Lion l = new Lion("Arjun",26);
        l.eat();
        l.makeSound();

        System.out.println();

        Elephant e = new Elephant("Vatsala",109);
        e.eat();
        e.makeSound();

        System.out.println();

        Parrot p = new Parrot("Grey Parrot", 40);
        p.eat();
        p.makeSound();
        p.fly();
    }
}
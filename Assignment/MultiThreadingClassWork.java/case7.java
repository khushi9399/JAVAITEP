class A{
    synchronized public void m1(B obj){
       obj.x2();
    }
    synchronized public void m2(){
        for(int i = 0; i<5; i++){
        System.out.println("class A-m2()");
        }
    }
}

class B{
    synchronized public void x1(A obj){
        obj.m2();
    }
    synchronized public void x2(){
        for(int i = 0; i<5; i++){
        System.out.println("class B-x2()");
        }
    }
}

class Myclass1 extends Thread{
    private A a;
    private B b;

    public Myclass1(A a , B b){
        this.a = a;
        this.b = b;
    }
    public void run(){
        a.m1(b);
    }
}

class Myclass2 extends Thread{
    private A a;
    private B b;

    public Myclass2(A a, B b){
        this.a = a;
        this.b = b;
    }
    public void run(){
        b.x1(a);
    }
}

class Test{
    public static void main(String args[]){
    A a = new A();
    B b = new B();

    Myclass1 t1 = new Myclass1(a,b);
    Myclass2 t2 = new Myclass2(a,b);

    t1.start();
    t2.start();
}
}
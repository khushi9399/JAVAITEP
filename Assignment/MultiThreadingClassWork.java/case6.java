class Task{
    synchronized public void m1(){
        for(int i = 0; i<5; i++){
            System.out.println("T1-m1()");
            try{
                Thread.sleep(3424);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    synchronized public void m2(){
        for(int i = 0; i<5; i++){
            System.out.println("T2-m2()");
            try{
                Thread.sleep(2424);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    synchronized public static void m3(){
        for(int i = 0; i<5; i++){
            System.out.println("T3-m3()");
            try{
                Thread.sleep(424);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    synchronized public static void m4(){
        for(int i = 0; i<5; i++){
            System.out.println("T4-m4()");
            try{
                Thread.sleep(5424);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Myclass1 extends Thread{
    private Task task;
    public Myclass1(Task task){
        this.task = task;
    }
    public void run(){
      task.m1();
    }
}

class Myclass2 extends Thread{
    private Task task;
    public Myclass2(Task task){
        this.task = task;
    }
    public void run(){
        task.m2();
    }
}
class Myclass3 extends Thread{
    private Task task;
    public Myclass3(Task task){
        this.task = task;
    }
    public void run(){
        Task.m3();
    }
}
class Myclass4 extends Thread{
    private Task task;
    public Myclass4(Task task){
        this.task = task;
    }
    public void run(){
        Task.m4();
    }
}

class Test{
    public static void main(String args[]){
    Task task = new Task();
    Myclass1 t1 = new Myclass1(task);
    Myclass2 t2 = new Myclass2(task);
    Myclass3 t3 = new Myclass3(task);
    Myclass4 t4 = new Myclass4(task);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    }
}
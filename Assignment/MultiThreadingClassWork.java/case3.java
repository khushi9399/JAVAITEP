class Task{
    public synchronized void m1(String threadName){
        for(int i=0; i<5; i++){
        System.out.println("M1 is executes by "+ threadName);
        try{
        Thread.sleep(2344);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    }

    public synchronized void m2(String threadName){
        for(int i=0; i<5; i++){
          System.out.println("M2 is executes by "+ threadName);
          try{
          Thread.sleep(556);
          }
          catch(Exception e){
            e.printStackTrace();
          }
        }
    }

    public void m3(String threadName){
        for(int i=0; i<5; i++){
        System.out.println("M3 is executes by "+ threadName);
        try{
            Thread.sleep(200);
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
        task.m1(Thread.currentThread().getName());
    }
}

class Myclass2 extends Thread{
    private Task task;
    public Myclass2(Task task){
        this.task = task;
    }
    public void run(){
        task.m2(Thread.currentThread().getName());
    }
}

class Myclass3 extends Thread{
    private Task task;
    public Myclass3(Task task){
        this.task = task;
    }
    public void run(){
        task.m3(Thread.currentThread().getName());
    }
}

class Test{
    public static void main(String args[]){
        Task task = new Task();
        Myclass1 t1 = new Myclass1(task);
        Myclass2 t2 = new Myclass2(task);
        Myclass3 t3 = new Myclass3(task);

        t1.start();
        t2.start();
        t3.start();
    }
}
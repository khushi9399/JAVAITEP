class Task{
    public synchronized void m1(String threadName){
        for(int i=0; i<5; i++){
        try{
        System.out.println("M1 is executes by "+ threadName);
        Thread.sleep(200);
        }
        catch(Exception e){
            e.printStackTrace();
        }
       }
    }
}

class Myclass extends Thread{
    private Task task;
    public Myclass(Task task){
        this.task = task;
    }
    public void run(){
        task.m1(Thread.currentThread().getName());
    }
}

class Test{
    public static void main(String args[]){
        Task task = new Task();
        Myclass t1 = new Myclass(task);
        Myclass t2 = new Myclass(task);

        t1.start();
        t2.start();


    }
}
class Task{
    public synchronized void m1(String threadName){
        for(int i = 0; i<5; i++){
        System.out.println("M1 is executes by "+ threadName);
        try{
            Thread.sleep(231);
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
        Task task1 = new Task();
        Task task2 = new Task();
        Myclass t1 = new Myclass(task1);
        Myclass t2 = new Myclass(task2);

        t1.start();
        t2.start();
    }
}
class SharedResource {
    int data;
    boolean available = false;

    synchronized void produce(int value) throws InterruptedException {
        while(available) wait(); // wait if data not consumed
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify(); // notify consumer
    }

    synchronized void consume() throws InterruptedException {
        while(!available) wait(); // wait if no data produced
        System.out.println("Consumed: " + data);
        available = false;
        notify(); // notify producer
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { resource.produce(i); } 
                catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { resource.consume(); } 
                catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        producer.start();
        consumer.start();
    }
}
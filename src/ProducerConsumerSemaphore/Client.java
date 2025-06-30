package ProducerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Semaphore prodSema = new Semaphore(5);
        Semaphore consSema = new Semaphore(0);
        Store store = new Store(5);

        // 8 threads constantly try to produce items.
        for (int i = 0; i < 8; i++) {
            es.submit(new Producer(store, prodSema, consSema));
        }

        // 8 threads constantly try to consume items.
        for (int i = 0; i < 8; i++) {
            es.submit(new Consumer(store, prodSema, consSema));
        }

    }
}

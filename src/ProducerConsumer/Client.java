package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        System.out.println("Store created with max shelve capacity: " + store.getMaxSize());

        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i < 8; i++) {
            es.submit(new Producer(store));
        }

        for (int i = 0; i < 8; i++) {
            es.submit(new Consumer(store));
        }

        es.shutdown();
    }
}

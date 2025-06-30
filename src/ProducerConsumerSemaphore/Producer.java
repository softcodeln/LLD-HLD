package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore prodSema;
    private Semaphore consSema;

    public Producer(Store store, Semaphore prodSema, Semaphore consSema) {
        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }

    @Override
    public void run() {
        while (true) {
            try {
                prodSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            if (store.getItems().size() < store.getMaxSize()) {
            store.addItem();
//            }
            System.out.println("Producer produced an item. Total items: " + store.getItems().size());
            consSema.release();
        }
    }

}

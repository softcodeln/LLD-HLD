package ProducerConsumerSemaphore;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize;
    private ConcurrentLinkedDeque<Object> items;

    public Store(int maxCapacity) {
        this.maxSize = maxCapacity;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Adding item to store, Producer producing items on current size : " + items.size());
        items.add(new Object());
    }

    public void removeItem() {
        System.out.println("Removing item from store, Consumer consuming items on current size : " + items.size());
        items.removeLast();//remove(items.size() - 1);
    }

}

package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Adding item to store, Producer producing items on current size : " + items.size());
        items.add(new Object());
    }

    public void removeItem() {
        System.out.println("Removing item from store, Consumer consuming items on current size : " + items.size());
        items.remove(items.size() - 1);
    }

}

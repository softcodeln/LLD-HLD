package AdderSubtractorSynchronised;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;

    public Adder(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 10000; i++) {
            synchronized (value) { // Synchronizing on the value object to ensure thread safety ,and we are using intrinsic locks here.
                value.x += i;
            }
        }
        return null;
    }

}

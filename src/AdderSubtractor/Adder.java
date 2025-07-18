package AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;

    public Adder(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 10000; i++) {
            value.x += i;
        }
        return null;
    }

}

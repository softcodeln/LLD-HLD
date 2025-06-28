package threadpools;

import java.util.concurrent.Callable;

public class NumberMultiplier implements Callable<Integer> {
    int n;
    public NumberMultiplier(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(10000);
        return n*10;
    }
}

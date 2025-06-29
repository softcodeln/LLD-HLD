package AdderSubtractorWithLocks;
// In this example, we have resolved the issue with multi-threading.

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();
        Lock lock = new ReentrantLock();

        System.out.println("Before :: value.x = " + value.x);

        try (ExecutorService es = Executors.newFixedThreadPool(2)) {
            Future<Void> adderFuture = es.submit(new Adder(value, lock));
            Future<Void> subtrctFuture = es.submit(new Subtractor(value, lock));

            adderFuture.get();
            subtrctFuture.get();
            System.out.println("After :: value.x = " + value.x);
        }

    }
}

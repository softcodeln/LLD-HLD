package AdderSubtractorSynchronised;
// In this example, we will observe the issue with multi-threading.

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();
        System.out.println("Before :: value.x = " + value.x);

        try (ExecutorService es = Executors.newFixedThreadPool(2)) {
            Future<Void> adderFuture = es.submit(new Adder(value));
            Future<Void> subtrctFuture = es.submit(new Subtractor(value));

            adderFuture.get();
            subtrctFuture.get();

            System.out.println("After :: value.x = " + value.x);
        }
    }
}

package threadpools;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Fixed Thread Pool
//        ExecutorService es = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 1000000; i++) {
//            Runnable task = new PrintGivenNumber(i);
//            es.execute(task);
//
//            if (i == 100) {
//                System.out.println("DEBUG");
//            }
//        }
//        // Shutdown the executor - this is crucial!
//        es.shutdown();

        // Cached Thread Pool - Never makes a task wait in queue
//        ExecutorService es = Executors.newCachedThreadPool();
//        for (int i = 0; i < 1000000; i++) {
//            Runnable task = new PrintGivenNumber(i);
//            es.execute(task);
//
//            if (i == 500) {
//                System.out.println("DEBUG");
//            }
//        }
//        es.shutdown();

        // Callable
        ExecutorService es2 = Executors.newCachedThreadPool();
        Future<Integer> futureResult1 = es2.submit(new NumberMultiplier(10));
        Future<Integer> futureResult2 = es2.submit(new NumberMultiplier(20));
        Future<Integer> futureResult3 = es2.submit(new NumberMultiplier(30));

        Integer result1 = futureResult1.get();
        Integer result2 = futureResult2.get();
        Integer result3 = futureResult3.get();

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        // Shutdown the executor - this is crucial!
        es2.shutdown();

    }
}

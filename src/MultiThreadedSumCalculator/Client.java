package MultiThreadedSumCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of available cores: " + cores);

        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            arr.add(i);
        }

        int chunkSize = arr.size() / cores;

        ExecutorService es = Executors.newCachedThreadPool();
        List<Future<Long>> sumArrFutures = new ArrayList<>();

        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = start + chunkSize;
            Callable<Long> task = new ArraySummation(arr, start, end);
            sumArrFutures.add(es.submit(task));
        }

        Long totalSum = 0L;
        for (Future<Long> future : sumArrFutures) {
            totalSum += future.get();
        }
        System.out.println("Total summ of array: " + totalSum);
        es.shutdown();
    }
}

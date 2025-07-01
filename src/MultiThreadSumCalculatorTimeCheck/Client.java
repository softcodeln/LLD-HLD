package MultiThreadSumCalculatorTimeCheck;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of available cores: " + cores);

        List<Integer> arr = new ArrayList<>();
        int sz = 100000;
        for (int i = 1; i <= sz; i++) {
            arr.add(i);
        }

        long t = 0L;
        LocalTime t1 = LocalTime.now();
        for(int i = 0; i < sz; i++)
            t += arr.get(i);
        LocalTime t2 = LocalTime.now();
        System.out.println("Execution Time Without Thread : " + (t2.getNano()-t1.getNano()));


        int chunkSize = arr.size() / cores;

        ExecutorService es = Executors.newCachedThreadPool();
        List<Future<Integer>> sumArrFutures = new ArrayList<>();

        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = start + chunkSize;
            Callable<Integer> task = new ArraySummation(arr, start, end);
            sumArrFutures.add(es.submit(task));
        }

        Integer totalSumTime = 0;
        for (Future<Integer> future : sumArrFutures) {
            totalSumTime += future.get();
        }
        System.out.println("Total summ of array: " + totalSumTime);
        es.shutdown();

    }
}

package MultiThreadedSumCalculator;

import java.util.List;
import java.util.concurrent.Callable;

public class ArraySummation implements Callable<Long> {
    List<Integer> arr;
    Integer start;
    Integer end;

    public ArraySummation(List<Integer> arr, Integer start, Integer end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public Long call() {
        Long sum = 0L;
        for (int i = start; i < end; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

}

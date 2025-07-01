package MultiThreadSumCalculatorTimeCheck;

import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.Callable;

public class ArraySummation implements Callable<Integer> {
    List<Integer> arr;
    Integer start;
    Integer end;

    public ArraySummation(List<Integer> arr, Integer start, Integer end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public Integer call() {
        Long sum = 0L;
        LocalTime startTime = LocalTime.now();
        for (int i = start; i < end; i++) {
            sum += arr.get(i);
        }
        LocalTime endTime = LocalTime.now();

        return endTime.getNano() - startTime.getNano();
    }

}

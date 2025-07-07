package Streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6);

        Stream<Integer> s = list1.stream();
        // Stream will not update original list;

        s = s.distinct();
        s = s.limit(4);
        s.forEach((elem)->{
            System.out.println("Element : " + elem);
        });

        List<Integer> list2 = list1
                .stream()
                .distinct()
                .limit(8)
                .collect(Collectors.toList());

        System.out.println(list2);

        Optional<Integer> x = list1.stream().distinct().findFirst();

        // Above forces us to do null check.
        if (x.isPresent()) {
            System.out.println("First value : " + x.get());
        }

        // filter, map, reduce
        List list3 = list1
                .stream()
                .distinct()
                .filter((elem_1) -> {
                    System.out.println("Filtering = " + elem_1);
                    return elem_1%2==0;
                })
                .map((elem_2) -> {
                    System.out.println( "Mapping = " + elem_2);
                    return elem_2 * elem_2;
                })
                .limit(2)
                .collect(Collectors.toList());

        System.out.println("After map and filter : " + list3);

        //Reduce - To accumulate
        int sum = 0;
        for (Integer elem : list1) {
            sum += elem;
        }

        Integer optSum = list1
                .stream()
                .reduce(0, (curr_sum, elem) -> {
                    return curr_sum + elem;
                });

        System.out.println("sum : " + sum + " , optSum : " + optSum);

    }
}

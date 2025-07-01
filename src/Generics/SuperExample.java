package Generics;

import java.util.*;

public class SuperExample {
    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<Number>();

        // ✅ You can add Integer or its subclasses
        list.add(10);         // OK
        list.add(20);         // OK

        // ❌ You cannot read as Integer directly
//         Integer num = list.get(0); // Compile-time error

        // ✅ You can read as Object
        Object obj = list.get(0);
        System.out.println(obj);  // Output: 10
    }
}
// This code demonstrates the use of the `? super T` wildcard in Java generics.
package Generics;

public class Pair<V, T> {
    V first;
    T second;

    public Pair() {
        System.out.println("Default constructor..");
    }

    public static <U> void doSomething(U num) {
        System.out.println("Doing something printing : " + num);
    }

}

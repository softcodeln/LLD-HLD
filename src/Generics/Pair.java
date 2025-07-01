package Generics;

public class Pair<V, T> {
    V first;
    T second;

    public Pair() {
        System.out.println("Default constructor..");
    }

    public Pair(V first, T second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(V first) {
        this.first = first;
    }

    public V getFirst() {
        return first;
    }

    public static <U> void doSomething(U num) {
        System.out.println("Doing something printing : " + num);
    }

}

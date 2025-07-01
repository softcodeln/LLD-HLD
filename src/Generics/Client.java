package Generics;

public class Client {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair();
        p1.first = "Hello";
        p1.second = 10;

        Pair p2 = new Pair();

        Pair.doSomething(10);
        Pair.doSomething("10");
        Pair.doSomething(10.256);
        Pair.doSomething(10.256F);

        Pair.<Integer>doSomething(10);
        Pair.<String>doSomething("10");
        Pair.<Double>doSomething(10.256);
        Pair.<Float>doSomething(10.256F);
    }
}

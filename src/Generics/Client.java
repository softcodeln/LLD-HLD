package Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {

    static void startEating(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair();
        p1.first = "Hello";
        p1.second = 10;

        Pair<Double, Double> p2 = new Pair<>();
        List<Integer> a = new ArrayList<>();

        Pair<Double, Double> p3 = new Pair<>(10.256, 20.256);

        p2.first = 12.22;
        p2.second = 33.333;

        Pair p4 = new Pair();

        Pair.<Integer>doSomething(10);
        Pair.<String>doSomething("10");
        Pair.<Double>doSomething(10.256);
        Pair.<Float>doSomething(10.256F);

        Pair.doSomething(10);
        Pair.doSomething("10");
        Pair.doSomething(10.256);
        Pair.doSomething(10.256F);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        startEating(dogs);

    }
}

// Wildcards - gives you upper bound
// Super - gives you lower bound
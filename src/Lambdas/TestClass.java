package Lambdas;

public class TestClass implements TestInterface{
    public Integer run(Integer x) {
        System.out.println("I am run function from TestClass with parameter: " + x);
        return x;
    }
}

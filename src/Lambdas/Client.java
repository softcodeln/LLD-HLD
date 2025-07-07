package Lambdas;

public class Client {
    public static void main(String[] args) {
        // Create a task and implement Runnable in it.
        Runnable task0 = new Printer();

        // Anonymous class
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                //Any logic that needs to be run on a diff thread.
                System.out.println("Running in a different thread using an anonymous class!");
            }
        };

        TestInterface task2 = (Integer a)->{
            System.out.println("I am Lambda function with parameter: " + a);
            return a;
        };

        TestInterface task3 = new TestClass();

        task0.run();
        task1.run();
        task2.run(12);
        System.out.println(task2.run(12));
        task3.run(12);
        System.out.println(task3.run(12));

        // Lambda
        Runnable task4 = () ->{
            System.out.println("Printing in Lambda");
        };
        // Only for one line
        Runnable task5 = () -> System.out.println("One line Lambda function");

        Thread t1 = new Thread(task4);
        t1.start();

        Thread t2 = new Thread(task5);
        t2.start();

    }
}

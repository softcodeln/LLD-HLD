package multiThreadedProgram;

public class Client {
    public static void main(String[] args) {

//        Printer printer = new Printer();
//        System.out.println("Inside main method.. " + Thread.currentThread().getName());
//        Thread t = new Thread(printer);
//        t.start();
//
//        Printer2 pthread = new Printer2();
//        pthread.start();

        for (int i = 0; i < 1000000; i++) {
            Runnable task = new PrintGivenNumber(i);
            Thread t2 = new Thread(task);
            t2.start();
        }

    }
}

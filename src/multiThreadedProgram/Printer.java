package multiThreadedProgram;

public class Printer implements Runnable {
    @Override
    public void run() {
        System.out.println("Printer started.. " + Thread.currentThread().getName());
    }
}

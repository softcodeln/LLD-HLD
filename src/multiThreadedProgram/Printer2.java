package multiThreadedProgram;

public class Printer2 extends Thread {

    public void run() {
        System.out.println("Printer2 started.. " + Thread.currentThread().getName());
    }
}

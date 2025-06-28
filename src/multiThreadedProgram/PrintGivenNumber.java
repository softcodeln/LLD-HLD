package multiThreadedProgram;

public class PrintGivenNumber implements Runnable{
    int n;
    public PrintGivenNumber(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println(n + " ==>  " + Thread.currentThread().getName());
    }
}

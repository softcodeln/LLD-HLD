package threadpools;

public class PrintGivenNumber implements Runnable{
    int n;
    public PrintGivenNumber(int n) {
        this.n = n;
    }

    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(n + " ==> " + Thread.currentThread().getName());
    }
}

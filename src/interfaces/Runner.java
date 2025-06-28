package interfaces;

public interface Runner {
    int x=1;

    default void run(){
        System.out.println("Running");
    }
}

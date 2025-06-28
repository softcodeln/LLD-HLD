package Bank;

class A{
    protected int a = 11;
    protected int c = 22;
}

class B extends A{
    protected int a = 33;
    protected int b = 44;
}

public class Client {
    public static void main(String[] args) {
        B obj = new B();

        System.out.println(obj.c);

    }
}

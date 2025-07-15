package Generics;

// This code demonstrates the use of generics in methods in java.
public class Util {

    public <U> void printArray(U[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Util util = new Util();
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "World", "Generics"};

        util.printArray(intArray);
        util.printArray(strArray);
    }
}
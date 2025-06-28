package copyconstructor;

public class Client {
    public static void main(String[] args) {
        Student s = new Student("Lucky", 20, "evening",  95f);

        Student s1 = s;

        Student s2 = new Student(s);

        s2.setName("Debu");

        System.out.println("DEBUG");
    }
}

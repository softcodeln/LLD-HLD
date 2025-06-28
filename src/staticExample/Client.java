package staticExample;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Total Students Created: " + s1.count); // Should print 3
        System.out.println("Total Students Created: " + Student.count); // Should print 3
    }
}

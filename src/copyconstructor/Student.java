package copyconstructor;

public class Student {

    private String name;
    public int age;
    public String batch;
    float psp;

    public Student(String name, int age, String batch, float psp) {
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp = psp;
    }

    public Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.batch = s.batch;
        this.psp = s.psp;
    }

    public void setName(String name){
        this.name = name;
    }

}

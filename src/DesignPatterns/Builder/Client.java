package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        // Version 1: Using the Builder Pattern to create a Student object
//        StudentBuilder studentBuilder = new StudentBuilder();
//        studentBuilder.setName("John Doe");
//        studentBuilder.setAge(20);
//        studentBuilder.setBatch("EveningLLD");
//        studentBuilder.setPsp(85.5f);
//
//        Student student = new Student(studentBuilder);
//        System.out.println("Student created: " + student.name + ", Age: " + student.age + ", Batch: " + student.batch + ", PSP: " + student.psp);

        // Version 2: Using the Builder Pattern to create a Student object
//        StudentBuilder studentBuilder = Student.getBuilder(); // There might be many builders, so we use a method to get what builder to use.
//        studentBuilder.setName("Lucky");
//        studentBuilder.setAge(27);
//        studentBuilder.setBatch("EveningLLD");
//        studentBuilder.setPsp(95.2f);
//
//        Student student = new Student(studentBuilder);
//        System.out.println("Student created: " + student.name + ", Age: " + student.age + ", Batch: " + student.batch + ", PSP: " + student.psp);

        // Version 3: In this version, we just do function chaining to make the code cleaner.
//        StudentBuilder studentBuilder =
//                Student.getBuilder()
//                        .setName("Lucky")
//                        .setAge(27)
//                        .setBatch("EveningLLD")
//                        .setPsp(95.2f);
//
//        Student student = new Student(studentBuilder);
//        System.out.println("Student created: " + student.name + ", Age: " + student.age + ", Batch: " + student.batch + ", PSP: " + student.psp);

        // Version 4 : Here we are using the build method to create the Student object.
        // So,no need to explicitly pass the StudentBuilder arg to Student constructor.
        Student student =
                Student.getBuilder()
                        .setName("Lucky")
                        .setAge(27)
                        .setBatch("EveningLLD")
                        .setPsp(95.2f)
                        .build();
        System.out.println("Student created: " + student.name + ", Age: " + student.age + ", Batch: " + student.batch + ", PSP: " + student.psp);
    }
}

// Many builders can be below
//StudentBuilder
//StudentProfile
//StudentProfileBuilder

//Example of a Car Builder Pattern
//Car  - 20 properties
//SUVcarsBuilder - 10 needed from user / 10 properties default
//HatchbackBuilder - 15 needed from user / 5 properties default
//SedanBuilder - 12 needed from user / 8 properties default

//Car.getBuilder("Sedan") - then return new SedanBuilder();
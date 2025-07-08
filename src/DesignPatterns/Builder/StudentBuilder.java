//package DesignPatterns.Builder;
//
//public class StudentBuilder {
//    String name;
//    int age;
//    String batch;
//    float psp;
//
//    public StudentBuilder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public StudentBuilder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public StudentBuilder setBatch(String batch) {
//        this.batch = batch;
//        return this;
//    }
//
//    public StudentBuilder setPsp(float psp) {
//        this.psp = psp;
//        return this;
//    }
//
//    Student build() {
//        if (this.name == null || this.name.isEmpty()) {
//            throw new RuntimeException("Name cannot be null or empty");
//        }
//
//        if (this.age < 18) {
//            throw new RuntimeException("Age cannot be less than 18");
//        }
//        return new Student(this);
//    }
//}

package base.chapter11;

public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());   //Student
        m(new Student());           //Student
        m(new Person());            //Person
        m(new Object());            //java.lang.Object@15db9742
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
    
}
class GraduateStudent extends Student {}
class Student extends Person {
    public String toString(){ return "Student"; }
}
class Person extends Object {
    public String toString() {
        return "Person";
    }
}

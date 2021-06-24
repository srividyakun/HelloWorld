package inheritance;

public class InheritacneConcept {
    public static void main(String[] args) {
        Person p1 = new Person();
        Student s1 = new Student();

        //you can assign child to parent(parents can take care of children)
        Person person = new Student();
        System.out.println(person.address+person.age+person.name);
        //person.marks//

        Student student = (Student) new Person();
    }


}

class Person{
    String name;
    String age;
    String address;
}

class Student extends Person {
    String marks;
    String rollNumber;
}

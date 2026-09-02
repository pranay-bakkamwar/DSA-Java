package OOPS;
class Person{
    Person(){
        System.out.println("hello I Am Person class");
    }
}
class Student extends Person{
    Student(){
        System.out.println("hello i am student class");
    }
}

public class sup {
    public static void main(String[] args){
        Student s1 = new Student();

    }
}

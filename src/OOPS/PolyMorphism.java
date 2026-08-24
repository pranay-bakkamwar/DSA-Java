package OOPS;

public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println("bhau bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow Moew");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello Bro");
        }
    }
    public static void main(String[] args) {
        Dog Leion= new Dog();
        Cat pussy = new Cat();
        Human pranay = new Human();

        Leion.speak();
        pussy.speak();
        pranay.speak();





    }
}

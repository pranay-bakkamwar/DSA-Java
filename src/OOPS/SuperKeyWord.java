package OOPS;
class Animal {
    Animal(){
        System.out.println("hey this is animal");
    }
//    Animal(int a ){
//        System.out.println("this is your good animal"+ a);
//    }
}
class Horse extends Animal{

    Horse(){
        super();
        System.out.println(" bear");
    }
}

public class SuperKeyWord {
    public static void main(String[] args) {
        Horse b1=new Horse();

    }
}

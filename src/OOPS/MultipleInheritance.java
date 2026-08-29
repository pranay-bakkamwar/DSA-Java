package OOPS;

interface Herbivore{
    void eatsVeg();
}
interface Carnivore{
    void eatsNonVeg();
}
class Bear implements Herbivore,Carnivore{

    public void eatsVeg() {
        System.out.println("eats veg");
    }
    public void eatsNonVeg(){
        System.out.println("eats non veg only");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Bear b1= new Bear();
        b1.eatsVeg();
        System.out.println("and");
        b1.eatsNonVeg();
    }
}

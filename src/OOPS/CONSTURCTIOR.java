package OOPS;
class Cars{
    String name ;
    int lenght;

    Cars(){
        System.out.println("constructor called");
    }
    Cars(String name){
        this.name=name;
    }
    Cars(String name,int lenght){
        this.name=name;
        this.lenght=lenght;
    }

}

public class CONSTURCTIOR {
    public static void main() {


        Cars Lambo = new Cars("Lambo",24);
    }
}

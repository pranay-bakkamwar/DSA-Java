package OOPS;

class Complexnumber {
    int x ;
    int y ;
    //Parameterized constructor
    Complexnumber(int x ,int y ){
        this.x=x;
        this.y=y;
    }
    //Print Function
    void print(){
        if (y>=0) {
            System.out.println(x+"+"+y+"i");
        } else {
            System.out.println(x +"-"+(-y)+"i");
        }
    }

}

public class CompexNumber {
    public static void main(String[] args) {

        Complexnumber c1=new Complexnumber(4,6);
        c1.print();
        Complexnumber c2=new Complexnumber(3,-2);
        c2.print();
    }
}

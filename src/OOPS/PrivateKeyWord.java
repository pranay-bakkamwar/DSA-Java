package OOPS;

class COLLAGE {
    private int rollno =54;    //this roll no cannot be accessed inside our main class cause this is private
    String name;
    Double cgpa;
    String Department;

    //here comes the concept of GETTERS AND SETTERS
    //creating a Method Into the Class TO Access The Roll no USING GETTERS;

    void getRollNo(){
        System.out.println(rollno);
    }


    //setters
    void setRollno(int x){
        this.rollno=x;                               //here is used a setter
    }
}

public class PrivateKeyWord {

    public static void main(String[] args) {

        COLLAGE s1 = new COLLAGE();

        s1.name="pranay";
        s1.cgpa=7.39;
        s1.Department="information technology";
        //System.out.println(s1.rollno);  this will not be accessed cause it is private


        //there is a way to access it that are getters
        s1.getRollNo();;              // this is the way i can access my roll no

        //if i wanted to set my roll no so we can use setetrs as well to set the no ;
        s1.setRollno(51);
        s1.getRollNo();
    }

}

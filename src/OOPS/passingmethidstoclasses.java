package OOPS;

import javax.xml.namespace.QName;

public class passingmethidstoclasses {
    public static class Students{
        int rollno;
        String name;
        Double cgpa;
        String Department;
        public void print(){
            System.out.println(rollno+" "+ name+" "+cgpa+" "+Department);
        }

    }
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.rollno=54;
        s1.name="pranay";
        s1.cgpa=7.39;
        s1.Department="information technology";
        s1.print();

    }

}

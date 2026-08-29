package OOPS;

public class userdefineddatatype {
    public static class Students{
        int rolln0;
        String name;
        Double cgpa;
        String Department;

    }
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.rolln0=54;
        s1.name="pranay";
        s1.cgpa=7.39;
        s1.Department="information technology";

        Students s2 = new Students();
        s2.rolln0=66;
        s2.name="mansi";
        s2.cgpa=8.5;
        s2.Department="Cosmetic technology";

        Students s3 = new Students();
        s3.rolln0=50;
        s3.name="Shubham";
        s3.cgpa=8.8;
        s3.Department="BAogy";

        Students s5;


        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);

    }

}

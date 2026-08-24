package OOPS;

public class passingobjectstomethods {
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
        change(s1);
        System.out.println(s1.cgpa); //pass By Refrence ;
    }

    public static void change(Students x) {
        x.cgpa=8.00;
    }
}

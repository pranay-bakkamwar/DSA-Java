package OOPS;

public class StaticKeyword {
    static int x = 10;

    public static class Student {
        // Move the assignment into a constructor or method
        public Student() {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        x = 15;

        Student s1=new Student();



    }
}


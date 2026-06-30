package conditional;
import java.util.Scanner;

public class integerornot {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        System.out.println("entre no =");
        double x = sc.nextDouble();

        //type conversion
        int n = (int)x;
        if (x-n == 0) System.out.println("integer");
        else System.out.println("not an integer");

    }
}

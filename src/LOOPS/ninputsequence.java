package LOOPS;
import java.util.Scanner;

public class ninputsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the no");
        int n = sc.nextInt();

        for (int i = 1,j=n; i <=j ; i++,j--) {
            System.out.println(i);
            System.out.println(j);

        }
    }
}

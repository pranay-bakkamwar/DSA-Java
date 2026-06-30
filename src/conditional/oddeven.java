package conditional;
import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner sc=new Scanner(System.in);
        System.out.println("entre teh no");
        int n = sc.nextInt();

        if (n%2==0){
            System.out.println("even no");
        }else
            System.out.println("odd no");
    }
}

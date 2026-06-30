package conditional;
import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh value of integer =");
        int n = sc.nextInt();
        if (n>=0){
            System.out.println(n);
        }else System.out.println(-n);
    }
}

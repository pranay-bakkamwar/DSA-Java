package conditional;
import java.util.Scanner;


public class divibyfiveorthree {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("entre teh no ");
        int x = sc.nextInt();

        if(x%5==0 || x%3==0){
            System.out.println("yes divisible ");
        }else System.out.println("not divisible");

    }
}

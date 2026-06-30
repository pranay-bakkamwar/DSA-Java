package LOOPS;
import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("entre how many prime no you want ");
        int n = sc.nextInt();
        for (int i =2;i<=n;i++){
            if(i%1==0 && i%i==0){
                System.out.println(i);
            }
        }

    }
}

package conditional;
import java.util.Scanner;


public class four_digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("entre the no ");
        int x  = sc.nextInt();

        if(x>999 && x<10000){
            System.out.println("the no is 4 digit");

        }

        else System.out.println("the no is not 4 digit ");



        System.out.println("everthing is running fine");
    }
}

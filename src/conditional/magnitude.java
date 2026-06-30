package conditional;

import java.util.Scanner;

public class magnitude {
    public static void main(String[] args) {
        int m = 69;
        Scanner sc = new Scanner(System.in);
        System.out.println("entre teh value ");
        int x = sc.nextInt();


        if(x<0){
            x=-x;
        }
        System.out.println(x);

        if (x<m) System.out.println("smaller");
        else System.out.println("magintude is greater ");


        System.out.println("everything is running fine");


    }
}

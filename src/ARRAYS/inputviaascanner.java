package ARRAYS;
import java.util.Scanner;

public class inputviaascanner {
    public static void main(String[] args) {
        int arr[]= new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=4; i++) {
            int x = sc.nextInt();
            arr[i]= x;
        }

        for (int i = 0; i <=4 ; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(arr[2]);}
}

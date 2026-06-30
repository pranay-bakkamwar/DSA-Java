package LOOPS;
import java.util.Scanner;


public class countno {
    public static void main(String[] args) {
        int x = 156749;
       int  count=0;

       while (x!=0){
           x=x/10;
           count++;

       }
        System.out.println(count);
    }

}

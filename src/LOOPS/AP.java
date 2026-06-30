package LOOPS;
import java.util.Scanner;


//logic {   2 5 8 11.....}
//the loop will start from 2 intial value
//the difference is 3 between all therefore updation will be 1+=3 by three
//now the condtion is ap the fromula for nth term in ap is //          =  i + (n-1) x d
//now i is given                                                        = i + (n-1) x 3
//                                                                       = i + (3n-3)
//                                                                         = 2 + 3n -3
//                                                                           = 3n-1-------> condition


public class AP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <=3*n-1 ; i+=3 ){
            System.out.println(i);

        }
    }
}

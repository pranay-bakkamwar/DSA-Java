package conditional;
import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        System.out.println("the program is running fine ");

        Scanner cost = new Scanner(System.in);
        System.out.println("entre cost of product");
        int c = cost.nextInt();

        Scanner sellprice = new Scanner(System.in);
        System.out.println("entre selling price");
        int s = sellprice.nextInt();

            if (s>c){
                System.out.println("seller has made profit");
                System.out.println(s-c);
            } else if (s==c) {
                System.out.println("no profit no loss");
            }else {
                System.out.println("loss");

            }

    }
}

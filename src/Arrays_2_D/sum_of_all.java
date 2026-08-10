package Arrays_2_D;

import java.util.Scanner;

public class sum_of_all {
    public static void main(String[] args) {
        int[][] arr= new int[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.print("entre the array");

        int sum=0;

        for(int i =0 ; i< 3;i++){
            for (int j =0;j<4;j++){
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        for(int i =0 ; i< 3;i++){
            for (int j =0;j<4;j++){
                sum+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}

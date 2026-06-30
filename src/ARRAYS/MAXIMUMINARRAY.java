package ARRAYS;

import java.util.Scanner;

public class MAXIMUMINARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];

        for(int i = 0 ;i <=n-1;i++){
            int A = sc.nextInt();
            arr[i]= A;

        }
        for (int i = 0; i <=n-1 ; i++) {
            System.out.print(arr[i]+ " ");

        }

        System.out.println();
        int max = arr[0];
        for(int i = 1 ;i<=n-1;i++){
            if (arr[i]>max)
                max = arr[i];
        }
        System.out.println(max);
    }
}

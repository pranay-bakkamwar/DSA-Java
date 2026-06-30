package ARRAYS;

import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i <=n-1; i++) {
            System.out.println("entre the first no "+ i);
            int x = sc.nextInt();
            arr[i]= x;
        }
        for (int j = 0; j <=n-1 ; j++) {
            sum = sum + arr[j];
        }
        System.out.println("the sum of array is "+ sum);
}

}

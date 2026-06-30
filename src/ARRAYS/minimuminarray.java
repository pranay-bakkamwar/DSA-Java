package ARRAYS;

import java.util.Scanner;

public class minimuminarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the size");
        int n= sc.nextInt();
        int arr[]= new int [n];

        for(int i = 0;i<=n-1;i++){
            System.out.println("entre the no ");
            int inp = sc.nextInt();
            arr[i]= inp;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=n-1;i++){
            if(arr[i]<min)
                min=arr[i];

        }
        System.out.println(min);
    }
}

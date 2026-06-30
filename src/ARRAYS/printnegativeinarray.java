package ARRAYS;

import java.util.Scanner;

public class printnegativeinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i <=n-1; i++) {
            System.out.println("entre the first no "+ i);
            int x = sc.nextInt();
            arr[i]= x;

        }
        for (int i = 0; i <=n-1 ; i++) {
            if (arr[i]<0){
                System.out.println("the no which is negative is "+arr[i]+ "present at index "+ i);
            }
        }
    }
}

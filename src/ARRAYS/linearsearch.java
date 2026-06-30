package ARRAYS;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the element");
        int target = sc.nextInt();


        for (int i =0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("index is "+ i);
            }
        }
    }

}

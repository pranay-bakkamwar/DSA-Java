package ARRAYS;

import java.util.Arrays;


public class sortbuiltin {

    public static void print(int[] arr) {
        for (int i =0 ;i <arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {

        int[]arr= {14,31,432,46,0};

        Arrays.sort(arr);
        print(arr);
    }
}

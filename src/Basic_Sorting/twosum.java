package Basic_Sorting;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int [] arr= {2, 7, 11, 15};
        Arrays.sort(arr);
        int target=18;
        int i= 0;
        int j =arr.length-1;
        while(i<j){
            if (arr[i]+arr[j]==target){
                System.out.println(arr[i]);
                System.out.println(arr[j]);
                break;

            } else if (arr[i]+arr[j]>target) {
                j--;
            } else if (arr[i]+arr[j]<target) {
                i++;
            }
        }

    }
}

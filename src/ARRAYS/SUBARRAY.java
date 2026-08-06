package ARRAYS;

import org.w3c.dom.ls.LSOutput;

public class SUBARRAY {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int n =arr.length;

        for (int i =0;i<n;i++){
            int start =i;
                for (int j =i;j<n;j++){
                    int end=j;
                    int sum=0;
                        for(int k=start;k<=end;k++) {
                            sum=sum+arr[k];
                        }
                        System.out.println(sum);
                    System.out.println();
                }

        }
    }
}

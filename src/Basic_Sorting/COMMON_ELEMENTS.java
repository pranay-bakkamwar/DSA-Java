package Basic_Sorting;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class COMMON_ELEMENTS {
    public static void print(int[]arr){
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] a={2,2,2};
        int [] b ={2};

        ArrayList<Integer> com=new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        print(a);
        System.out.println();
        print(b);
        System.out.println();

        int i =0;
        int j=0;
        while(i<a.length&&j<b.length){
            if(a[i]==b[j]){
                  com.add(a[i]);
                  i++;
                  j++;
            }
            else if (a[i]>b[j]) {
                j++;
            }
            else if (a[i]<b[j]) {
                i++;
            }
        }

        System.out.print(com);;
    }
}

package ARRAYS;


import java.util.Arrays;

public class shallowcopy_and_deepcopy {
    public static void main(String[] args) {
        //SHALLOW COPY
        int [] arr= {1,2,3,4,5};

        //int[] x = arr;     // this is shallow copy of your orginal array in this your new array poiner of the araay is
                            //pointing towards the orginal array of size thiere fore chages made in the new aaray will
                            //in the orginall array also

        //x[0]=100;
        //System.out.println(arr[0]); // original change

        //DEEP COPY

        int[] A = Arrays.copyOf(arr, arr.length);
        A[0]=100;
        System.out.println(arr[0]);
        System.out.println(A[0]);
    }
}

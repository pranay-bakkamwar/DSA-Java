package ARRAYS;

public class secondmaximum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,54,54};
        int smax=Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i= 0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]> smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}

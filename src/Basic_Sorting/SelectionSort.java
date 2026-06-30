package Basic_Sorting;
public class SelectionSort {
    public  static void print(int[]arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={64,25,12,22,11};
        int n = arr.length;
        for (int i = 0 ;i<n;i++) {
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[mindex];
            arr[mindex]=temp;

        }
        print(arr);
    }
}

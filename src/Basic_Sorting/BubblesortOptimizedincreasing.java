package Basic_Sorting;



public class BubblesortOptimizedincreasing {
    public static void print(int[] arr){
for(int i = 0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }
    public static void main(String[] args) {
        int [] arr= {5,4,9,2,4,6,3,7,0};
        int n = arr.length;
        for(int i = 0 ;i<n-1;i++){
            int swap=0;
            for(int j = 0 ;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
            print(arr);
    }

}

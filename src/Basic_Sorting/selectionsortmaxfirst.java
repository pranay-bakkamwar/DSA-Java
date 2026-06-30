package Basic_Sorting;

public class selectionsortmaxfirst {
    public static void main(String[] args) {
        int [] arr={64,25,12,22,11};
        int n = arr.length;

        for(int i = n-1;i>=0;i--){
            int max = Integer.MIN_VALUE;
            int maxdex= -1;
            for (int j = i;j>=0;j--){
                if(arr[j]>max){
                    max=arr[j];
                    maxdex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[maxdex];
            arr[maxdex]=temp;
        }
    }
}

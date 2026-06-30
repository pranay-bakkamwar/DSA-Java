package ARRAYS;

public class practice {
    public static void main(String[] args) {
        int []arr= {4, 0, 7, 0, 2, 8, 0, 1};
        int i = 0;
        int j = 0 ;
        int n =arr.length;
        while(j<n){
            if(arr[i]!=0){
                if(arr[j]==0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                i++;
                j++;
            }
        }
        for (int k = 0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

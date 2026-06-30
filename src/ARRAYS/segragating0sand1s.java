package ARRAYS;

public class segragating0sand1s {

    public static void print(int[]arr){
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        int [] arr={0,0,1,1,0};
        int n = arr.length-1;
        int i=0;
        int j=n;
        while(i<j)
        {
            if(arr[i]==0 && arr[j]==0){
                i++;
            }
            else if (arr[i]==0 && arr[j]==1) {
                i++;
                j--;
            }
            else if (arr[i]==1 && arr[j]==0) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if (arr[i]==1&&arr[j]==1) {
                j--;
            }
        }

    print(arr);
    }
}

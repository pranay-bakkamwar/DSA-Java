package ARRAYS;

public class wavearray {

    public static void print(int []arr){
        for (int  i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int []arr={2, 4, 7, 8, 9, 10};
        int i = 0;
        int j = 1;
        while(j<arr.length){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i=i+2;
            j=j+2;

        }

    print(arr);
    }
}

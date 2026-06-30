package Basic_Sorting;

public class BUBBLESORT2dec {
    public static void print(int [] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        //INITIALIZING ARRAY
        int[] arr = { 7, 9, 3, 5, 4, 2, 1, 8, 6, 0};
        //ARRAY LENGTH
        int n =arr.length;

        print(arr);
        System.out.println();

        //SORTING USING BUBBLE ALGORITHM
        for(int i = 0;i<n;i++){
            for (int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
        }
        print(arr);
        System.out.println();
    }
}


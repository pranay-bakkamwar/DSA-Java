package Basic_Sorting;

public class bubblesort1inceasing {
    public static void print(int [] arr) {
        for (int i = 0; i <arr.length ; i++) {
        System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        //INITIALIZING ARRAY
        int[] arr = {4, 0, 7, 0, 2, 8, 0, 1};
        //ARRAY LENGTH
        int n =arr.length-1;

        print(arr);
        System.out.println();

        //SORTING USING BUBBLE ALGORITHM
        for(int i = 0;i<n;i++){
            for (int j=0;j<n;j++){
                if(arr[j]<arr[j+1]){
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

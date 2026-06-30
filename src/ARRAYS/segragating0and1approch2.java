package ARRAYS;

public class segragating0and1approch2 {
    public static void print(int[]arr){
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {


        int[] arr = {0, 0, 1, 1, 0};
        int count0 = 0;

        for (int i = 0; i < arr.length;i++ ){
            if (arr[i]==0){
                count0++;
            }
        }

        for (int i=0;i<count0;i++){
            arr[i]=0;

        }
        for (int i =count0;i<arr.length;i++){
            arr[i]=1;
        }

    print(arr);
    }
}

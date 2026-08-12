package Arrays_2_D;

public class snake_pattern {
    public static void main(String[] args) {


        int[][] arr = {{11, 12, 13, 14}, {15, 16, 17, 18}, {19, 20, 21, 22}, {23, 24, 25, 26}};

        for (int i = 0; i < arr.length;i++){
            if (i%2==0){
                for (int j=0;j<arr[0].length;j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for (int j = arr[0].length-1 ;j >=0 ; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

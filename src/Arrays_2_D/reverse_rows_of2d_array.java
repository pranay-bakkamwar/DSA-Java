package Arrays_2_D;

public class reverse_rows_of2d_array {
    public static void main(String[] args) {
        int[][] arr = {{11, 12, 13, 14}, {15, 16, 17, 18}, {19, 20, 21, 22}, {23, 24, 25, 26}};

        for (int i=0;i<arr.length;i++){
            for (int j = arr[0].length-1; j >=0 ; j--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


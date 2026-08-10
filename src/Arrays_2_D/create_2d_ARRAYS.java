package Arrays_2_D;
import java.util.*;

public class create_2d_ARRAYS {

    public static void main(String[] args) {
        int[][] arr= new int[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.print("entre the array");


        for(int i =0 ; i< 3;i++){
            for (int j =0;j<4;j++){
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        for(int i =0 ; i< 3;i++){
            for (int j =0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }

}

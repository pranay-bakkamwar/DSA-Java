package Arrays_2_D;

public class max_of_2darray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{9,86,5,4},{22,43,781,5}};
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i< 3;i++){
            for (int j =0;j<4;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }

        }
        System.out.println(max);
    }
}

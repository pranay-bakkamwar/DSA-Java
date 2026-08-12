package Arrays_2_D;

public class row_with_max_sum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{9,86,5,4},{0,0,0,0},{1,5,8,3}};

        int maxsum=Integer.MIN_VALUE;
        int index=-1;
        for (int i =0;i<4;i++){
            int currentsum=0;
            for (int j=0;j<4;j++){
                currentsum+=arr[i][j];
                if (currentsum>maxsum){
                    index=i;
                }

            }

        }
        System.out.println(index);
    }
}

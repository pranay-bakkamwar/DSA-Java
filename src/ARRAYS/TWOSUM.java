package ARRAYS;

public class TWOSUM {
    public static void main(String[] args) {
        int[] arr= {1,2,5,1};
        int target = 3;
        boolean found = false;


        for(int i = 0 ;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++){

                if(arr[i]+arr[j]==target) {
                    System.out.println("index " + i + " " + j);
                    found=true;

                }
                if(found==true) break;
            }
        }
    }
}

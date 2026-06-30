package ARRAYS;

public class missingelement {
    public static void main(String[] args) {
        int []arr= {1,2,3,5,};
        int missing=0;
        int n = arr.length;
        for(int i = 0 ;i<arr.length-1;i++){
            for (int j = 1 ;j<=n;j++){
                if(arr[i]==j){
                    continue;
                }else missing=j;
            }

        }
        System.out.print(missing);
    }
}

package leetcode;

public class lowerbound {
    public static int lowerBound(int[] arr, int target){
        int left =0;
        int right=arr.length-1;
        int ans=arr.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if (arr[mid]>target){
                ans=mid;
                right=mid-1;
            } else if (arr[mid]<target) {
                left=mid+1;
            } else if (arr[mid]==target) {
                left=mid+1;
            }
        }

        return ans;

    }
    public static void main(String[] args) {

        int[]arr= {2,4,6,8,10};
        System.out.println(lowerBound(arr,4));
    }
}

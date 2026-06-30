package Binarysearch;

public class Binary_srch_acending {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,9,10};
        int n = arr.length;
        int left = 0;
        int right=n-1;
        int target=7;
        int idx= -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                idx=mid;
                break;
            } else if (arr[mid]<target) {
                left=mid+1;
            } else if (arr[mid]>target) {
                right=mid-1;
            }

        }
        System.out.println(idx);
    }
}

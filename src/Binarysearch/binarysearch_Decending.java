package Binarysearch;

public class binarysearch_Decending {
    public static void main(String[] args) {
        int [] arr= {9,8,7,6,5,4,3,2,1}; // array must be sorted;
        int n = arr.length;
        int left=0;
        int right=n-1;
        int target=10;
        int idx=-1;
        while(left<=right){
            int mid= (left+right)/2;

            if(arr[mid]>target){
                left=mid+1;
            }
            else if(arr[mid]<target){
                right=mid-1;
            } else if (arr[mid]==target) {
                idx=mid;
                break;
            }

        }
        System.out.println(idx);
    }
}

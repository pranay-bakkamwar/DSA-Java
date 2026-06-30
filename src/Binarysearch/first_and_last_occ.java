package Binarysearch;

public class first_and_last_occ {
    public static void main(String[] args) {
        int [] arr={5,7,7,8,8,10};
        int n = arr.length;
        int left = 0;
        int right=n-1;
        int target=8;
        int idx= -1;
        int firstidx=-1;
        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]==target){
                right=mid-1;
                firstidx=mid;
            } else if (arr[mid]<target) {
                left=mid+1;
            } else if (arr[mid]>target) {
                right=mid-1;
            }

        }

        left=0;
        right=n-1;
        int lastindex=-1;
        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]==target){
                left=mid+1;
                lastindex=mid;
            } else if (arr[mid]<target) {
                left=mid+1;
            } else if (arr[mid]>target) {
                right=mid-1;
            }

        }
        System.out.println(firstidx+" "+lastindex);

    }
}

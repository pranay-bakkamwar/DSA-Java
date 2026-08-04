package leetcode;
//
public class java34 {
//    class Solution {
//        public int[] searchRange(int[] arr, int target) {
//            int n = arr.length;
//            int left=0;
//            int right=n-1;
//            int firstidx =-1;
//            int lastidx= -1;
//            while(left<=right){
//                int mid = (left+right)/2;
//
//                if(arr[mid]==target){
//                    firstidx=mid;
//                    right=mid-1;
//                } else if (arr[mid]<target) {
//                    left=mid+1;
//                } else if (arr[mid]>target) {
//                    right=mid-1;
//                }
//
//            }
//            left=0;
//            right=n-1;
//            while(left<=right){
//                int mid = (left+right)/2;
//
//                if(arr[mid]==target){
//                    lastidx=mid;
//                    left=mid+1;
//                } else if (arr[mid]<target) {
//                    left=mid+1;
//                } else if (arr[mid]>target) {
//                    right=mid-1;
//                }
//
//            }
//            return new int[]{firstidx,lastidx};
//
//        }
//    }
}

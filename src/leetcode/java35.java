package leetcode;

public class java35 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int n =nums.length;
            int left = 0;
            int right =n-1;
            int found=0;
            while(left<=right){
                int mid=(left+right)/2;
                if(nums[mid]>target){
                    right=mid-1;
                }
                else if(nums[mid]<target){
                    left=mid+1;

                }
                else if(nums[mid]==target){
                    return mid;
                }
            }
            return left;
        }
    }
}

package Binarysearch;

public class peakinamountain {
    public static void main(String[] args) {
        int []arr={0,2,1,0};
        int n =arr.length;
        int left=1;
        int right=n-2;
        int idx=-1;

        while(left<=right){
            int mid=(left+right)/2;

            // Increasing Slope
            if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }

            // Peak Found
            else if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                idx=mid;
                break;

            }

            // Decreasing Slope
            else if(arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]){
                right = mid - 1;
            }
        }
        System.out.println(idxw);
    }
}

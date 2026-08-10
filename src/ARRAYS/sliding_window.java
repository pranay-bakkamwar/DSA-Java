package ARRAYS;

public class sliding_window {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 2;

        int sum = 0;
        int maxSum = 0;

        // Step 1: Calculate first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        // Step 2: Store first window
        maxSum = sum;

        // Step 3: Slide the window
        for (int i = k; i < arr.length; i++) {

            // Remove outgoing element and add incoming element
            sum = sum - arr[i - k] + arr[i];

            // Update answer
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("Maximum Sum = " + maxSum/k);
    }
}
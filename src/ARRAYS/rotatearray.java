package ARRAYS;

public class rotatearray {
    public static void main(String[] args) {

        int[] arr1 = {1, 23, 4, 5, 66};
        int[] arr2 = new int[arr1.length];

        int k = 2;
        int n = arr1.length;

        // First n-k elements ko right shift karo
        for (int i = k, j = 0; i < n; i++, j++) {
            arr2[i] = arr1[j];
        }

        // Last k elements ko beginning me daalo
        for (int a = 0, b = n - k; a < k; a++, b++) {
            arr2[a] = arr1[b];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
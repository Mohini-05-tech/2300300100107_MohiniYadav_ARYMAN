import java.util.*;
public class Maximum_Size_Subarray_Sum {
    public static void main(String[] args) {
        Scanneer sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the subarray (k): ");
        int k = sc.nextInt();

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum);
    }
}
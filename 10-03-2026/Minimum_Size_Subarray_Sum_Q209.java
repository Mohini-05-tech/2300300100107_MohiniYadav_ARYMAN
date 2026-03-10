import java.util.*;
public class Minimum_Size_Subarray_Sum_Q209 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println("Minimum length subarray: 0");
        } else {
            System.out.println("Minimum length subarray: " + minLength);
        }
    }
}
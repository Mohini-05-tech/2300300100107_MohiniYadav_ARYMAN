import java.util.Scanner;

public class Search_In_Nearly_Sorted_Array {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements (nearly sorted): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int start = 0;
        int end = n - 1;
        int index = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            }

            if (mid - 1 >= start && arr[mid - 1] == target) {
                index = mid - 1;
                break;
            }

            if (mid + 1 <= end && arr[mid + 1] == target) {
                index = mid + 1;
                break;
            }

            if (target < arr[mid]) {
                end = mid - 2;
            } else {
                start = mid + 2;
            }
        }

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");

        sc.close();
    }
}
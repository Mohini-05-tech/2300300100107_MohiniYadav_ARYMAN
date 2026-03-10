import java.util.*;
public class Odd_Appearing_Element {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of the array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }   int low = 0, high = n - 1;
            while (low < high) {
                int mid = low + (high - low) / 2;
                
                // Make mid even
                if (mid % 2 == 1) {
                    mid--;
                }
                
                if (arr[mid] == arr[mid + 1]) {
                    low = mid + 2;
                } else {
                    high = mid;
                }
            }   
            System.out.println("\nOdd Appearing Element: "+arr[low]);
        }
    }
}

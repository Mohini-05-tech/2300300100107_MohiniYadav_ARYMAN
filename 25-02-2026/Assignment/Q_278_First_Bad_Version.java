import java.util.Scanner;

public class Q_278_First_Bad_Version {

    static int badVersion;   // stores first bad version

    // Function to check whether a version is bad
    static boolean isBadVersion(int version) {
        return version >= badVersion;
    }

    // Function to find first bad version using Binary Search
    static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = (start + end) / 2;

            if (isBadVersion(mid)) {
                end = mid;          // Search in left half
            } else {
                start = mid + 1;    // Search in right half
            }
        }

        return start;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total versions: ");
        int n = sc.nextInt();

        System.out.print("Enter first bad version: ");
        badVersion = sc.nextInt();

        int result = firstBadVersion(n);

        System.out.println("First Bad Version is: " + result);

        sc.close();
    }
}
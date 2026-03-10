import java.util.*;
public class Koko_Eating_Banana_Q875 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of piles: ");
        int n = sc.nextInt();

        int[] piles = new int[n];
        System.out.print("Enter the number of bananas each pile has: ");
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        System.out.print("Enter the hours Koko have: ");
        int h = sc.nextInt();

        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int answer = right;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;   // ✅ Correct ceil division
            }

            if (hours <= h) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("Minimum Eating Speed: " + answer);

        sc.close();
    }
}

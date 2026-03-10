import java.util.Scanner;

public class Divide_Two_Number_Using_BS {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int start = 0;
        int end = dividend;
        int ans = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid * divisor == dividend) {
                ans = mid;
                break;
            }

            if (mid * divisor < dividend) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Quotient is: " + ans);

        sc.close();
    }
}
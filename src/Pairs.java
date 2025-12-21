import java.util.*;

public class Pairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int k = 0; k < t; k++) {
            int n = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            Arrays.sort(arr);
            int minDiff = Integer.MAX_VALUE;

            for (int i = 1; i < n; i++) {
                minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
            }

            System.out.println(minDiff);
        }
    }
}

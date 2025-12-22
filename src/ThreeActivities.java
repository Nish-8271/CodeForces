import java.util.*;

public class ThreeActivities {
    static int[] getBest3(int[] a) {
        int mx1 = -1, mx2 = -1, mx3 = -1;

        for (int i = 0; i < a.length; i++) {
            if (mx1 == -1 || a[i] > a[mx1]) {
                mx3 = mx2;
                mx2 = mx1;
                mx1 = i;
            } else if (mx2 == -1 || a[i] > a[mx2]) {
                mx3 = mx2;
                mx2 = i;
            } else if (mx3 == -1 || a[i] > a[mx3]) {
                mx3 = i;
            }
        }
        return new int[]{mx1, mx2, mx3};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            for (int i = 0; i < n; i++) c[i] = sc.nextInt();

            int ans = 0;
            int[] A = getBest3(a);
            int[] B = getBest3(b);
            int[] C = getBest3(c);

            for (int x : A) {
                for (int y : B) {
                    for (int z : C) {
                        if (x != -1 && y != -1 && z != -1 &&
                                x != y && x != z && y != z) {
                            ans = Math.max(ans, a[x] + b[y] + c[z]);
                        }
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}

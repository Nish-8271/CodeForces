import java.util.*;
public class The67thPermutationProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int low = 1;
            int high = 3 * n;
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(low++);
                arr.add(high--);
                arr.add(high--);
            }

            for (int i = 0; i < arr.size()-1; i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.print(arr.get(arr.size()-1));
            System.out.println();
        }

    }
}
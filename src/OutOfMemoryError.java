import java.util.*;

public class OutOfMemoryError {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n= in.nextInt();
            int m=in.nextInt();
            int h= in.nextInt();
            int[] arr=new int[n];
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                int temp= in.nextInt();
                arr[i]=temp;
                a[i]=temp;
            }

            for(int i=0;i<m;i++) {
                int j = in.nextInt();
                int k = in.nextInt();
                if (a[j - 1] + k < h) {
                    a[j - 1] += k;
                } else {
                    System.arraycopy(arr, 0, a, 0, n);
                }
            }
            for(int i:a){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

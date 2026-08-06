import java.util.*;
public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)arr[i]= in.nextInt();
            if(arr[0]==1) System.out.println("Yes");
            else System.out.println("NO");
        }
    }
}

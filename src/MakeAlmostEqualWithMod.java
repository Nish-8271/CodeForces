import java.util.*;

public class MakeAlmostEqualWithMod {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int max=0;
            int n= in.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) {
                int temp = in.nextInt();
                max = temp > max ? temp : max;
                arr[i] = temp;
            }
            for(int i=2;i<=max;i*=2){
                Set<Integer> set=new TreeSet<>();
                for(int tr:arr) {
                    set.add(tr % i);
                }
                if(set.size()==2){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}

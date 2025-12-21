import java.util.*;

public class Apple {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            TreeSet<Integer> set=new TreeSet<>();
            for(int i=0;i<n;i++){
                int temp= in.nextInt();
                set.add(temp);
            }
            int ans=set.size();
            System.out.println(ans);
         }
        in.close();
    }
}

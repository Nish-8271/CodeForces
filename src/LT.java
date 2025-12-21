import java.util.*;
import java.util.function.DoubleToIntFunction;

public class LT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int x= in.nextInt();
            int max=0;
            int min=100;
            int b=0;
            int maxDiff=0;
            for(int i=0;i<n;i++){
                int a=in.nextInt();
                if(a>max){
                    max=a;
                }
                if(a<min){
                    min=a;
                }
                maxDiff= maxDiff>(a-b)?maxDiff:(a-b);
                b=a;
            }
            int ans=Math.max((min),Math.max(maxDiff,(x-max)*2));
            System.out.println(ans);
        }
        in.close();
    }
}

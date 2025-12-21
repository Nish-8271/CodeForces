import java.util.*;
public class Susp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int y=in.nextInt();
            int r=in.nextInt();
            int ans=0;
            if(r!=0 && n>=r)
            ans=r;
            n-=r;
            while((y/2)<=n){
                if(y<2)break;
                ans+=1;
                y-=2;
                n-=1;
            }
            System.out.println(ans);
        }
    }
}

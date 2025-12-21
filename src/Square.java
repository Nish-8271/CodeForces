import java.util.*;

public class Square {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int d=in.nextInt();
            if(a!=b || b!=c || c!=d || d!=a){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}

import java.util.*;

public class YName {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        while(test-->0){
            int n=in.nextInt();
            String s=in.next();
            String t=in.next();
            char[] a=new char[n];
            char[] b=new char[n];
            for(int i=0;i<n;i++){
                a[i]=s.charAt(i);
                b[i]=t.charAt(i);
            }
            Arrays.sort(a);
            Arrays.sort(b);
            boolean flag=true;
            for(int i=0;i<n;i++){
                if(a[i]!=b[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

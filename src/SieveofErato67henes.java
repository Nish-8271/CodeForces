import java.util.*;
public class SieveofErato67henes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            boolean one=false;
            boolean six=false;
            for(int i=0;i<n;i++){
                int temp=in.nextInt();
                one=(temp==1)?true:one;
                six=(temp==67)?true:six;
            }
            if(one==true && six==true){
                System.out.println("YES");
            }else if(six==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

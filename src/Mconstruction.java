import java.util.*;

public class Mconstruction {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int n= in.nextInt();
//            System.out.println();
            for (int i = n; i>=1 ; i--) {
                System.out.print(i+" ");
            }
            System.out.print(n);
            for (int i=1;i<n;i++){
                System.out.print(" " +i);
            }
//            System.out.println();
            t--;
        }
    }
}

import java.util.*;

public class Positive {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();
        for(int k=0;k<t;k++) {
            int n = in.nextInt();
            int negative = 0;
            int zeroes = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int x=in.nextInt();
                if(x==0){
                    zeroes++;
                }else if(x<0){
                    negative++;
                }
                arr[i]=x;
            }
            int op=0;
            if(negative%2==1){
                op+=2;
            }
            op+=zeroes;
            System.out.println(op);
        }
    }
}

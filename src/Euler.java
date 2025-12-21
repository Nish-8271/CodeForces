import java.util.*;

public class Euler {
    public static void main(String[] args) {
        long n=14100;
        long sum=0;
        for(long i=1;i<=n;i++){
            long sq=i*i;
            if((sq%2)!=0){
                sum+=sq;
            }
        }
        System.out.print(sum);
    }
}

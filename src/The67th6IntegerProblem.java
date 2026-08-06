import java.util.*;

public class The67th6IntegerProblem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int[] temp=new int[7];
            for(int i=0;i<7;i++){
                temp[i]=in.nextInt();
            }
            Arrays.sort(temp);
            int sum=0;
            for(int i=0;i<6;i++){
                sum+=(temp[i]*-1);
            }
            sum+=temp[6];
            System.out.println(sum);
        }
    }
}

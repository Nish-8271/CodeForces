import java.util.*;
public class Rose {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            int k=in.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                int temp=in.nextInt();
                arr[j]=temp;
            }
            boolean[] present=new boolean[k];
            int count=0;
            for(int num:arr){
                if(num<k){
                    present[num]=true;
                }else if(num==k){
                    count++;
                }
            }
            int missing=0;
        for(int l=0;l<k;l++){
            if(!present[i]){
                missing++;
            }
        }
           int help=Math.max(count,missing);
            System.out.println(help);
        }
    }
}

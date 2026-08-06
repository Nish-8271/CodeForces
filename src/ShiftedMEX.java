import java.util.*;

public class ShiftedMEX {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();;
        while(t-->0){
            int n= in.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=in.nextInt();
            Arrays.sort(arr);
            int temp=0;
//            if(arr[0]!=0)temp=-arr[0];
            int j=0;
            while(j<n && arr[j]!=0)j++;
            if(j!=n)temp=-arr[j];
            for(int i=0;i<n;i++){
                arr[i]+=temp;
            }
            for(int i=0;i<n;i++){
                if(arr[i]!=i) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}

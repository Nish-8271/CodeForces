import java.util.*;

public class CP1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            if(isSorted(arr)||k>1){
                System.out.println("YES");
            }else {

                System.out.println("NO");
            }
        }
//        in.close();
    }
    public static boolean isSorted(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}

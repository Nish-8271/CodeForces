import java.util.*;
public class Heapify {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
        int n=in.nextInt();
        int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            for(int i=0;i<n/2;i++){
                if(arr[i]>arr[2*i+1]){
                    swap(arr,i);
                }
            }
            boolean flag=true;
            for(int i=1;i<n;i++){
                if(arr[i]<arr[i-1]){
                    flag=false;
                    break;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static void swap(int[] arr,int i){
        int a=arr[2*i+1];
        arr[2*i+1]=arr[i];
        arr[i]=a;
    }
}

import java.util.*;

//import static java.util.Collections.swap;

public class Wand {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        while(test-->0) {
            int n= in.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            int i=0;
            while(i<n-1){
                for(int j=i+1;j<n;j++){
                    if(arr[i]%2 != arr[j]%2){
                        if(arr[i]>arr[j]){
                            swap(arr,i,j);
                        }
                    }
                }
                i++;
            }
//            System.out.println(arr.toString());
            for(int x:arr){
                System.out.print(x);
            }
            System.out.println();
        }
    }
    public static void swap(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}

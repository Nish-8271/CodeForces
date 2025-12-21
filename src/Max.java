import java.util.*;
public class Max {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();

        while(t-->0){
            int n=in.nextInt();
            int[][] arr=new int[n][n];
            int x=1;

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=x;
                    x++;
                }
            }
           int[][] sum=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    sum[i][j]=help(arr,i,j,n);
                }
            }
          int max=sum[0][0];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(sum[i][j]>max){
                        max=sum[i][j];
                    }
                }
            }
            System.out.println(max);
        }
    }
    static int help(int[][] arr,int i,int j ,int n){
        int sum=arr[i][j];
        if(j-1>=0){
            sum+=arr[i][j-1];
        }
        if(i-1 >=0){
            sum+=arr[i-1][j];
        }
        if(j+1<n){
            sum+=arr[i][j+1];
        }
        if(i+1 <n)
            sum+=arr[i+1][j];

        return sum;
    }
}

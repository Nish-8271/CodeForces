import  java.util.*;

public class Escape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int tc = 0; tc < t; tc++) {
            int n= in.nextInt();
            int k= in.nextInt();
            help(n,k);
        }
    }
    static void help(int n,int k){
        if(k==(n*n)-1){
            System.out.println("No");
            return;
        }
        if(k==n*n){
            System.out.println("yes");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("U");
                }
                System.out.println();
            }
            return;

        }
        int temp=n*n-k;

        char[][] arr=new char[n][n];
        arr[0][0]='R';
        arr[0][1]='L';

        for(int i=2;i<n*n-k;i++){
          int r=i/n;
          int c=i%n;
          if(r==0){
              arr[r][c]='L';

          }else{
              arr[r][c]='U';
          }
        }
        for(int i=n*n-k;i<n*n;i++){
            int r=i/n;
            int c=i%n;
            arr[r][c]='D';
        }
        System.out.println("Yes");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

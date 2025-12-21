public class NumberOfWays {
    static int count;
    public static void main(String[] args) {
        count=0;
        help(0,0,4,4);
        System.out.println(count);
    }
    static void help(int i, int j, int m, int n){
        if(i==m && j==n){
            count++;
            return;
        }
        else if(i==m){
            count++;
            return ;
        } else if (j==n) {
            count++;
            return;
        }
        help(i+1,j,m,n);
        help(i,j+1,m,n);
    }
}

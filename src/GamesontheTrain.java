import  java.util.*;
public class GamesontheTrain {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int a=in.nextInt();
           int b=in.nextInt();
           int x=in.nextInt();
           if(Math.abs(a-b)==1) System.out.println(1);
           else if (a==b) {
               System.out.println(0);
           }else{
               
           }
        }
    }
}

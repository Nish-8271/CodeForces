import java.util.*;

public class CoverinWater {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n= in.nextInt();
            String s=in.next();
            boolean three_continous=false;
            int empty_count=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='.' && i+1< n && s.charAt(i+1)=='.' && i+2 <n && s.charAt(i+2)=='.'){
                    three_continous=true;
                }
                if(s.charAt(i)=='.')empty_count++;
            }
            if(three_continous==true) System.out.println(2);
            else System.out.println(empty_count);
        }
    }
}

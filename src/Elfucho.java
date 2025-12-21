import java.util.*;

public class Elfucho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int win=0;
            int loose=0;
            int matches=0;
            if(n%2==0){
                matches+=n/2;
                win=n/2;
                loose=n/2;

            }else{
                matches+=n/2;
                win=n/2+1;
                loose=n/2;

            }
            while(win >1 || loose>1){
                int temp=0;
                if(win>1){
                    matches+=win/2;
                    temp=win/2;
                    if(win%2==0){

                        win=win/2;
                    }else{
                        win=win/2+1;
                    }
                }
                if(loose>1){
                    matches+=loose/2;
                    if(loose%2==0){
                        loose=loose/2;
                    }else{
                        loose=loose/2+1;
                    }
                }
                loose+=temp;

            }
            System.out.println(matches+1);
        }
    }

}

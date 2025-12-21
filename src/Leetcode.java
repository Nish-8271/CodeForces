import java.util.Scanner;

public class Leetcode {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int den=in.nextInt();
        double d=((double)num/(double)den);
        String s="d";
        System.out.println(d);
//        System.out.println();
        StringBuilder ans=new StringBuilder();
        int i=0;
//        while(i>s.length()){
            while(s.charAt(i)!='.'){
                ans.append(s.charAt(i));
                i++;
            }


    }

}

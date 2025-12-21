import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int t=in.nextInt();
        for(int i=0;i<t;i++){
              int n=in.nextInt();
              long[] arr=new long[n];
              List<Long> odd=new ArrayList<>();
              long sum=0;
              int oddCount=0;
              long oddMin=1;

              for(int j=0;j<n;j++){
                  long temp=in.nextInt();
                  sum+=temp;
                  arr[j]=temp;
                  if((temp % 2)!=0){
                      if(oddMin>temp){
                          oddMin=temp;
                      }
                      odd.add(temp);
                      oddCount++;
                  }
              }


              if(oddCount==0){
                  System.out.println(0);
              } else if(oddCount==1) {
                  System.out.println(sum);
              }else {
                  Collections.sort(odd);
                      int k=oddCount/2;
                      long tempsum=0;
                      for(int l=0;l<k;l++){
                          tempsum+=odd.get(l);
                      }
                      System.out.println(sum-tempsum);
                  }
             }
        }
    }

import java.util.*;

public class nextRound {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        List<Integer> temp=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int j=0;
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            if(!map.containsValue(x) ){
                map.put(j,x);
                j++;
            }
            temp.add(x);
        }
        if(map.size()==1){

            System.out.println(0);
            return;
        }
        int t=map.get(k-1);
        int count=0;
        int i=0;
        while(temp.get(i)!=t){
            count++;
            i++;
        }
        System.out.println(count);
    }
}

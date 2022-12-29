import java.util.*;
public class quesOne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<String>();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        System.out.println(list);
        list.sort((a,b)->(int)(a.length()-b.length()));
        for(String s:list){
            System.out.print(s+" ");
        }
        sc.close();
    }
}
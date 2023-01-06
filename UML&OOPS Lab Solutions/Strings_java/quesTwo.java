import java.util.*;
public class quesTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder ans=new StringBuilder();
        if(str.charAt(0)!=' ')
            ans.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==' ' && str.charAt(i)==' ')
                continue;
            ans.append(str.charAt(i));
        }
        System.out.println(ans);
        sc.close();
    }
}

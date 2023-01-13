import java.util.*;
public class quesSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = sc.nextLine();
            if(str.equals("q"))
                break;
            sb.append(str+"\r");
        }
        String ans = sb.toString();
        int len = ans.split("\r").length;
        System.out.println(len);
        sc.close();
    }
}

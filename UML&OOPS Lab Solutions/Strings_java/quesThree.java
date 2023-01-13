import java.util.*;
public class quesThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String substr=sc.nextLine();
        String repl = sc.nextLine();
        String ans=str.replace(substr, repl);
        System.out.println("replaced string: "+ans);
        sc.close();
    }
}

import java.util.*;
public class quesEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //sort string in alphabetical order
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
        sc.close();
    }
}

import java.util.Scanner;
public class quesNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb.reverse());
        sc.close();
    }
}

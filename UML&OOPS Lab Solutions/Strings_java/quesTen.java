import java.util.Scanner;
public class quesTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X=sc.nextLine();
        String Y=sc.nextLine();
        for(int i=0;i<X.length();i++){
            if(X.charAt(i)==Y.charAt(i)){
                if(X.charAt(i)=='W'){
                    System.out.print("B");
                }
                else{
                    System.out.print("W");
                }
            }
            else{
                System.out.print("B");
            }
        }
        sc.close();
    }
}

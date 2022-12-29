import java.util.*;
public class quesFour {
    public static int findRegion(int a,int b){
        if(a>0 && b>0)
            return 1;
        else if(a<0 && b>0)
            return 2;
        else if(a<0 && b<0)
            return 3;
        else if(a>0 && b<0)
            return 4;
        else
            return 0;
    }
    public static void main(String[] args) {
        List<String> chola = new ArrayList<String>();
        List<String> chera = new ArrayList<String>();
        List<String> pallava = new ArrayList<String>();
        List<String> pandya = new ArrayList<String>();
        List<String> renounce = new ArrayList<String>();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int region = findRegion(a,b);
            if(region==1)
                chola.add(str);
            else if(region==2)
                chera.add(str);
            else if(region==3)
                pallava.add(str);
            else if(region==4)
                pandya.add(str);
            else
                renounce.add(str);
            sc.nextLine();
        }
        System.out.println("Chola\n"+chola);
        System.out.println("Chera\n"+chera);
        System.out.println("Pallava\n"+pallava);
        System.out.println("Pandya\n"+pandya);
        System.out.println("Renounce\n"+renounce);
        sc.close();
    }
}

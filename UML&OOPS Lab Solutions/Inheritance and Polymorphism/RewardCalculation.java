import java.util.*;

class VISACard{
    private String holderName;
    private String ccv;

    VISACard(String holderName, String ccv){
        this.holderName = holderName;
        this.ccv = ccv;
    }

    public Double computeRewardPoints(String purchaseType, Double amount){
        Double points = 0.01*amount;
        return points;
    }
}

class HPVISACard extends VISACard{
    private String holderName;
    private String ccv;
    
    HPVISACard(String holderName, String ccv){
        super(holderName, ccv);
    }

    @Override
    public Double computeRewardPoints(String purchaseType, Double amount){
        Double points = super.computeRewardPoints(purchaseType, amount);
        if(purchaseType.equals("fuel"))
            points+=10.0;
        return points;
    }
}

public class RewardCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String holderName = sc.nextLine();
        String ccv = sc.nextLine();
        Double amount = sc.nextDouble();
        sc.nextLine();
        String purchaseType = sc.nextLine();
        int choice = sc.nextInt();
        
        if(choice == 1){
            VISACard visaCard = new VISACard(holderName, ccv);
            Double points=visaCard.computeRewardPoints(purchaseType, amount);
            System.out.println(points);
        }
        else if(choice == 2){
            HPVISACard hpvisaCard = new HPVISACard(holderName, ccv);
            Double points=hpvisaCard.computeRewardPoints(purchaseType, amount);
            System.out.println(points);
        }
        else{
            System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
/*
 * Sample Input 1:
 * John
 * 1011-2011-3011-4011
 * 1000
 * fuel
 * 1
 */
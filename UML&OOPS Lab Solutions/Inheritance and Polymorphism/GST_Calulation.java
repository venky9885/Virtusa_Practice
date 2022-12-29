import java.util.*;
import java.text.*;

class Event{
    String name;
    String detail;
    String type;
    String ownerName;
    double costPerDay;
}

class Exhibition extends Event{
    int noOfStall;
    //GST is 5% for exhibition
    double calculateGST(int noOfDays){
        return super.costPerDay*0.05*noOfDays;
    }
}

class StageEvent extends Event{
    int noOfSeats;
    //GST is 15% for stage event
    double calculateGST(int noOfDays){
        return super.costPerDay*0.15*noOfDays;
    }
}

public class GST_Calulation {
    public static void main(String[] args) {
        int option;
        String name;
        String detail;
        String type;
        String ownerName;
        double costPerDay;
        Date startDate=null;
        Date endDate=null;

        //Taking input
        Scanner sc=new Scanner(System.in);
        option=sc.nextInt();
        sc.nextLine(); //eats the newline character from prev nextInt()
        name=sc.nextLine();
        detail=sc.nextLine();
        type=sc.nextLine();
        ownerName=sc.nextLine();
        costPerDay=sc.nextDouble();
        int qty=sc.nextInt();
        sc.nextLine(); //eats the newline character from prev nextInt()
        //Taking start data and end date input as string
        String sDate=sc.nextLine();
        String eDate=sc.nextLine();

        try {
            //converting string to date
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            startDate = formatter.parse(sDate);
            endDate = formatter.parse(eDate);

            //calculating no of days
            long difference_In_Time = Math.abs(endDate.getTime() - startDate.getTime());
            long difference_In_Days
                    = (difference_In_Time
                    / (1000l * 60 * 60 * 24));
            int noOfDays=(int)difference_In_Days;

            //option 1 -> exhibition
            if(option==1){
                int noOfStall;
                noOfStall=qty;
                Exhibition e=new Exhibition();
                e.name=name;
                e.detail=detail;
                e.type=type;
                e.ownerName=ownerName;
                e.costPerDay=costPerDay;
                e.noOfStall=noOfStall;

                double cost=e.calculateGST(noOfDays);
                System.out.println(cost);
            }
            //option 2 -> stage event
            else if(option==2){
                int noOfSeats;
                noOfSeats=qty;
                StageEvent s=new StageEvent();
                s.name=name;
                s.detail=detail;
                s.type=type;
                s.ownerName=ownerName;
                s.costPerDay=costPerDay;
                s.noOfSeats=noOfSeats;

                double cost=s.calculateGST(noOfDays);
                System.out.println(cost);
            }
            else{
                System.out.println("Invalid option");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        sc.close();
    }
}
/*
 * Sample Input 1:
 * 1
 * Science Exhibition
 * Exciting Experiments
 * Fair
 * John
 * 10000.00
 * 10
 * 10/10/2017
 * 12/10/2017
 */
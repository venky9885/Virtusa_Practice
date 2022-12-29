import java.util.*;
import java.text.*;

abstract class Account{
    String name;
    int number;
    int balance;
    Date startDate;

    public abstract double calculateInterest(Date dueDate);
}

class CurrentAccount extends Account{
    
    @Override
    public double calculateInterest(Date dueDate) {
        long difference_In_Time = Math.abs(dueDate.getTime() - startDate.getTime());
        long difference_In_Years
                = (difference_In_Time
                   / (1000l * 60 * 60 * 24 * 365));
        double interest = balance * 0.05 * difference_In_Years;
        return interest;
    }
}

class SavingsAccount extends Account{
    
    @Override
    public double calculateInterest(Date dueDate) {
        long difference_In_Time = Math.abs(dueDate.getTime() - startDate.getTime());
        long difference_In_Years
                = (difference_In_Time
                   / (1000l * 60 * 60 * 24 * 365));
        double interest = balance * 0.12 * difference_In_Years;
        return interest;
    }
}

public class Banking {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int type;
        String name;
        int number;
        int balance;
        Date startDate=null;
        Date endDate=null;
        //Taking inputs from user
        type=sc.nextInt();
        name=sc.next();
        number=sc.nextInt();
        balance=sc.nextInt();
        sc.nextLine(); //consumes the newline character from prev nextInt()
        String sDate = sc.nextLine();
        String eDate = sc.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            startDate = formatter.parse(sDate);
            endDate = formatter.parse(eDate);
            //Type 1 for Savings Account -> interest rate is 12%
            if(type==1){
                SavingsAccount sa=new SavingsAccount();
                sa.name=name;
                sa.number=(int)number;
                sa.balance=balance;
                sa.startDate=startDate;
                System.out.println(sa.calculateInterest(endDate));
            }
            //Type 2 for Current Account -> interest rate is 5%
            else if(type==2){
                CurrentAccount ca=new CurrentAccount();
                ca.name=name;
                ca.number=(int)number;
                ca.balance=balance;
                ca.startDate=startDate;
                System.out.println(ca.calculateInterest(endDate));
            }
            else{
                System.out.println("Invalid Account Type");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
/*
 * sample input:
 * 1
 * Karthick
 * 101521502
 * 7000
 * 22/04/2013
 * 22/04/2016
 */
import java.util.*;

class Account{
    protected String accountNumber;
    protected Double balance;
    protected String accountHolderName;
}

class SavingAccount extends Account{
    protected Double minimumBalance;
}

class FixedAccount extends SavingAccount{
    protected int lockingPeriod;
}

class AccountBO{
    public void getAccountDetails(String detail[]){
        System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
        System.out.format("%-20s %-10s %-20s %-20s %s\n",detail[0],detail[1],detail[2],detail[3],detail[4]);
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String detail = sc.nextLine();
        String arr[]=detail.split(",");
        String accountNumber = arr[0];
        Double balance = Double.parseDouble(arr[1]);
        String accountHolderName = arr[2];
        Double minimumBalance = Double.parseDouble(arr[3]);
        int lockingPeriod = Integer.parseInt(arr[4]);

        FixedAccount fa = new FixedAccount();
        fa.accountNumber = accountNumber;
        fa.balance = balance;
        fa.accountHolderName = accountHolderName;
        fa.lockingPeriod = lockingPeriod;
        fa.minimumBalance = minimumBalance;

        String details[] = {fa.accountNumber,fa.balance.toString(),fa.accountHolderName,fa.minimumBalance.toString(),fa.lockingPeriod+""};
        AccountBO abo = new AccountBO();
        abo.getAccountDetails(details);

        sc.close();
    }
}
//Sample input: 
// ACC001,5456.45,Tony Blake,500,10
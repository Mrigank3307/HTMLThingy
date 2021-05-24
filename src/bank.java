//import java.util.Arrays;
import java.util.ArrayList;

public class bank {
    static int totalBanks;
    static int totalBalance;
    double initial;
    boolean registration;
    String comments;
    double amountDeposited;
    double amountWithdrawn;
    ArrayList<String> bankChange = new ArrayList<String>();
    ArrayList<String> bankChangeRecent = new ArrayList<String>();
    int  k = 0;
    boolean yes;

    public bank (double beginning , boolean register , String otherComments) {

        initial = beginning;
        registration = register;
        comments = otherComments;
        totalBanks += 1;
        //changeLogArray();

    }

    public String depositMoney (double moneyToBeDeposit) {
        if (registration) {
            initial = initial + moneyToBeDeposit;
            amountDeposited = amountDeposited + moneyToBeDeposit;
            String msg = "You deposited " + moneyToBeDeposit;
            changeLogArray(msg);
            changeRecentLogs(msg);
            return msg + " Your balance is now " + initial;

        }
        else {
            return "Your bank account has not been verified yet, Verify to deposit";
        }
    }

    public void showChangeLog() {
        for (String bankChangeR : bankChange) {
            System.out.print(bankChangeR + "; ");
        }
        System.out.println(" ");
        for (String bankRecentR : bankChangeRecent) {
            System.out.print(bankRecentR + "; ");
        }
        System.out.println(" ");
    }
    public String withdrawMoney (double moneyToWith) {
        if (registration) {
            initial = initial - moneyToWith;
            amountWithdrawn = amountWithdrawn + moneyToWith;
            String msg = "You withdrew " + moneyToWith;
            changeLogArray(msg);
            changeRecentLogs(msg);
            totalBalance -= moneyToWith;
            return msg + " Your balance is now " + initial;
        }
        else {
            return "Your account isn't verified yet";
        }
    }

    public void checkStatus () {
        System.out.println("Money that is currently in your account is " + initial);
        System.out.println("Total money that has been deposited in your account " + amountDeposited);
        System.out.println("Total money withdrawn from your account is " + amountWithdrawn);

    }

    public void changeLogArray (String message) {
        bankChange.add(message);
    }


    public void changeRecentLogs (String message) {
        if (k == 5) {
            k = 4;
            yes = true;
        }
        if (yes) {
            bankChangeRecent.remove(0);
        }
        bankChangeRecent.add(k,message);
        k++;
    }

    public static void main (String[] args){

        bank bank1 = new bank (0 , true , "I want a lot of money");
        //bank bank2 = new bank (300, false , "I have money");
        System.out.println(bank1.depositMoney(40000));
        System.out.println(bank1.depositMoney(2));
        System.out.println(bank1.withdrawMoney(1));
        System.out.println(bank1.depositMoney(3));
        System.out.println(bank1.depositMoney(4));
        System.out.println(bank1.depositMoney(2));
        System.out.println(bank1.withdrawMoney(1));
        System.out.println(bank1.depositMoney(3));
        System.out.println(bank1.depositMoney(4));
        System.out.println(bank1.depositMoney(1));
        System.out.println(bank1.depositMoney(2));
        System.out.println(bank1.withdrawMoney(1));
        System.out.println(bank1.depositMoney(3));
        System.out.println(bank1.depositMoney(4));
        System.out.println(bank1.depositMoney(2));
        System.out.println(bank1.withdrawMoney(1));
        System.out.println(bank1.depositMoney(3));
        System.out.println(bank1.depositMoney(4));
        bank1.checkStatus();
        bank1.showChangeLog();
        System.out.println(bank1.totalBanks);
    }

}

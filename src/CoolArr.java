import java.util.Arrays;
import java.util.ArrayList;

public class CoolArr {

    public CoolArr(){
        double first = 1;
    }

    public void statusCheck() {
        ArrayList<String> ages = new ArrayList<String>();
        System.out.println(ages);
        ages.add(0,"hi");
        ages.add(1,"Wassup");
        ages.add(2,"How");
        ages.set(1,"hello");
        ages.add("no");
        ages.remove(0);
        System.out.println(ages);
        System.out.println(ages.size());
        System.out.println(ages.get(2));
    }
    public static void main(String[] args) {
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

    }
}

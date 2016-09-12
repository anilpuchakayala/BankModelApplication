package bank.model.mainclass;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import bank.model.pojo.BankAccount;
import bank.model.pojo.CreditcardData;

public class MainClass {

	public static void main(String[] args) {
		
		CreditcardData cd = new CreditcardData("Jonas", new GregorianCalendar(2016,4,23), "Pizza", "Credit card transaction", 3300.0, "1101786534");
		CreditcardData cd1 = new CreditcardData("Jonas", new GregorianCalendar(2016,4,23), "Bar", "Credit card transaction", 300.0, "1101786534");
		CreditcardData cd2 = new CreditcardData("Jonas", new GregorianCalendar(2016,4,23), "Grocery store", "Credit card transaction", 200.0, "1101786534");
		CreditcardData cd3 = new CreditcardData("Jonas", new GregorianCalendar(2016,4,23), "Bar", "Credit card transaction", -100.0, "1101786534");
       
		BankAccount bc = new BankAccount("Jonas", new GregorianCalendar(2016,4,23), "videostreaming", "payment", -600.0, 10201, "12098-11");
		BankAccount bc1 = new BankAccount("Jonas", new GregorianCalendar(2016,5,20), "gym", "transceition", -300.0, 10201, "12798-11");
		BankAccount bc2 = new BankAccount("Jonas", new GregorianCalendar(2016,5,22), "videostreaming", "payment", 900.0, 10201, "12898-11");
		BankAccount bc3 = new BankAccount("Jonas", new GregorianCalendar(2015,5,25), "salary", "payment", 300.0, 10201, "11098-11");
		BankAccount bc4 = new BankAccount("Jonas", new GregorianCalendar(2016,5,28), "gym", "", -300.0, 10201, "11099-11");
		BankAccount bc5 = new BankAccount("Jonas", new GregorianCalendar(2016,6,04), "gym", "", -700.0, 10201, "11098-11");
		BankAccount bc6 = new BankAccount("Jonas", new GregorianCalendar(2016,6,18), "gym", "payment", 900.0, 10201, "12898-11");
		BankAccount bc7 = new BankAccount("Jonas", new GregorianCalendar(2016,6,23), "videostreaming", "payment", 300.0, 10201, "11098-11");
		BankAccount bc8 = new BankAccount("Jonas", new GregorianCalendar(2016,7,01), "gym", "", -300.0, 10201, "11099-11");
		
           ArrayList<CreditcardData>   al = new ArrayList<CreditcardData>();
           al.add(cd);
           al.add(cd1);
           al.add(cd2);
           al.add(cd3);
           ArrayList<BankAccount>   Bl = new ArrayList<BankAccount>(); 
           Bl.add(bc);
           Bl.add(bc1);
           Bl.add(bc2);
           Bl.add(bc3);
           Bl.add(bc4);
           Bl.add(bc5);
           Bl.add(bc6);
           Bl.add(bc7);
           Bl.add(bc8);
           
           System.out.println("Credit Card balance :"+new CreditcardData().getBalance(al));
           System.out.println("Bank Card balance : "+new BankAccount().getBalance(Bl));
           System.out.println("negitive accounts : "+new BankAccount().negitiveAccounts(Bl));
           System.out.println("checkingGymBiWeekly : "+new BankAccount().checkBiWeeklyEvent(Bl,"gym"));
           System.out.println("checkingVideoStreamingMonthly : "+new BankAccount().checkBiWeeklyEvent(Bl,"videostreaming"));


	}
    
	
}

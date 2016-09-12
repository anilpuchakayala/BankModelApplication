package bank.testclasses;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import bank.model.pojo.BankAccount;
import bank.model.pojo.CreditcardData;

public class BankAccountTest {

    protected  ArrayList<BankAccount>   Bl;
    protected  ArrayList<CreditcardData>   al ;
    @Before
	public  void setup(){

		CreditcardData cd = new CreditcardData("abc", new GregorianCalendar(2016,4,23), "gym", "payment", 3300.0, "1101786534");
		CreditcardData cd1 = new CreditcardData("abc", new GregorianCalendar(2016,4,23), "gym", "payment", 300.0, "1101786534");
		CreditcardData cd2 = new CreditcardData("abc", new GregorianCalendar(2016,4,23), "gym", "payment", 200.0, "1101786534");
		CreditcardData cd3 = new CreditcardData("abc", new GregorianCalendar(2016,4,23), "gym", "payment", -100.0, "1101786534");
       
		BankAccount bc = new BankAccount("Jonas", new GregorianCalendar(2016,4,23), "videostreaming", "payment", -600.0, 10201, "12098-11");
		BankAccount bc1 = new BankAccount("Jonas", new GregorianCalendar(2016,5,20), "gym", "transceition", -300.0, 10201, "12798-11");
		BankAccount bc2 = new BankAccount("Jonas", new GregorianCalendar(2016,5,22), "videostreaming", "payment", 900.0, 10201, "12898-11");
		BankAccount bc3 = new BankAccount("Jonas", new GregorianCalendar(2015,5,25), "salary", "payment", 300.0, 10201, "11098-11");
		BankAccount bc4 = new BankAccount("Jonas", new GregorianCalendar(2016,5,28), "gym", "", -300.0, 10201, "11099-11");
		BankAccount bc5 = new BankAccount("Jonas", new GregorianCalendar(2016,6,04), "gym", "", -700.0, 10201, "11098-11");
		BankAccount bc6 = new BankAccount("Jonas", new GregorianCalendar(2016,6,18), "gym", "payment", 900.0, 10201, "12898-11");
		BankAccount bc7 = new BankAccount("Jonas", new GregorianCalendar(2016,6,23), "videostreaming", "payment", 300.0, 10201, "11098-11");
		BankAccount bc8 = new BankAccount("Jonas", new GregorianCalendar(2016,7,01), "gym", "", -300.0, 10201, "11099-11");
		
           al = new ArrayList<CreditcardData>();
           al.add(cd);
           al.add(cd1);
           al.add(cd2);
           al.add(cd3);
           Bl  = new ArrayList<BankAccount>(); 
           Bl.add(bc);
           Bl.add(bc1);
           Bl.add(bc2);
           Bl.add(bc3);
           Bl.add(bc4);
           Bl.add(bc5);
           Bl.add(bc6);
           Bl.add(bc7);
           Bl.add(bc8);
	}
	
	@Test
	public void checkAccountBalanceTest(){
		BankAccount account = new BankAccount();
		double accountBalance = account.getBalance(Bl);
		assertTrue(accountBalance == 10200.0);
	}
	
	@Test
	
	public void checkCreditBalanceTest(){
		CreditcardData creditData = new CreditcardData();
		double creditBalance = creditData.getBalance(al);
		assertTrue(creditBalance == 1100.0);
	}
	
	@Test
	public void checkNegativeAccount(){
		BankAccount account = new BankAccount();
		List<BankAccount> bankObj = account.negitiveAccounts(Bl);
		assertTrue(bankObj.size() == 2);
	}
	
	@Test
	public void checkBiWeeklyGymOccurance(){
		BankAccount account = new BankAccount();
		boolean biWeekly = account.checkBiWeeklyEvent(Bl,"gym");
		assertFalse(biWeekly);
	}
	
	@Test
	public void checkBiMonthlyVideoStreamingOccurance(){
		BankAccount account = new BankAccount();
		boolean biWeekly = account.checkBiWeeklyEvent(Bl,"videostreaming");
		assertTrue(biWeekly);
	}
}

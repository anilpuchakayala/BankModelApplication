package bank.model.pojo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;



public class BankAccount extends Account{
	   private int accountNumber;
	   private String recipientNumber;
	   
	public BankAccount(){
		
	}
	
	public BankAccount(String ownerName, Calendar date, String text,
			String bankEventType, double amount, int accountNumber, String recipientNumber) {
		this.ownerName = ownerName;
		this.date = date;
		this.text = text;
		this.bankEventType = bankEventType;
		this.amount = amount;
		this.accountNumber = accountNumber;
		this.recipientNumber = recipientNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getRecipientNumber() {
		return recipientNumber;
	}
	public void setRecipientNumber(String recipientNumber) {
		this.recipientNumber = recipientNumber;
	}
	
	public double getBalance(ArrayList<BankAccount> obj)
	{
		for(BankAccount cb: obj) {
			if(cb.getAmount() < 0 )
			{
				bankBalance = bankBalance - Math.abs(cb.getAmount()); 
			}
			else {
				bankBalance = bankBalance + cb.getAmount();	
			}
	     }
		return bankBalance;
		
	}
	
	public List<BankAccount> negitiveAccounts(ArrayList<BankAccount> obj) {
	
	List<BankAccount> positiveBankList = new ArrayList<BankAccount>();
	  Iterator<BankAccount> iterator = obj.iterator();
	  while(iterator.hasNext()){
		  BankAccount account = iterator.next();
		  double amountValue = account.getAmount();
		  if(amountValue <0){
			  String eventType = account.getBankEventType();
			  if(!"".equals(eventType)){
			     positiveBankList.add(account);
			  }
		  }
	  }
		
		return positiveBankList;	
	}
	
	public boolean checkBiWeeklyEvent(ArrayList<BankAccount> obj,String text){
		boolean checkBiWeekly = true;
		Calendar firstInstance = null;
		Iterator<BankAccount> iterator = obj.iterator();
		while(iterator.hasNext()){
			BankAccount account = iterator.next();
			Calendar accountCal = account.getDate();
			String textType = account.getText();
			if(text.equals(textType)){
			if(firstInstance != null){
				long dateDiff = getDateDiff(firstInstance,accountCal);
				if(dateDiff >=14){
					checkBiWeekly = true;
				}else{
					checkBiWeekly = false;
					break;
				}
				firstInstance = accountCal;
			}else{
				firstInstance = accountCal;
			}
		 }else if(text.equals(textType)){
				if(firstInstance != null){
					long dateDiff = getDateDiff(firstInstance,accountCal);
					if(dateDiff >31){
						checkBiWeekly = true;
					}else{
						checkBiWeekly = false;
						break;
					}
					firstInstance = accountCal;
				}else{
					firstInstance = accountCal;
				} 
		 }
		}
		return checkBiWeekly;
	}
	
	public long getDateDiff(Calendar cl1,Calendar cl2){
		long miliSecondForDate1 = cl1.getTimeInMillis();
		long miliSecondForDate2 = cl2.getTimeInMillis();
		
		long diffInMilis = miliSecondForDate2 - miliSecondForDate1;

		long diffInDays = diffInMilis / (24 * 60 * 60 * 1000);

		return Math.abs(diffInDays);
	}
   
}

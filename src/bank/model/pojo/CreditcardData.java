package bank.model.pojo;

import java.util.ArrayList;
import java.util.Calendar;


public class CreditcardData extends Account{
	   private String cardNumber;
	   
	   public CreditcardData(){
	   
	   }

	public CreditcardData(String ownerName, Calendar date, String text,
			String bankEventType, double amount, String cardNumber) {
		this.ownerName = ownerName;
		this.date = date;
		this.text = text;
		this.bankEventType = bankEventType;
		this.amount = amount;
		this.cardNumber = cardNumber;
		
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public double getBalance(ArrayList<CreditcardData> obj)
	{
		for(CreditcardData cb: obj) {
			if(cb.getAmount() < 0 )
			{
			crBalance = crBalance + cb.getAmount(); 
			}
			else {
				crBalance = crBalance - cb.getAmount(); 
			}
	     }
		return crBalance;
		
	}
	   
}

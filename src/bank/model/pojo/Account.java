package bank.model.pojo;

import java.util.Calendar;


public class Account {
	  
	protected String ownerName;
	protected Calendar date;
	protected String text;
	protected String bankEventType;
	protected double amount;
	public static double crBalance = 5000;
	public static double bankBalance = 10000;
	   

	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getBankEventType() {
		return bankEventType;
	}
	public void setBankEventType(String bankEventType) {
		this.bankEventType = bankEventType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}

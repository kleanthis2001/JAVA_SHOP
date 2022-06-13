package entities;

import java.util.Date;

public class PayPalPayment extends Payment {
	private String accountName;
	
	public PayPalPayment(double aprice,String acurrency,Date aDate,String accountName) {
		super(aprice,acurrency,aDate);
		this.accountName = accountName;
	}
	
}

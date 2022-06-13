package entities;

import java.util.Date;

public abstract class Payment {
	private double paymentprice;
	private String currency;
	private Date DateofPayment;
	
	
	public Payment(double aprice,String acurrency,Date aDate) {
		// TODO Auto-generated constructor stub
		this.paymentprice = aprice;
		this.currency = acurrency;
		this.DateofPayment =  aDate;
	}
}

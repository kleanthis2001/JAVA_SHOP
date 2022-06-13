package entities;

import java.util.Date;

public class CashOnDeliveryPayment extends Payment {
	private double taxofPayment;
	
	public CashOnDeliveryPayment(double aprice,String acurrency,Date aDate,double ataxofPayment) {
		super(aprice,acurrency,aDate);
		this.taxofPayment = ataxofPayment;
	}
}

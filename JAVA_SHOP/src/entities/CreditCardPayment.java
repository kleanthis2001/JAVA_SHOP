package entities;

import java.util.Date;

public class CreditCardPayment  extends Payment{
	private String CardNumber;
	private String OwnerName;
	private String pcv;
	
	
	public CreditCardPayment(double aprice,String acurrency,Date aDate,String aCardNumber,
							String aOwner,String apcv) {
		super(aprice,acurrency,aDate);
		this.CardNumber = aCardNumber;
		this.OwnerName = aOwner;
		this.pcv = apcv;
		
	}
}

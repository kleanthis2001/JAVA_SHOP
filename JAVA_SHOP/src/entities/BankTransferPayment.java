package entities;

import java.util.Date;

public class BankTransferPayment  extends Payment{
	private String BankName;
	private String BankAccountNumber;
	private String OwnerName;
	private String IBAN;
	
	public BankTransferPayment(double aprice,String acurrency,Date aDate,String aBankName,
								String BankAccountNumber,String aOwnerAccount,String aIBAN) {
		super(aprice,acurrency,aDate);
		this.BankAccountNumber = aBankName;
		this.BankName = aBankName;
		this.OwnerName = aOwnerAccount;
		this.IBAN = aIBAN;
	}
}

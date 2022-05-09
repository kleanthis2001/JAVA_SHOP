
public class BankTransferPayment extends Payment{
	private String BankName;
	private long Account_Number;
	private String Holder_Name;
	private String IBAN;
	
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public long getAccount_Number() {
		return Account_Number;
	}
	public void setAccount_Number(long account_Number) {
		Account_Number = account_Number;
	}
	public String getHolder_Name() {
		return Holder_Name;
	}
	public void setHolder_Name(String holder_Name) {
		Holder_Name = holder_Name;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

}

package Payment;
import java.util.Date;
import java.time.LocalDateTime;  

public abstract class Payment {
	private double paid_amount;
	private String currency;
	private LocalDateTime DateOfPayment;
	
	public Payment() {
		this.paid_amount = 0;
		this.currency = "";
		LocalDateTime now = LocalDateTime.now();
		DateOfPayment = now;
	}
	
	public Payment(double aPaid_amount,String aCurrency,LocalDateTime aDateOfPayment) {
		this.currency = aCurrency;
		this.DateOfPayment = aDateOfPayment;
		this.paid_amount = aPaid_amount;
	}
	public double getPaid_amount() {
		return paid_amount;
	}
	public void setPaid_amount(double paid_amount) {
		this.paid_amount = paid_amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public LocalDateTime getDateOfPayment() {
		return DateOfPayment;
	}
	public void setDateOfPayment(LocalDateTime dateOfPayment) {
		DateOfPayment = dateOfPayment;
	}
	
	
}

import java.util.Date;
public class Customer extends User{
	private String Shipping_Address;
	private String Billing_Address;
	private Date Birthday_Date;
	private Boolean Newsletter_Registried;
	
	public String getShipping_Address() {
		return Shipping_Address;
	}



	public void setShipping_Address(String shipping_Address) {
		Shipping_Address = shipping_Address;
	}



	public String getBilling_Address() {
		return Billing_Address;
	}



	public void setBilling_Address(String billing_Address) {
		Billing_Address = billing_Address;
	}



	public Date getBirthday_Date() {
		return Birthday_Date;
	}



	public void setBirthday_Date(Date birthday_Date) {
		Birthday_Date = birthday_Date;
	}



	public Boolean getNewsletter_Registried() {
		return Newsletter_Registried;
	}



	public void setNewsletter_Registried(Boolean newsletter_Registried) {
		Newsletter_Registried = newsletter_Registried;
	}
	
	@Override
	public String getUserInfo() {
		String AccountInfos;
		AccountInfos = "Stroixia User:"+ this.getName()+this.getSurname()+","+ this.getPhoneNumber()+","+
						this.getEmail();
		return AccountInfos;
		// TODO Auto-generated method stub
		
	}
	
}

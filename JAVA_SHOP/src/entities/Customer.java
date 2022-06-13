package entities;
import java.util.Date;

public class Customer extends User{

	
    private String shippingAddress;
    private String paymentAddress;
    private Date birthdate;
    private boolean newsletterRegistered;
    
    public Customer(String name, String username, String telephone, String email, String password, Date dateRegistered,String shippingAddress, String paymentAddress, Date birthdate, boolean newsletterRegistered) {
        super(name, username, telephone, email, password, dateRegistered);
        this.shippingAddress = shippingAddress;
        this.paymentAddress = paymentAddress;
        this.birthdate = birthdate;
        this.newsletterRegistered = newsletterRegistered;
    }
    
	
    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPaymentAddress() {
        return paymentAddress;
    }

    public void setPaymentAddress(String paymentAddress) {
        this.paymentAddress = paymentAddress;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isNewsletterRegistered() {
        return newsletterRegistered;
    }

    public void setNewsletterRegistered(boolean newsletterRegistered) {
        this.newsletterRegistered = newsletterRegistered;
    }
	
	@Override
	public String getUserInfo() {
		String AccountInfos;
		AccountInfos = "Stroixia User:"+ this.getName()+","+ this.getTelephone()+","+
						this.getEmail();
		return AccountInfos;
		// TODO Auto-generated method stub
		
	}
	
}

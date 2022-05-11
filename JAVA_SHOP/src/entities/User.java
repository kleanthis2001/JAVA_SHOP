package entities;
import java.util.Date;

public abstract class User {
	private String name;
    private String username;
    private String telephone;
    private String email;
    private String password;
    private Date dateRegistered;
		
	public User(String aName,String aemail,String aUsername,String aPassword,String aPhone,Date aDateRegistered) {
		this.name= aName;
		this.telephone = aPhone;
		this.email = aemail;
		this.username = aUsername;
		this.password = aPassword;
		this.dateRegistered = aDateRegistered;
		
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
    
	abstract String getUserInfo();
	
}

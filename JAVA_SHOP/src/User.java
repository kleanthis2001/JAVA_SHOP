import java.util.Date;

public abstract class User {
	private String Name;
	private String Surname;
	private long PhoneNumber;
	private String email;
	private String Username;
	private String Password;
	
	public User() {
		this.Name= "";
		this.Surname = "";
		this.PhoneNumber = 0;
		this.email = "";
		this.Username = "";
		this.Password = "";
	}
	
	public User(String aName,String aSurname,String aemail,String aUsername,String aPassword,long aPhone) {
		this.Name= aName;
		this.Surname = aSurname;
		this.PhoneNumber = aPhone;
		this.email = aemail;
		this.Username = aUsername;
		this.Password = aPassword;
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Date getRegisterDate() {
		return RegisterDate;
	}
	public void setRegisterDate(Date registerDate) {
		RegisterDate = registerDate;
	}
	private Date RegisterDate;
	
	abstract String getUserInfo();
	
}

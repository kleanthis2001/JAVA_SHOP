package entities;

import java.util.Date;

public class Supplier extends User{
	private String companyName;
	private String afm;
	
	public Supplier(String companyName, String afm, String name, String username, String telephone, String email, String password, Date dateRegistered) {
        super(name, username, telephone, email, password, dateRegistered);
        this.companyName = companyName;
        this.afm = afm;
    }
	
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }


	@Override
	public String getUserInfo() {
		// TODO Auto-generated method stub
		String AccountInfos;
		AccountInfos = "Stroixia User:"+ this.getName()+","+ this.getTelephone()+","+
						this.getEmail()+","+this.getAfm();
		return AccountInfos;
		
	}
	
}


public class Administrator  extends User{
	
	public Administrator() {
		super();
	}
	
	public Administrator(String aName,String aSurname,String aemail,String aUsername,String aPassword,long aPhone) {
		super(aName, aSurname, aemail, aUsername, aPassword, aPhone);
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

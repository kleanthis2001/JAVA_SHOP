
public class Supplier extends User{
	private String Brand_Name;
	private long AFM;
	

	public String getBrand_Name() {
		return Brand_Name;
	}


	public void setBrand_Name(String brand_Name) {
		Brand_Name = brand_Name;
	}


	public long getAFM() {
		return AFM;
	}


	public void setAFM(long aFM) {
		AFM = aFM;
	}


	@Override
	public String getUserInfo() {
		// TODO Auto-generated method stub
		String AccountInfos;
		AccountInfos = "Stroixia User:"+ this.getName()+this.getSurname()+","+ this.getPhoneNumber()+","+
						this.getEmail()+","+this.getAFM();
		return AccountInfos;
		
	}
	
}

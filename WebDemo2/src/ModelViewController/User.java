package ModelViewController;

public class User {
	String loginid;
	String Password;
	String CustomerName;
	String Emailid;
	String Mobile;
	String Address;
	String Country;
	
	public boolean checklogin()
	{
		if(loginid.equals("Sujit") && Password.equals("12345"))
			return true;
		else
			return false;
	}
	public String getLoginId() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getEmailId() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}

}

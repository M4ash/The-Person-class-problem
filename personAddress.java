/**
	*@author Billah Syed Mashkur
	*/
//class declaration
public class personAddress {
	//set data fields
	private String firstname;
	private String lastname;
	private String email;
	private String tel;
	//create constructor
	public personAddress() {
		
	}
	//create methods
	public String getEmail() {
		return email;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setEmail(String em) {
		this.email = em;
	}
	
	public void setFirstname(String fname) {
		this.firstname = fname;
	}
	
	public void setLastname(String lname) {
		this.lastname = lname;
	}
	
	public void setTel(String telephone) {
		this.tel = telephone;
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		personAddress address = (personAddress) o;
		if((firstname.equals(address.firstname)) && (lastname.equals(address.lastname)) ) {
			return true;
		}
		return false;
	}
}

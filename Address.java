package exercise14aug19;

public class Address {
private String doorNo;
private String streetName;
private int pinCode;
private String taluk;
private String district;
private String city;
private String state;
private String country;
public String getDoorNo() {
	return doorNo;
}
public void setDoorNo(String doorNo) {
	this.doorNo = doorNo;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public int getPinCode() {
	return pinCode;
}
public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
}
public String getTaluk() {
	return taluk;
}
public void setTaluk(String taluk) {
	this.taluk = taluk;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Address(String doorNo, String streetName, int pinCode, String taluk, String district, String city, String state,
		String country) {
	super();
	this.doorNo = doorNo;
	this.streetName = streetName;
	this.pinCode = pinCode;
	this.taluk = taluk;
	this.district = district;
	this.city = city;
	this.state = state;
	this.country = country;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}

}

package exercise14aug19;

public class Personal {
private String name;
private Address address;
private String nationality;
private String community;
private String fatherOccupation; 
private String fatherName;
private String motherName;
private String guardianName;
private long fatherMobNo;
private int fatherIncome;
private long guardianMobNo;
private String motherOccupation;
private long motherMobNo;
private int motherIncome;
private String specialCategory;
private long panNo;
private String identityMarks;
private long mobNo;
public String getName() {
	return name;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
public String getMotherName() {
	return motherName;
}
public void setMotherName(String motherName) {
	this.motherName = motherName;
}
public String getGuardianName() {
	return guardianName;
}
public void setGuardianName(String guardianName) {
	this.guardianName = guardianName;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public String getCommunity() {
	return community;
}
public void setCommunity(String community) {
	this.community = community;
}
public String getFatherOccupation() {
	return fatherOccupation;
}
public void setFatherOccupation(String fatherOccupation) {
	this.fatherOccupation = fatherOccupation;
}
public long getFatherMobNo() {
	return fatherMobNo;
}
public void setFatherMobNo(long fatherMobNo) {
	this.fatherMobNo = fatherMobNo;
}
public int getFatherIncome() {
	return fatherIncome;
}
public void setFatherIncome(int fatherIncome) {
	this.fatherIncome = fatherIncome;
}
public long getGuardianMobNo() {
	return guardianMobNo;
}
public void setGuardianMobNo(long guardianMobNo) {
	this.guardianMobNo = guardianMobNo;
}
public String getMotherOccupation() {
	return motherOccupation;
}
public void setMotherOccupation(String motherOccupation) {
	this.motherOccupation = motherOccupation;
}
public long getMotherMobNo() {
	return motherMobNo;
}
public void setMotherMobNo(long motherMobNo) {
	this.motherMobNo = motherMobNo;
}
public int getMotherIncome() {
	return motherIncome;
}
public void setMotherIncome(int motherIncome) {
	this.motherIncome = motherIncome;
}
public String getSpecialCategory() {
	return specialCategory;
}
public void setSpecialCategory(String specialCategory) {
	this.specialCategory = specialCategory;
}
public long getPanNo() {
	return panNo;
}
public void setPanNo(long panNo) {
	this.panNo = panNo;
}
public String getIdentityMarks() {
	return identityMarks;
}
public void setIdentityMarks(String identityMarks) {
	this.identityMarks = identityMarks;
}
public long getMobNo() {
	return mobNo;
}
public void setMobNo(long mobNo) {
	this.mobNo = mobNo;
}
public Personal(String name, Address address,String nationality, String community,
		String fatherName,String fatherOccupation,  int fatherIncome,long fatherMobNo, String guardianName,
		long guardianMobNo, String motherName,String motherOccupation,
		 int motherIncome, long motherMobNo,String specialCategory, long panNo, String identityMarks, long mobNo) {
	super();
	this.name = name;
	this.address = address;
	this.nationality = nationality;
	this.community = community;
	this.fatherName=fatherName;
	this.fatherOccupation = fatherOccupation;
	this.fatherMobNo = fatherMobNo;
	this.fatherIncome = fatherIncome;
	this.guardianName=guardianName;
	this.guardianMobNo = guardianMobNo;
	this.motherName=motherName;
	this.motherOccupation = motherOccupation;
	this.motherMobNo = motherMobNo;
	this.motherIncome = motherIncome;
	this.specialCategory = specialCategory;
	this.panNo = panNo;
	this.identityMarks = identityMarks;
	this.mobNo = mobNo;
}
public Personal() {
	super();
	// TODO Auto-generated constructor stub
}

}

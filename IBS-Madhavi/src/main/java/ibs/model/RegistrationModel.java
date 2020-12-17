package ibs.model;

import java.time.LocalDate;


public class RegistrationModel {
	

	private Long registerationId;
	private String fullName;
	private LocalDate dateofBirth;
	private String gender;
	private String email_id;
	private String custAcctTyp;
	/* private Boolean KYC_PROOF_TYP; */
	private String regStatus;
	private Integer mobileNumber;
	private String address;
	private String city;
	private String country;
	private String pinCode;
	private Integer roleId;
	private String accountType;
	private String kycDoc;
	
	
	public RegistrationModel() {
		super();
	}


	public RegistrationModel(Long registerationId, String fullName, LocalDate dateofBirth, String gender, String email_id,
			String custAcctTyp, Boolean kYC_PROOF_TYP, String regStatus, Integer mobileNumber, String address,
			String city, String country, String pinCode, Integer roleId, String adminCmnts, String kycDoc) {
		super();
		this.registerationId = registerationId;
		this.fullName = fullName;
		this.dateofBirth = dateofBirth;
		this.gender = gender;
		this.email_id = email_id;
		this.custAcctTyp = custAcctTyp;
		/* KYC_PROOF_TYP = kYC_PROOF_TYP; */
		this.regStatus = regStatus;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
		this.roleId = roleId;
		this.accountType = accountType;
		this.kycDoc = kycDoc;
	}


	public Long getRegisterationId() {
		return registerationId;
	}


	public void setRegisterationId(Long registerationId) {
		this.registerationId = registerationId;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public LocalDate getDateofBirth() {
		return dateofBirth;
	}


	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public String getCustAcctTyp() {
		return custAcctTyp;
	}


	public void setCustAcctTyp(String custAcctTyp) {
		this.custAcctTyp = custAcctTyp;
	}


	/*
	 * public Boolean getKYC_PROOF_TYP() { return KYC_PROOF_TYP; }
	 * 
	 * 
	 * public void setKYC_PROOF_TYP(Boolean kYC_PROOF_TYP) { KYC_PROOF_TYP =
	 * kYC_PROOF_TYP; }
	 */

	public String getRegStatus() {
		return regStatus;
	}


	public void setRegStatus(String regStatus) {
		this.regStatus = regStatus;
	}


	public Integer getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	public Integer getRoleId() {
		return roleId;
	}


	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public String getKycDoc() {
		return kycDoc;
	}


	public void setKycDoc(String kycDoc) {
		this.kycDoc = kycDoc;
	}

}

package ibs.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="KYC_DTL")
public class RegistrationEntity {
	
	@Id
	@Column(name="REG_ID")
	@GeneratedValue
	private Integer registerationId;
	
	@Column(name="FULL_NM")
	private String fullName;
	
	@Column(name="DOB")
	private LocalDate dateofBirth;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="EMAIL_ID")
	private String email_id;
	
	@Column(name = "CUST_ACCT_TYP")
	private String custAcctTyp;
	
	/*
	 * @Column(name = "KYC_PROOF_TYP") private Boolean KYC_PROOF_TYP;
	 */
	
	@Column(name = "REG_STATUS")
	private String regStatus;
	
	@Column(name="MBL_NUM")
	private Integer mobileNumber;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="ST")
	private String city;
	
	@Column(name="CNTRY")
	private String country;
	
	@Column(name="ZIP")
	private String pinCode;
	
	@Column(name="ROLE_ID")
	private Integer roleId;
	
	@Column(name="ACCOUNT_TYPE")
	private String accountType;

	
	@Column(name="KYC_PROOF_DOC")
	private String kycDoc;

	
	
	
	public RegistrationEntity() {
		super();
	}


	public RegistrationEntity(Integer registerationId, String fullName, LocalDate dateofBirth, String gender, String email_id,
			String custAcctTyp, String regStatus, Integer mobileNumber, String address,
			String city, String country, String pinCode, Integer roleId, String accountType, String kycDoc) {
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


	public Integer getRegisterationId() {
		return registerationId;
	}


	public void setRegisterationId(Integer registerationId) {
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

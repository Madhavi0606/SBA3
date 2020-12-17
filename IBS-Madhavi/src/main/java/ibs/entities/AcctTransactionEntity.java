package ibs.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ACCT_TXN_INFO")
public class AcctTransactionEntity {

	@Id
	@Column(name="TXN_ID")
	@GeneratedValue
	private Integer transId;
	
	
	@Column(name="ACCT_NUM")	
	private Integer accountNumber;
	
	@Column(name="CUST_ACCT_TYP")
	private String accountType;
	
	@Column(name="TXN_TYP")
	private String transType;
	
	@Column(name="TXN_DTM")
	private LocalDate transDatetm;
	
	@Column(name="TXN_PWD")
	private String transPassword;
	
	@Column(name="TXN_AMT")
	private String transAmount;
	
	@Column(name="PAYMNT_FRM")
	private Integer transFrom;
	
	@Column(name="PAYMNT_TO")
	private Integer transTo;
	
	@Column(name="TXN_COMMENTS")
	private String transComments;
	
	public AcctTransactionEntity() {
		super();
	}

	public AcctTransactionEntity(Integer transId, Integer accountNumber, String accountType, String transType, LocalDate transDatetm,
			String transPassword, String transAmount, Integer transFrom, Integer transTo, String transComments) {
		super();
		this.transId = transId;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.transType = transType;
		this.transDatetm = transDatetm;
		this.transPassword = transPassword;
		this.transAmount = transAmount;
		this.transFrom = transFrom;
		this.transTo = transTo;
		this.transComments = transComments;
	}

	public Integer getTransId() {
		return transId;
	}

	public void setTransId(Integer transId) {
		this.transId = transId;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public LocalDate getTransDatetm() {
		return transDatetm;
	}

	public void setTransDatetm(LocalDate transDatetm) {
		this.transDatetm = transDatetm;
	}

	public String getTransPassword() {
		return transPassword;
	}

	public void setTransPassword(String transPassword) {
		this.transPassword = transPassword;
	}

	public String getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public Integer getTransFrom() {
		return transFrom;
	}

	public void setTransFrom(Integer transFrom) {
		this.transFrom = transFrom;
	}

	public Integer getTransTo() {
		return transTo;
	}

	public void setTransTo(Integer transTo) {
		this.transTo = transTo;
	}

	public String getTransComments() {
		return transComments;
	}

	public void setTransComments(String transComments) {
		this.transComments = transComments;
	}
}

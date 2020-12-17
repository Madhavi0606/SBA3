package ibs.model;

import java.time.LocalDate;



public class AcctTransactionModel {

	private Integer transId;
	private Integer accountNumber;
	private String accountType;
	private String transType;
	private LocalDate transDatetm;
	private double txnAmt;
	private Integer transFrom;
	private Integer transTo;
	private String transComments;
	
	public AcctTransactionModel() {
		super();
	}

	public AcctTransactionModel(Integer transId, Integer accountNumber, String accountType, String transType, LocalDate transDatetm,
			double txnAmt, Integer transFrom, Integer transTo, String transComments) {
		super();
		this.transId = transId;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.transType = transType;
		this.transDatetm = transDatetm;
		this.txnAmt = txnAmt;
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


	public double getTxnAmt() {
		return txnAmt;
	}

	public void setTxnAmt(double txnAmt) {
		this.txnAmt = txnAmt;
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

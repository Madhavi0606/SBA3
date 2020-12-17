package ibs.model;

import java.time.LocalDate;

import javax.persistence.Column;


public class CustAcctModel{
	
	
	private Integer uci;
	private long regId;
	public String getUserName() {
		return userName;
	}

	public long getRegId() {
		return regId;
	}

	public void setRegId(long regId) {
		this.regId = regId;
	}

	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="AVLBL_BAL")
	private double availableBalance;
	
	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	private String userName;
	private Integer custAcctNum;
	private String custName; 
	private String custAcctType;
	private double avlBal;
	private LocalDate acctStartDate;
	private LocalDate acctCloseDate;
	private BranchesModel branchId;
	private double interestRate;
	private String tenure;
	private String custAcctStatus;

	public CustAcctModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustAcctModel(Integer uci, long regId, Integer custAcctNum, String custName,
			String custAcctType, double avlBal, LocalDate acctStartDate, LocalDate acctCloseDate, BranchesModel branchId,
			double interestRate, String tenure, String custAcctStatus) {
		super();
		this.uci = uci;
		this.regId = regId;
		this.custAcctNum = custAcctNum;
		this.custName = custName;
		this.custAcctType = custAcctType;
		this.avlBal = avlBal;
		this.acctStartDate = acctStartDate;
		this.acctCloseDate = acctCloseDate;
		this.branchId = branchId;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.custAcctStatus = custAcctStatus;
	}

	public Integer getUci() {
		return uci;
	}

	public void setUci(Integer uci) {
		this.uci = uci;
	}

	public Integer getCustAcctNum() {
		return custAcctNum;
	}

	public void setCustAcctNum(Integer custAcctNum) {
		this.custAcctNum = custAcctNum;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAcctType() {
		return custAcctType;
	}

	public void setCustAcctType(String custAcctType) {
		this.custAcctType = custAcctType;
	}

	public double getAvlBal() {
		return avlBal;
	}

	public void setAvlBal(double avlBal) {
		this.avlBal = avlBal;
	}

	public LocalDate getAcctStartDate() {
		return acctStartDate;
	}

	public void setAcctStartDate(LocalDate acctStartDate) {
		this.acctStartDate = acctStartDate;
	}

	public LocalDate getAcctCloseDate() {
		return acctCloseDate;
	}

	public void setAcctCloseDate(LocalDate acctCloseDate) {
		this.acctCloseDate = acctCloseDate;
	}

	public BranchesModel getBranchId() {
		return branchId;
	}

	public void setBranchId(BranchesModel branchId) {
		this.branchId = branchId;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public String getCustAcctStatus() {
		return custAcctStatus;
	}

	public void setCustAcctStatus(String custAcctStatus) {
		this.custAcctStatus = custAcctStatus;
	}

	

	}

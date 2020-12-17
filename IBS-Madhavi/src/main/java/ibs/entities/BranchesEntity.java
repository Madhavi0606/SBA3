package ibs.entities;

public class BranchesEntity {

	private Integer branchId;
	private String branchName;
	private String ifsc;
	
	public BranchesEntity() {
		super();
	}

	public BranchesEntity(Integer branchId, String branchName, String ifsc) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.ifsc = ifsc;
	}

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	
	
}

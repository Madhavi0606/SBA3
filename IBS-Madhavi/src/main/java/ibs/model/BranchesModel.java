package ibs.model;

public class BranchesModel {

	private Integer branchId;
	private String branchName;
	private String ifsc;
	
	public BranchesModel() {
		super();
	}

	public BranchesModel(Integer branchId, String branchName, String ifsc) {
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

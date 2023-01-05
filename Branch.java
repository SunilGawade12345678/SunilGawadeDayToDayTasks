package oopsDemo;

public class Branch extends College {

public String	 branchName;
 public int   branchId;
  public int branchTotalStaff;
  
public Branch(String collegename, int collegeid, String collegeplace, String branchName, int branchId,
		int branchTotalStaff) {
	super(collegename, collegeid, collegeplace);
	this.branchName = branchName;
	this.branchId = branchId;
	this.branchTotalStaff = branchTotalStaff;
}
  
  
}

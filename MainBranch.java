package oopsDemo;

public class MainBranch {
//parent class
	     int bankid;
	     String name;
	      long phoneno;
private	  float mainBranchInterest=5.6F;
 private  long banktotalfund=10000000;
	
	//for loan approval status
        public String checkLoan(long loan) {
        	 String status="";
        	if(loan<banktotalfund) {
           status="Loan Successfully Approved";
        	}else {
        		status="Loan is decline";
        	}
        	return status;
        }
        
        //to find total interest
        
        public float totalInterest(float subBranchInterest) {
        	float totalInterest= subBranchInterest+ mainBranchInterest;
        	
        	return totalInterest;
        }
}

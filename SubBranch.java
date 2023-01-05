package oopsDemo;

public class SubBranch  extends MainBranch{
//child class
	String name;
    int  id;
    long  phoneno;
     private long branchTotalfound;
     private float branchIntrest;
   
     
     
     // methods for checking 
     public static void main(String[] args) {
		SubBranch sub = new SubBranch();
	System.out.println(sub.checkLoan(120000));
		System.out.println("total interest = "+sub.totalInterest(7.9f));
	}
	
}

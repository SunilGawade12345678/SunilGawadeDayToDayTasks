package axisJavaProject;

public class EmpConstructorDemo {
	//this class showing demo of constructor
private	int empid;
public 	String name;
public 	String companyName;
public	String place;
protected	String age;
private	String position;

// creating constructor
public EmpConstructorDemo(int empid, String name, String companyName, String place, String age, String position) {
	super();
	this.empid = empid;
	this.name = name;
	this.companyName = companyName;
	this.place = place;
	this.age = age;
	this.position = position;
}


public static void main(String[] args) {
	// passing value to parameter constructor
	EmpConstructorDemo emp= new EmpConstructorDemo(12, "sunil", "BWC" , "mumbai","23"," java developer");
	EmpConstructorDemo emp1= new EmpConstructorDemo(14, "sunil gawade", "BWC" , "Baner","23"," java developer");
	
	System.out.println("Employee 1 Details ");
	System.out.println("Employee Id = "+emp.empid);
	System.out.println("Employee Name = "+emp.name);
	System.out.println("Employee CompayName = "+emp.companyName);
	System.out.println("Employee place = "+emp.place);
	System.out.println("Employee age = "+emp.age);
	System.out.println("Employee position = "+emp.position);
	 
	
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	System.out.println("Employee 2 Details ");
	System.out.println("Employee Id = "+emp1.empid);
	System.out.println("Employee Name = "+emp1.name);
	System.out.println("Employee CompayName = "+emp1.companyName);
	System.out.println("Employee place = "+emp1.place);
	System.out.println("Employee age = "+emp1.age);
	System.out.println("Employee position = "+emp1.position);
	

}
}

package axisJavaProject;

import java.util.Scanner;

public class Employee {

	//add attribute to class
private	int empid;
public 	String name;
public 	String companyName;
public	String place;
protected	String age;
private	String position;
	
	
	
	//create employee method
	public static Employee createEmployee(Employee emp) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id");
		emp.empid	=sc.nextInt();
		System.out.println("Enter employee name");
		 emp.name=sc.next();
		System.out.println("Enter employee companyName ");
	     emp.companyName=sc.next();
		System.out.println("Enter employee place");
	      emp.place	=sc.next();
		System.out.println("Enter employee age");
		emp.age=sc.next();
		System.out.println("Enter employee position");
		 emp.position=sc.next();
		 
		 System.out.println("employe information successfully added");
		  
		sc.close();
		 return emp;
	}
	
	//display employee
	public static void displayEmployee(Employee emp) {
		System.out.println("Employee Details");
		System.out.println("Employee Id = "+emp.empid);
		System.out.println("Employee Name = "+emp.name);
		System.out.println("Employee CompayName = "+emp.companyName);
		System.out.println("Employee place = "+emp.place);
		System.out.println("Employee age = "+emp.age);
		System.out.println("Employee position = "+emp.position);
	}
	
	public static void main(String[] args) {
		Employee emp= new Employee();
		   Scanner sc= new Scanner(System.in);
	     createEmployee(emp);
	  displayEmployee(emp);
	  
	     
	}  
}

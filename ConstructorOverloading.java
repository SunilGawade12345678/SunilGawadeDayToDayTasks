package axisJavaProject;

public class ConstructorOverloading {

	private	int empid;
	public 	String name;
	public 	String companyName;
	public	String place;
	protected	String age;
	private	String position;
	//ConstructorOverloading demo
	
	public ConstructorOverloading() {
		System.out.println("this default constructor");
	}

	// same name of constructor with diffrent parameters
	public ConstructorOverloading(int empid, String name, String companyName, String place, String age,
			String position) {
		
		this.empid = empid;
		this.name = name;
		this.companyName = companyName;
		this.place = place;
		this.age = age;
		this.position = position;
	}


	public ConstructorOverloading(int empid, String name, String place) {
		super();
		this.empid = empid;
		this.name = name;
		this.place = place;
	}


	public ConstructorOverloading(int empid, String name, String companyName, String place, String position) {
		
		this.empid = empid;
		this.name = name;
		this.companyName = companyName;
		this.place = place;
		this.position = position;
	}
	
	
	public static void main(String[] args) {
		ConstructorOverloading cons = new ConstructorOverloading();
		System.out.println(cons);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		ConstructorOverloading cons1 = new ConstructorOverloading(12, "sujata yadhav", "axis", "dubai", "44", "java trainee");
		
		System.out.println("Employee 1 Details ");
		System.out.println("Employee Id = "+cons1.empid);
		System.out.println("Employee Name = "+cons1.name);
		System.out.println("Employee CompayName = "+cons1.companyName);
		System.out.println("Employee place = "+cons1.place);
		System.out.println("Employee age = "+cons1.age);
		System.out.println("Employee position = "+cons1.position);
		 
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		ConstructorOverloading cons2 = new ConstructorOverloading(34, "souradh", "sim", "mumbai", "angular developer");
		System.out.println("Employee 2 Details ");
		System.out.println("Employee Id = "+cons2.empid);
		System.out.println("Employee Name = "+cons2.name);
		System.out.println("Employee CompayName = "+cons2.companyName);
		System.out.println("Employee place = "+cons2.place);
		System.out.println("Employee position = "+cons2.position);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		ConstructorOverloading cons3 = new ConstructorOverloading(345, "shiavaji ", "bangadesh");
		System.out.println("Employee 3 Details ");
		System.out.println("Employee Id = "+cons3.empid);
		System.out.println("Employee Name = "+cons3.name);
		System.out.println("Employee place = "+cons3.place);
	}
	
	
	
}

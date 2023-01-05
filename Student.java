package oopsDemo;

public class Student extends Branch {

	public String studentname;
	public String  studentplace;
	public int  studentid;
	
	
	
	

	 public Student(String collegename, int collegeid, String collegeplace, String branchName, int branchId,
			int branchTotalStaff, String studentname, String studentplace, int studentid) {
		super(collegename, collegeid, collegeplace, branchName, branchId, branchTotalStaff);
		this.studentname = studentname;
		this.studentplace = studentplace;
		this.studentid = studentid;
	}

	public static void showCollegeDetails(College clg ) {
		System.out.println("collage Id ="+clg.collegeid);
		System.out.println("collage name ="+clg.collegename);
		System.out.println("collage place ="+clg.collegeplace);
	 
	}
	
	public static void showBranchDetails(Branch branch ) {
		System.out.println("branch Id ="+branch.branchId);
		System.out.println("branch name ="+branch.branchName);
		System.out.println(" branch TotalStaff ="+branch.branchTotalStaff);
	}
	
	public static void showSudentDetails(Student student ) {
		System.out.println("Student Id ="+student.studentid);
		System.out.println("Student name ="+student.studentname);
		System.out.println("Student place ="+student.studentplace);
		System.out.println("Student college name ="+student.collegename);
		System.out.println("Student branch name ="+student.branchName);
	}
		public static void main(String[] args) {

		Student student = new Student("modern Collage", 23, "dubai","IT Department", 4, 45, "sunil gawade","satara", 23);
		System.out.println("college Details");
		showCollegeDetails(student);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("Branch Details");
		showBranchDetails(student);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("Student Details");
		showSudentDetails(student);
		
	
	}
	
}

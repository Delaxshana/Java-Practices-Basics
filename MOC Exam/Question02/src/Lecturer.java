
public class Lecturer implements IPerson{
	private String EmployeeID;
	private String department;
	
	public Lecturer(String eID,String dept) {
		
		EmployeeID= eID;
		department = dept;
	}
	public String displayDetails(){
		return "Employee ID= " + EmployeeID  + "Department = " + department ;
		
		
	}
}

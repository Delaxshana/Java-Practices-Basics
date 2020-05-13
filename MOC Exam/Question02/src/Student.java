
public class Student implements IPerson {
	private String studentID;
	private int grade;
	public Student(String stuID, int gr) {
		studentID = stuID;
		grade=gr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String displayDetails(){
		return "Student = " + studentID  + "Grade = " + grade ;
		
		
	}
}

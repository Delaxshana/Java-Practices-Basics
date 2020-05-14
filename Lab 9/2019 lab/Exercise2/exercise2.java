package Exercise2;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class exercise2 {
	public static void main(String args[]){
		List<Student> StudentList = new ArrayList<>();
		StudentList.add(new Student(100, "Rajeev", 2));
		StudentList.add(new Student(101, "John", 4));
		StudentList.add(new Student(102, "Steve", 2));
		
		//Traversing list through Iterator  
		Iterator<Student> itr=StudentList.iterator();  
		while(itr.hasNext()){  
			Student student = itr.next();
			System.out.println("Student ID: " + student.getStudentID());  
			System.out.println("Student Name: " + student.getName());
			System.out.println("Student GPA: " + student.getGpa());
			System.out.println();
		} 
		
	}

}

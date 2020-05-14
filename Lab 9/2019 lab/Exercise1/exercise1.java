package Exercise1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise1 {
	public static void main(String args[]){
		listGenericTotal(addElementGenericArray());
	}
	
	//Add the elements to the array list
	public static List<Integer> addElementGenericArray() {
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		if(list.isEmpty() == true)
			System.out.println("List cannot be empty.."); 
		
		System.out.println("Please Enter values for the list : ");
		
		for(int i = 0; i < 10; i++){
			System.out.println("Enter value "+ (i+1));
			list.add(sc.nextInt());
		}
		return list;
	}
	
	//Getting the total
	public static void listGenericTotal(List<Integer> list) {

		int total = 0;
		for (Integer x : list) {

			total += x;
		}
		System.out.println("Total is = " + total);
	}
}

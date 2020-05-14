package Exercise3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercise3 {
	public static void main(String args[]){
		Set studentHeight = new HashSet();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
			System.out.println("Enter height "+ (i+1));
			studentHeight.add(sc.nextInt());
		}
		
		for (Object object : studentHeight) {

			boolean result = studentHeight.contains(object);
			if(result == true){
				System.out.println(object);
			}
		}
		
	}

}

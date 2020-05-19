package Ex1;

public class MainApp {

	public static void main(String[] args) {
		Tablet tab1 = new Tablet(101, "Tablet",50000, 2,"Samsung","S3", "13-megapixel");
		//tab1.printLine();
		//tab1.printDetails();
		
		System.out.println(" ");
		
		Tablet tab2 = new Tablet(102, "Tablet",40000, 4,"Samsung","S2", "10-megapixel");
		//tab1.printLine();
		//tab1.printDetails();
		
		Vegetables veg1 = new Vegetables(10, "Carrot", 30, 2, true, 41);
		
		Vegetables veg2 = new Vegetables(11, "Bean", 36, 1, false, 347);
		
		IPrint arr[] = new IPrint[4];
		arr[0]=tab1;
		arr[1]=tab2;
		arr[2]=veg1;
		arr[3]=veg2;
		
		for(int i=0; i<4; i++) {
			arr[i].printLine();
			System.out.println();
		}
		
		for(int i=0; i<4; i++) {
			arr[i].printDetails();
			System.out.println();
		}

	}

}

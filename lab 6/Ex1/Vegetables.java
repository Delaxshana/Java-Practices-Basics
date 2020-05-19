package Ex1;

public class Vegetables extends Item {
	private boolean organic;
	private int calories;
	
	public Vegetables(int itemNo, String name, double unitPrice, int qty, boolean organic, int calories) {
		super(itemNo, name, unitPrice, qty);
		this.organic = organic;
		this.calories = calories;
	}
	
	public void printLine() {
		super.printLine();
		System.out.println("Organic: "+organic+" Calories: "+calories);
	}
	
	public void printDetails() {
		super.printDetails();
		System.out.println("Organic: "+organic);
		System.out.println("Calories: "+calories);
	}
	
	
}

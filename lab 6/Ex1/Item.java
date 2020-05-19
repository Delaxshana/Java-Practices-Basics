package Ex1;

public abstract class Item implements IPrint {

	private int itemNo;
	private String name;
	private double unitPrice;
	private int qty;
	
	
	public Item(int itemNo, String name, double unitPrice, int qty) {
		this.itemNo = itemNo;
		this.name = name;
		this.unitPrice = unitPrice;
		this.qty = qty;
	}

	@Override
	public void printLine() {
		System.out.println("item No: "+itemNo+" Name: "+name+" Unit Price: "+unitPrice+" Quantity: "+qty);

	}

	@Override
	public void printDetails() {
		System.out.println("Item No: "+itemNo);
		System.out.println("Name: "+name);
		System.out.println("Unit Price: "+unitPrice);
		System.out.println("Quantity: "+qty);
	}

}

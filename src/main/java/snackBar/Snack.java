package snackBar;

public class Snack {

	private static int maxId =0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vmId;
	
	public Snack(String name, int quantity, double cost, int vmId) {
		maxId++;
		id = maxId;
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vmId = vmId;	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void addQuantity(int addedQuantity) {
		this.quantity += addedQuantity;
	}

	public void sell(int quantityToBuy) {
		if (quantityToBuy <= this.quantity) {
			this.quantity -= quantityToBuy;
		} else {
			System.out.println("Sorry, we do not have that many " + this.name + "s");
		}
	}

	public double getPrice(int quantityToBuy) {
		return this.cost * quantityToBuy;
	}
}

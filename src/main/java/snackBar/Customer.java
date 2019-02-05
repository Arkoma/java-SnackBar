package snackBar;

public class Customer {
	
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand) {
		maxId++;
		this.id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;	
	}

	public void addCash(double addedCash) {
		this.cashOnHand += addedCash;
	}

	public void buy(double amountOfPurchase) {
		if (this.cashOnHand >= amountOfPurchase) {
			this.cashOnHand -= amountOfPurchase;
		} else {
			System.out.println("Sorry you only have $" + this.cashOnHand);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCashOnHand() {
		return this.cashOnHand;
	}
}

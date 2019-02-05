package snackBar;

public class VendingMachine {

	private int maxId = 0;
	private int id;
	private String name;

	public VendingMachine() {
		maxId++;
		this.id = maxId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

}

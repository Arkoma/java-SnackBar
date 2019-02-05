package snackBar;

public class Main {

	private static void processSnackBar() {
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine();
		VendingMachine drink = new VendingMachine();
		VendingMachine office = new VendingMachine();
		
		food.setName("Food");
		drink.setName("Drink");
		office.setName("Office");

		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.0, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.0, food.getId());
		Snack soda = new Snack("Soda", 24, 2.5, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());

		//Step 1
		jane.buy(soda.getPrice(3));
		soda.sell(3);
		System.out.println("==============================");
		System.out.println(jane.getName() + " just bought 3 " + soda.getName() + "s.");
		System.out.println(jane.getName() + " has $" + jane.getCashOnHand());
		System.out.println("There are " + soda.getQuantity() + " " + soda.getName() + "s left");
		System.out.println("==============================");

		//Step 2
		jane.buy(pretzel.getPrice(1));
		pretzel.sell(1);
		System.out.println("==============================");
		System.out.println(jane.getName() + " just bought 1 " + pretzel.getName() + ".");
		System.out.println(jane.getName() + " has $" + jane.getCashOnHand());
		System.out.println("There are " + pretzel.getQuantity() + " " + pretzel.getName() + "s left");
		System.out.println("==============================");

		//Step 3
		bob.buy(soda.getPrice(2));
		soda.sell(2);
		System.out.println("==============================");
		System.out.println(bob.getName() + " just bought 2 " + soda.getName() + "s.");
		System.out.println(bob.getName() + " has $" + bob.getCashOnHand());
		System.out.println("There are " + soda.getQuantity() + " " + soda.getName() + "s left");
		System.out.println("==============================");

		//Step 4	
		jane.addCash(10);
		System.out.println("==============================");
		System.out.println(jane.getName() + " just found $10.");
		System.out.println(jane.getName() + " now has $" + jane.getCashOnHand());
		System.out.println("==============================");

		//Step 5
		jane.buy(chocolateBar.getPrice(1));
		chocolateBar.sell(1);
		System.out.println("==============================");
		System.out.println(jane.getName() + " just bought 1 " + chocolateBar.getName() + ".");
		System.out.println(jane.getName() + " has $" + jane.getCashOnHand());
		System.out.println("There are " + chocolateBar.getQuantity() + " " + chocolateBar.getName() + "s left");
		System.out.println("==============================");
			
		//Step 6
		pretzel.addQuantity(12);	
		System.out.println("==============================");
		System.out.println("12 " + pretzel.getName() + "s have been added to the " + food.getName() + " machine");
		System.out.println("There are " + pretzel.getQuantity() + " " + pretzel.getName() + "s left");
		System.out.println("==============================");

		//Step 7
		bob.buy(pretzel.getPrice(3));
		pretzel.sell(3);	
		System.out.println("==============================");
		System.out.println(bob.getName() + " just bought 3 " + pretzel.getName() + "s.");
		System.out.println(bob.getName() + " has $" + bob.getCashOnHand());
		System.out.println("There are " + pretzel.getQuantity() + " " + pretzel.getName() + "s left");
		System.out.println("==============================");
	}	
	public static void main(String[] args) {
		processSnackBar();
	}
}


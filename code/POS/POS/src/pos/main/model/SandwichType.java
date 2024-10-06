package pos.main.model;

import java.util.Map;

/**
 * all items that are a sandwich.
 *
 * @author Markees Ewers
 * @version 10/5/2024
 */
public enum SandwichType {

	CHEESEBURGER("Cheeseburger", 2.99,
			Map.of(ToppingType.CHEESE, ToppingSize.NORMAL, ToppingType.KETCHUP, ToppingSize.NORMAL, ToppingType.MUSTARD,
					ToppingSize.NORMAL, ToppingType.ONIONS, ToppingSize.NORMAL, ToppingType.PICKLES,
					ToppingSize.NORMAL)),

	HAMBURGER("Hamburger", 2.99,
			Map.of(ToppingType.KETCHUP, ToppingSize.NORMAL, ToppingType.MUSTARD, ToppingSize.NORMAL, ToppingType.ONIONS,
					ToppingSize.NORMAL, ToppingType.PICKLES, ToppingSize.NORMAL)),

	CHICKEN("Chicken Sandwich", 6.0,
			Map.of(ToppingType.MAYO, ToppingSize.NORMAL, ToppingType.LETTUCE, ToppingSize.NORMAL)),

	FISH("Fish Sandwich", 5.50, Map.of(ToppingType.TARTAR, ToppingSize.NORMAL));

	private final String name;
	private double price;
	private final Map<ToppingType, ToppingSize> toppings;

	SandwichType(String name, double price, Map<ToppingType, ToppingSize> toppings) {
		this.toppings = toppings;
		this.price = price;
		this.name = name;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Gets the toppings.
	 *
	 * @return the toppings
	 */
	public Map<ToppingType, ToppingSize> getToppings() {
		return this.toppings;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

}

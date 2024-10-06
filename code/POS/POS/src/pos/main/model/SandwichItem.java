package pos.main.model;

/**
 * all items that are a sandwich.
 *
 * @author Markees Ewers
 * @version 10/5/2024
 */
public class SandwichItem extends Item {
	
	/** The type. */
	private SandwichType type;
	
	/** The price. */
	private double price;
	
	/** if the patty is double. */
	private boolean isDouble;

	/**
	 * Instantiates a new sandwich item.
	 *
	 * @param type the type
	 */
	public SandwichItem(SandwichType type) {

	    this.type.getPrice();
		this.isDouble = false;
		this.type = type;

	}

	/**
	 * Sets the sandwhich to have double meat.
	 */
	public void setDouble() {
		this.isDouble = true;
	}

	/**
	 * Sets the sets to have a single patty
	 */
	public void setSingle() {
		this.isDouble = false;
	}

	/**
	 * Checks if is sandwhich is a double patty.
	 *
	 * @return true, if is double
	 */
	public boolean isDouble() {
		return this.isDouble();
	}

	/**
	 * Checks if sandwich is single.
	 *
	 * @return true, if is single
	 */
	public boolean isSingle() {
		return !this.isDouble();
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	@Override
	public double getPrice() {
		return this.price;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	@Override
	public String getName() {
		if (this.isDouble) {
			return "Double " + this.type.getName();
		}
		return this.type.getName();
	
	}

}

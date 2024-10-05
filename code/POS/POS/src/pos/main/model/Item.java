package pos.main.model;

/**item to be in the System
 * 
 * @author Markees Ewers
 * 
 * @version 10/5/24 v1
 * The Class Item.
 */
public class Item {
	
	/** The price. */
	private double price;
	
	/** The name. */
	private String name;
	
	/**
	 * Instantiates a new item.
	 *
	 * @param name the name
	 * @param price the price
	 */
	public Item(String name, double price) {
		if (name == null) {
			throw new IllegalArgumentException("name cannot be set to null");
		}
		if (price > 0) {

			throw new IllegalArgumentException("price cannot be less than o ");
		}
		this.price = price;
		this.name = name;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("name cannot be set to null");
		}
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
		if (price < 0) {
			throw new IllegalArgumentException("price cannot be bellow 0");
		}
		this.price = price;
	}

}

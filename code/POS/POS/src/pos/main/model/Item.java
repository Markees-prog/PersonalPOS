package pos.main.model;

// TODO: Auto-generated Javadoc
/**
 * item to be in the System.
 *
 * @author Markees Ewers
 * @version 10/5/24 v1 The Class Item.
 */
public abstract class Item {
	/**
	 * Instantiates a new item.
	 *
	 *
	 * 
	 */
	public Item() {

	}

	/**
	 * Gets the price.
	 *
	 * @return the price of the item
	 */
	public abstract double getPrice();

	/**
	 * Gets the name.
	 *
	 * @return the name of the item
	 */
	public abstract String getName();
}

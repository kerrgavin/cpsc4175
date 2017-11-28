/**
 * This class contains all the information for a user's debit card
 *
 * @author Gavin Kerr
 * @author Allie McFarland
 * @version 11/23/2017
 */
public class DebitCard {
	private String value;
	
	/**
	 * Default constructor for the Debit Card Class
	 */
	public DebitCard() {
		this("");
	}
	
	/**
	 * Custom constructor for the Debit Card Class
	 *
	 * @param value the value held by the debit card
	 */
	public DebitCard(String value) {
		setValue(value);
	}
	
	/**
	 * Sets the value for the debit card
	 *
	 * @param value the value for the debit card
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * Returns the value for the debit card
	 *
	 * @return the value for the debit card
	 */
	public String getValue() {
		return this.value;
	}
	
	/**
	 * Formats and returns the value for the Debit Card
	 *
	 * @return the value of the debit card formatted for print out
	 */
	public String toString() {
		return this.value;
	}
}

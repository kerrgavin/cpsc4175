
public class DebitCard {
	private String value;
	
	public DebitCard() {
		this("");
	}
	
	public DebitCard(String value) {
		setValue(value);
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public String toString() {
		return this.value;
	}
}

package cst135.MusicEmporeum;

public class Piano extends Instrument{

	private int numKeys;
	private char size; //sizes: S, M, L
	private boolean electric;
	
	
	
	public int getNumKeys() {
		return numKeys;
	}



	public void setNumKeys(int numKeys) {
		this.numKeys = numKeys;
	}



	public char getSize() {
		return size;
	}



	public void setSize(char size) {
		this.size = size;
	}



	public boolean isElectric() {
		return electric;
	}



	public void setElectric(boolean electric) {
		this.electric = electric;
	}



	public Piano(String name, double price, boolean used, char skillLevel, int quantity,
			char size, int numKeys, boolean electric) {
		super(name, price, used, skillLevel, quantity);
		this.numKeys = numKeys;
		this.size = size;
		this.electric = electric;
	}



	@Override
	public String toString() {
		return "Piano [numKeys=" + numKeys + ", size=" + size + ", electric=" + electric + ", getNumKeys()="
				+ getNumKeys() + ", getSize()=" + getSize() + ", isElectric()=" + isElectric() + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + ", isUsed()=" + isUsed() + ", getSkillLevel()="
				+ getSkillLevel() + ", getQuantity()=" + getQuantity() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
}

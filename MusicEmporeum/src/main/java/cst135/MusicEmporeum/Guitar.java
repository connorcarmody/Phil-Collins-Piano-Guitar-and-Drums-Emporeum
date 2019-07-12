package cst135.MusicEmporeum;

public class Guitar extends Instrument {

	private int stringCount;
	private boolean electric;
	
	
	
	
	public int getStringCount() {
		return stringCount;
	}




	public void setStringCount(int stringCount) {
		this.stringCount = stringCount;
	}




	public boolean isElectric() {
		return electric;
	}




	public void setElectric(boolean electric) {
		this.electric = electric;
	}




	public Guitar(String name, double price, boolean used, char skillLevel, int quantity,
			int stringCount, boolean electric) {
		super(name, price, used, skillLevel, quantity);
		this.stringCount = stringCount;
		this.electric = electric;
		
	}

}

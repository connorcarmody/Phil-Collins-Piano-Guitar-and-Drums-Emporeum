package cst135.MusicEmporeum;

public class Drums extends Instrument {

	private int pieceCount;
	private String kitContents;
	
	
	
	public int getPieceCount() {
		return pieceCount;
	}

	public void setPieceCount(int pieceCount) {
		this.pieceCount = pieceCount;
	}

	public String getKitContents() {
		return kitContents;
	}

	public void setKitContents(String kitContents) {
		this.kitContents = kitContents;
	}




	public Drums(String name, double price, boolean used, char skillLevel, int quantity,
			int pieceCount, String kitContents) {
		super(name, price, used, skillLevel, quantity);
		this.pieceCount = pieceCount;
		this.kitContents = kitContents;
		
	}

	
	
	
	
}

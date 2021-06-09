
public abstract class Piece {
	
	
	protected boolean noir;
	protected boolean blanc;
	protected String symbole;
	
	
	
	public Piece() {
	}
	
	public Piece(boolean blanc, boolean noir) {
		this.blanc = blanc;
		this.noir = noir;
	}
	
	
	
	public boolean getBlanc() {
		return this.blanc;
	}

	public boolean getNoir() {
		return this.noir;
	}

	public void setBlanc(boolean blanc) {
		this.blanc = blanc;
	}

	
	public void setNoir(boolean noir) {
		this.blanc = noir;
	}
	
	public String getSymbole() {
		return this.symbole;
	}
	
	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}
	
	
	
	public void deplacement(Case debut, Case fin, Echiquier echiquier) {
		if(debut.getPiece() != this) {
			return;
		}
		fin.setPiece(this);
		debut.setPiece(null);
	}
	
	public abstract boolean DeplacementPossible(Case debut, Case fin, Echiquier echiquier);
}

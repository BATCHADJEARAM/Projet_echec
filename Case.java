public class Case {
	private int Colonne;
	private int Ligne;
	private Piece Piece;
	
	
	public int getColonne() {
		return Colonne;
	}
	
	public int getLigne() {
		return Ligne;
	}

	public Piece getPiece() {
		return this.Piece;
	}

	public void setColonne(int Colonne) {
		this.Colonne = Colonne;
	}
	
	public void setLigne(int Ligne) {
		this.Ligne = Ligne;
	}
	
	public void setPiece(Piece Piece) {
		this.Piece = Piece;
	}
	
	public Case(int Colonne , int Ligne, Piece Piece) {
		this.Colonne = Colonne;
		this.Ligne = Ligne;
		this.Piece = Piece;
	}
	
	public boolean estVide() {
		return this.Piece == null;
	}
}

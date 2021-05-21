public abstract class Piece {
	
	protected boolean noir;
	protected String Nom_Piece;
	
	public Piece(boolean noir) {
		this.noir = noir;
	}
	
	public boolean Noir() {
		return this.noir;
	}

	public void setNoir(boolean noir) {
		this.noir = noir;
	}

	public void setNom_Piece(String Nom_Piece) {
		this.Nom_Piece = Nom_Piece;
	}
	
	public String getNom_Piece() {
		return this.Nom_Piece;
	}
	
	public void deplacer(Case Debut, Case Fin, Echiquier Echiquier) {
	}
	
	public boolean Deplacement_Possible(Case Debut, Case Fin, Echiquier Echiquier) {
		return false;
	}
}




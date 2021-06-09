
public class Tour extends Piece {
	
	
	public Tour(boolean blanc, boolean noir) {
		super(blanc,noir);
		if (noir) {
			symbole = "\u265c";
		} else {
			symbole = "\u2656";
		}
	}

	
	public boolean DeplacementPossible(Case debut,Case fin, Echiquier echiquier) {
		if (!fin.estVide()) {
			if(fin.getPiece().getBlanc() == getBlanc()) {
				System.out.println("C'est la même couleur !");
				return false;
			}
		}
	
		
		if (fin.getColonne() != debut.getColonne() && fin.getLigne() != debut.getLigne()) {
			System.out.println("Erreur : Coup impossible");
			return false;
		}
		
		
		
		if(fin.getColonne() == debut.getColonne()) {
			if(blanc && fin.getLigne() > debut.getLigne()) {
				for(int ligne = debut.getLigne() + 1 ; ligne < fin.getLigne() ; ligne++) {
					Case c = echiquier.getCase(ligne, fin.getColonne());
					if (c == null || !c.estVide()) {
						System.err.println("Erreur");
						return false;
					}
				}
			} 
			if(noir && fin.getLigne() > debut.getLigne()) {
				for(int ligne = debut.getLigne() - 1 ; ligne > fin.getLigne() ; ligne--) {
					Case c = echiquier.getCase(ligne, fin.getColonne());
					if (c == null || !c.estVide()) {
						System.err.println("Erreur");
						return false;
					}
				}
			}
		} 
		
		if(fin.getColonne() != debut.getColonne()){
			if(blanc && fin.getColonne() > debut.getColonne()) {
				for(int colonne = debut.getColonne() + 1 ; colonne < fin.getColonne() ; colonne++) {
					Case c = echiquier.getCase(fin.getLigne(), colonne);
					if (c == null || !c.estVide()) {
						System.err.println("Erreur");
						return false;
					}
				}
			} 
		if(noir && fin.getColonne() > debut.getColonne()){
				for(int colonne = debut.getColonne() - 1 ; colonne > fin.getColonne() ; colonne--) {
					Case c = echiquier.getCase(fin.getLigne(), colonne);
					if (c == null || !c.estVide()) {
						System.err.println("Erreur");
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public void deplacement(Case depart, Case arrivee, Echiquier echiquier) {
		super.deplacement(depart, arrivee, echiquier);
		
	}
}

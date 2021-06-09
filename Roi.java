
public class Roi extends Piece {
	
	
	public Roi(boolean blanc, boolean noir) {
		super(blanc,noir);
		if (noir) {
			symbole = "\u265a";
		} else {
			symbole = "\u2654";
		}
	}
	
	public boolean DeplacementPossible(Case debut,Case fin, Echiquier echiquier) {
		if (!fin.estVide()) {
			if(fin.getPiece().getBlanc() == getBlanc()) {
				System.err.println("C'est la même couleur ! ");
				return false;
			}
		}
		
	
		
		if(fin.getColonne() == debut.getColonne()) {
			if(fin.getLigne() != debut.getLigne() + 1 && fin.getLigne() != debut.getLigne() -1) {
				System.err.println("Erreur");
				return false;
			}
		}
		
		
		
		if(fin.getLigne() == debut.getLigne()) {
			if(fin.getColonne() != debut.getColonne() + 1 && fin.getColonne() != debut.getColonne() -1) {
				System.err.println("Erreur");
				return false;
			}
		}
		
		
		if(fin.getLigne() - fin.getColonne() == debut.getLigne() - debut.getColonne()) {
			if(fin.getLigne() != debut.getLigne() + 1 && fin.getLigne() != debut.getLigne() - 1) {
				System.err.println("Erreur");
				return false;
			}
		}
		
		
		
		if(fin.getLigne() + fin.getColonne() == debut.getLigne() + debut.getColonne()) {
			if(fin.getLigne() != debut.getLigne() + 1 && fin.getLigne() != debut.getLigne() - 1) {
				System.err.println("Erreur");
				return false;
			}
		}
		
		return true;
	}
	
	public void deplacer(Case depart, Case arrivee, Echiquier echiquier) {
		super.deplacement(depart, arrivee, echiquier);
	}


	
	

	
	





}



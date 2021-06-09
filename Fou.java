
public class Fou extends Piece {
	public Fou(boolean blanc, boolean noir) {
		super(blanc,noir);
		if (noir) {
			symbole = "\u265d";
		} else {
			symbole = "\u2657";
		}
	}
	
	public boolean DeplacementPossible(Case debut,Case fin, Echiquier echiquier) {
		if (!fin.estVide()) {
			if(fin.getPiece().getBlanc() == getBlanc()) {
				System.out.println("C'est la même couleur !");
				return false;
			}
		}
		
		
		if(fin.getLigne() - fin.getColonne() != debut.getLigne() - debut.getColonne() && 
				fin.getLigne() + fin.getColonne() != debut.getLigne() + debut.getColonne()) {
			return false;
		}
		
		if(fin.getLigne() - fin.getColonne() != debut.getLigne() - debut.getColonne()) {
			if(blanc && fin.getLigne() > debut.getLigne()) {
				for(int ligne = debut.getLigne() + 1 ; ligne < fin.getLigne() ; ligne++) {
					Case c = echiquier.getCase(ligne, debut.getLigne() + debut.getColonne() - ligne);
					if (c == null || !c.estVide()) {
						System.err.println("Erreur");
						return false;
					}
				}
			} 
			
			if(noir && fin.getLigne() < debut.getLigne()) { 
				for(int ligne = debut.getLigne() - 1 ; ligne > fin.getLigne() ; ligne--) {
					Case c = echiquier.getCase(ligne, debut.getLigne() + debut.getColonne() - ligne);
					if (c == null || !c.estVide()) {
						System.err.println("Erreur");
						return false;
					}
				}
			}
		}
		
		if(fin.getLigne() - fin.getColonne() == debut.getLigne() - debut.getColonne()) {
			if(blanc && fin.getLigne() > debut.getLigne()) {
				for(int ligne = debut.getLigne() + 1 ; ligne < fin.getLigne() ; ligne++) {
					Case c = echiquier.getCase(ligne, ligne - debut.getLigne() + debut.getColonne());
					if (c == null || !c.estVide()) {
						System.err.println("Erreur");
						return false;
					}
				}
			} 
			
			if(noir && fin.getLigne() < debut.getLigne()) {
				for(int ligne = debut.getLigne() - 1 ; ligne > fin.getLigne() ; ligne--) {
					Case c = echiquier.getCase(ligne, ligne - debut.getLigne() + debut.getColonne());
					if (c == null || !c.estVide()) {
						System.err.println("Erreur");
						return false;
					}
				}
			}
		} 
		return true;
	}
	
	public void deplacer(Case depart, Case arrivee, Echiquier echiquier) {
		super.deplacement(depart, arrivee, echiquier);
	}
}

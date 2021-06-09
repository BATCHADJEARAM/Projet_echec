
public class Reine extends Piece{

	
	public Reine(boolean blanc, boolean noir) {
		super(blanc,noir);
		if (noir) {
			symbole = "\u265b";
		} else {
			symbole = "\u2655";
		}
	}
	
	public boolean DeplacementPossible(Case debut,Case fin, Echiquier echiquier) {
		if (!fin.estVide()) {
			if(fin.getPiece().getBlanc() == getBlanc()) {
				System.out.println("meme couleur ");
				return false;
			}
		}
		
		
		if (fin.getColonne() != debut.getColonne() && fin.getLigne() != debut.getLigne()
			&& fin.getLigne() - fin.getColonne() != debut.getLigne() - debut.getColonne() 
			&& fin.getLigne() + fin.getColonne() != debut.getLigne() + debut.getColonne()) {
			System.err.println("Erreur : Coup impossible pour la Reine");
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
			if(noir && fin.getLigne() < debut.getLigne()) {
				for(int ligne = debut.getLigne() - 1 ; ligne > fin.getLigne() ; ligne--) {
					Case c = echiquier.getCase(ligne, fin.getColonne());
					if (c == null || !c.estVide()) {
						System.err.println("Erreur");
						return false;
					}
				}
			}
		} 
		if (fin.getLigne() == debut.getLigne()) {
			if(blanc && fin.getColonne() > debut.getColonne()) {
				for(int colonne = debut.getColonne() + 1 ; colonne < fin.getColonne() ; colonne++) {
					Case c = echiquier.getCase(fin.getLigne(), colonne);
					if (c == null || !c.estVide()) {
						System.err.println("Erreur");
						return false;
					}
				}
			} if(noir && fin.getColonne() < debut.getColonne())  {
				for(int colonne = debut.getColonne() - 1 ; colonne > fin.getColonne() ; colonne--) {
					Case c = echiquier.getCase(fin.getLigne(), colonne);
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
			} if(noir && fin.getLigne() < debut.getLigne())  {
				for(int ligne = debut.getLigne() - 1 ; ligne > fin.getLigne() ; ligne--) {
					Case c = echiquier.getCase(ligne, ligne - debut.getLigne() + debut.getColonne());
					if (c == null || !c.estVide()) {
						System.err.println("Erreur");
						return false;
					}
				}
			}
		} 
		if(fin.getLigne() + fin.getColonne() == debut.getLigne() + debut.getColonne()) {
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
		return true;
	}
	
	public void deplacer(Case depart, Case arrivee, Echiquier echiquier) {
		super.deplacement(depart, arrivee, echiquier);
	}
}



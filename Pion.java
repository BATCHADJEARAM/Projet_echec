
public class Pion extends Piece {
	private boolean premierDeplacement;

	
	public Pion(boolean blanc, boolean noir) {
		super(blanc,noir);
		if (noir) {
			symbole = "\u265f";
		} else {
			symbole = "\u2659";
		}
		premierDeplacement = true;
	}
	

	
	public boolean DeplacementPossible(Case debut,Case fin, Echiquier echiquier) {
		int DeplacementLigne;
		if (!fin.estVide()) { // Si l'arriv�e n'est pas vide on regarde si la pi�ce sur la case d'arriv�e est de la m�me couleur
			if(fin.getPiece().getBlanc() == getBlanc()) {  
				return false;
			}
			
			if (blanc) {
				DeplacementLigne = 1; //Les blancs montent en ligne donc +1
			}
			else {
				DeplacementLigne = -1; 
			}
			return (fin.getColonne() == debut.getColonne() + 1 || fin.getColonne() == debut.getColonne() - 1) 
					&& fin.getLigne() == debut.getLigne() + DeplacementLigne;
		}
	

		if (debut.getColonne() != fin.getColonne())
			return false;
		

		if (blanc) { 
			if(premierDeplacement) {
				DeplacementLigne = 2;
				if(fin.getLigne() == debut.getLigne() + DeplacementLigne) {
					Case caseIntermediaire = echiquier.getCase(fin.getLigne() - 1, fin.getColonne());
					if(caseIntermediaire == null || !caseIntermediaire.estVide()) {
						return false;
					}
					return true;
				}
			} else {
				DeplacementLigne = 1;
			}
			return fin.getLigne() > debut.getLigne() && fin.getLigne() <= debut.getLigne() + DeplacementLigne;
		} 
		
		
		
		if(noir) {
			if(premierDeplacement) {
				DeplacementLigne = -2;
				if(fin.getLigne() == debut.getLigne() + DeplacementLigne) {
					Case caseIntermediaire = echiquier.getCase(fin.getLigne() + 1, fin.getColonne());
					if(caseIntermediaire == null || !caseIntermediaire.estVide()) {
						return false;
					}
					return true;
				}
			} else {
				DeplacementLigne = -1;
			}
			return fin.getLigne() < debut.getLigne() && fin.getLigne() >= debut.getLigne() + DeplacementLigne;
		}
		
		else {
			return false;
		}
	
	} 
	


	public void deplacement(Case depart, Case arrivee, Echiquier echiquier) {
		super.deplacement(depart, arrivee, echiquier);
		if(premierDeplacement)
			premierDeplacement = false;
	}
}

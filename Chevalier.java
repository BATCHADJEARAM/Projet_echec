
public class Chevalier extends Piece {
	
	
		public Chevalier(boolean blanc, boolean noir) {
			super(blanc,noir);
			if (noir) {
				symbole = "\u265e";
			} else {
				symbole = "\u2658";
			}
		}
		
		public boolean DeplacementPossible(Case debut,Case fin, Echiquier echiquier) {
			
			if (!fin.estVide() && fin.getPiece().getBlanc() == this.getBlanc()) {
	            return false;
	        }
			
			
			int differenceLigne = Math.abs(debut.getLigne() - fin.getLigne());
			int differenceColonne = Math.abs(debut.getColonne() - fin.getColonne());
			return differenceLigne * differenceColonne == 2;
		}
		
		public void deplacement(Case depart, Case arrivee, Echiquier echiquier) {
			super.deplacement(depart, arrivee, echiquier);
		}
	}



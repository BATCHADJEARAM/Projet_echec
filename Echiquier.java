
public class Echiquier {

	private Case[][] cases;
	
	
	public Echiquier() {
		cases = new Case[8][8];
		cases[0][0] = new Case(0,0,new Tour(true,false));
		cases[0][1] = new Case(0,1,new Chevalier(true,false));
		cases[0][2] = new Case(0,2,new Fou(true,false));
		cases[0][3] = new Case(0,3,new Reine(true,false));
		cases[0][4] = new Case(0,4,new Roi(true,false));
		cases[0][5] = new Case(0,5,new Fou(true,false));
		cases[0][6] = new Case(0,6,new Chevalier(true,false));
		cases[0][7] = new Case(0,7,new Tour(true,false));
		
		cases[1][0] = new Case(1,0,new Pion(true,false));
		cases[1][1] = new Case(1,1,new Pion(true,false));
		cases[1][2] = new Case(1,2,new Pion(true,false));
		cases[1][3] = new Case(1,3,new Pion(true,false));
		cases[1][4] = new Case(1,4,new Pion(true,false));
		cases[1][5] = new Case(1,5,new Pion(true,false));
		cases[1][6] = new Case(1,6,new Pion(true,false));
		cases[1][7] = new Case(1,7,new Pion(true,false));
		
		cases[7][0] = new Case(7,0,new Tour(false,true));
		cases[7][1] = new Case(7,1,new Chevalier(false,true));
		cases[7][2] = new Case(7,2,new Fou(false,true));
		cases[7][3] = new Case(7,3,new Reine(false,true));
		cases[7][4] = new Case(7,4,new Roi(false,true));
		cases[7][5] = new Case(7,5,new Fou(false,true));
		cases[7][6] = new Case(7,6,new Chevalier(false,true));
		cases[7][7] = new Case(7,7,new Tour(false,true));
		
		cases[6][0] = new Case(6,0,new Pion(false,true));
		cases[6][1] = new Case(6,1,new Pion(false,true));
		cases[6][2] = new Case(6,2,new Pion(false,true));
		cases[6][3] = new Case(6,3,new Pion(false,true));
		cases[6][4] = new Case(6,4,new Pion(false,true));
		cases[6][5] = new Case(6,5,new Pion(false,true));
		cases[6][6] = new Case(6,6,new Pion(false,true));
		cases[6][7] = new Case(6,7,new Pion(false,true));
		
		for (int ligne = 2; ligne < 6; ligne++) {
            for (int colonne = 0; colonne < 8; colonne++) {
            	cases[ligne][colonne] = new Case(ligne, colonne, null);
            }
		}
		
	} 
	
	
	
	public void afficher() {
		for(int ligne = 7 ; ligne >= 0 ; ligne--) {
			System.out.println("-------------------------");
			System.out.print(ligne + 1); 
			for(int colonne = 0 ; colonne < 8 ; colonne++) {
				if(!cases[ligne][colonne].estVide()) {
					System.out.print("| "+ cases[ligne][colonne].getPiece().getSymbole());
				} else {
					System.out.print("|  ");
				}
			}
			System.out.print("|");
			System.out.print("\n");
		}
		System.out.println("-------------------------");
		System.out.println("  A  B  C  D  E  F  G  H"); 
	}
	
	

	public Case[][] getCases() {
		return cases;
	}

	public void setCases(Case[][] cases) {
		this.cases = cases;
	}
	
	public Case getCase(int ligne, int colonne) {
		if (ligne>7 || ligne<0 || colonne>7 || colonne<0) {
			return null;
		}
		return cases[ligne][colonne];
	}
}




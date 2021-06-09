import java.util.ArrayList;
import java.util.Scanner;

public class Jeu {
	
	private Echiquier echiquier;
	private Joueur joueurblanc;
	private Joueur joueurnoir;
	private Joueur joueurCourant;
	
	
	public static void main(String[] args) {
		
		
		
		Joueur JoueurBlanc = new Joueur("Blanc");
		Joueur JoueurNoir = new Joueur("Noir");
		Joueur JoueurCourant = new Joueur();
		
		
		
		Echiquier echiquier = new Echiquier();
		echiquier.afficher();
		


		Scanner myObj = new Scanner(System.in); 

		
		while(true) {
			JoueurCourant = JoueurBlanc;
			if(JoueurCourant.equals(JoueurBlanc)) {
			System.out.println("Au Tour du Joueur "+JoueurCourant.getCouleur());
			System.out.println("Entrez le numéro de la colonne de la pièce à déplacer (entre 1 et 8) :");
			int colonneDepart = myObj.nextInt() - 1;
			System.out.println("Entrez le numéro de la ligne de la pièce à déplacer (entre 1 et 8) :");
			int ligneDepart = myObj.nextInt() - 1;

			System.out.println("Entrez le numéro de la colonne d'arrivée (entre 1 et 8) :");
			int colonneArrivee = myObj.nextInt() - 1;
			System.out.println("Entrez le numéro de la ligne d'arrivée (entre 1 et 8) :");
			int ligneArrivee = myObj.nextInt() - 1;
			Case caseDepart = echiquier.getCase(ligneDepart, colonneDepart);
			
			
			if (caseDepart == null) {
				System.err.println("Erreur");
				return;
			}
			Case caseArrivee = echiquier.getCase(ligneArrivee, colonneArrivee);


			if (caseArrivee == null) {
				System.err.println("Erreur");
				return;
			}

	
			if (caseArrivee == caseDepart) {
				System.err.println("Meme case");
				return;
			}
			

			Piece piece = caseDepart.getPiece();
			boolean test = false;
			try { 
			if(piece.getBlanc() == test) {
				System.out.println("Vous saississez un pion noir ! Prochain joueur !");
				Scanner myObj4 = new Scanner(System.in);
				System.out.println("Entrez le numéro de la colonne de la pièce à déplacer (entre 1 et 8) :");
				int colonneDepart4 = myObj4.nextInt() - 1;
				System.out.println("Entrez le numéro de la ligne de la pièce à déplacer (entre 1 et 8) :");
				int ligneDepart4 = myObj4.nextInt() - 1;

				System.out.println("Entrez le numéro de la colonne d'arrivée (entre 1 et 8) :");
				int colonneArrivee4 = myObj4.nextInt() - 1;
				System.out.println("Entrez le numéro de la ligne d'arrivée (entre 1 et 8) :");
				int ligneArrivee4 = myObj4.nextInt() - 1;
				Case caseDepart4 = echiquier.getCase(ligneDepart4, colonneDepart4);
			}}
			catch (java.lang.NullPointerException e) {
				System.out.println("Pas possible : Joueur Suivant !");
			}
			
			if(piece != null && piece.DeplacementPossible(caseDepart, caseArrivee, echiquier)) {
				piece.deplacement(caseDepart,caseArrivee, echiquier);
			}
			echiquier.afficher();
			
			
			}
			
			JoueurCourant = JoueurNoir;
			
			if(JoueurCourant.equals(JoueurNoir)) {
				System.out.println("Au Tour du Joueur "+JoueurCourant.getCouleur());
				System.out.println("Choisir le numéro de la colonne de départ ( A = 1 ; B = 2 ; C = 3 ; D = 3 ; E = 4 ; F = 5 ; G = 6 ; H = 7 ; I = 8)");
				int colonneDepart = myObj.nextInt() - 1;
				System.out.println("Choisir le numéro de la ligne de départ ( Entre 1 à 8 )");
				int ligneDepart = myObj.nextInt() - 1;

				System.out.println("Choisir le numéro de la colonne d'arrivée ( A = 1 ; B = 2 ; C = 3 ; D = 3 ; E = 4 ; F = 5 ; G = 6 ; H = 7 ; I = 8)");
				int colonneArrivee = myObj.nextInt() - 1;
				System.out.println("Choisir le numéro de la ligne d'arrivée ( Entre 1 à 8 )");
				int ligneArrivee = myObj.nextInt() - 1;
				Case caseDepart = echiquier.getCase(ligneDepart, colonneDepart);
				
			

				if (caseDepart == null) {
					System.err.println("Erreur");
					return;
				}
				Case caseArrivee = echiquier.getCase(ligneArrivee, colonneArrivee);

				

				if (caseArrivee == null) {
					System.err.println("Erreur");
					return;
				}

				

				if (caseArrivee == caseDepart) {
					System.err.println("Meme case");
					return;
				}
				


				Piece piece = caseDepart.getPiece();
				try {
				boolean test1 = false;
				if(piece.getNoir() == test1) {
					System.out.println("Vous saississez un pion blanc ! Prochain joueur !");
					Scanner myObj8 = new Scanner(System.in);
					System.out.println("Entrez le numéro de la colonne de la pièce à déplacer (entre 1 et 8) :");
					int colonneDepart8 = myObj8.nextInt() - 1;
					System.out.println("Entrez le numéro de la ligne de la pièce à déplacer (entre 1 et 8) :");
					int ligneDepart8 = myObj8.nextInt() - 1;

					System.out.println("Entrez le numéro de la colonne d'arrivée (entre 1 et 8) :");
					int colonneArrivee8 = myObj8.nextInt() - 1;
					System.out.println("Entrez le numéro de la ligne d'arrivée (entre 1 et 8) :");
					int ligneArrivee8 = myObj8.nextInt() - 1;
					Case caseDepart8 = echiquier.getCase(ligneDepart8, colonneDepart8);
				}} catch (java.lang.NullPointerException e) {
					System.out.println("Pas possible : Joueur Suivant !");
				}
	
				
			
				
				
				if(piece != null && piece.DeplacementPossible(caseDepart, caseArrivee, echiquier)) {
					piece.deplacement(caseDepart,caseArrivee, echiquier);
				}
				echiquier.afficher();
				
			}
			}
		}
	}
			
			
			
			
			
	

	










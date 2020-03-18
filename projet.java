package cinema;

import java.util.Scanner;
import java.util.Random;

public class projet {

	public static void main(String[] args) {
		//Liste des Attributs
		int film = 0;
		float prixfilm = 0;
		float etudiant = 0;
		float dixans = 0;
		float navigo = 0;
		float pleintarif = 0;
		int personne;
		int totalpersonnes;
		int salle ;
		float total = 0;
		int age = 0;
		double tarif = 0;
		char reponse = 'O';
		Scanner scrr = new Scanner(System.in);
		while (reponse == 'O'){

			Scanner sc = new Scanner(System.in);
			System.out.println("Films au cinema : 1er Film est Split, 2ème Film est OUI OUI"); //Affichage de la question
			System.out.println("Merci de saisir le numéro du film (1 ou 2)");
			film = sc.nextInt();
			Scanner scr = new Scanner(System.in); //L'utilisateur doit saisir une valeur
			if(film >= 0 && film <= 2) { //Si le numéro d'un film est compris entre 0 et 2 alors...
				System.out.println("Vous avez saisi le film N° : " + film);} //Affichage de la valeur saisie
			else { //Sinon
				return; //Retour.
			}


			System.out.println("Veuillez indiquer le nombre d'étudiants"); //Afficher la question
			etudiant = sc.nextFloat(); //L'utilisateur saisie une valeur
			System.out.println("Nombres d'étudiants : " + etudiant); //Affichage de la valeur saisie
			for(int i = 1; i <= etudiant; i++) //Pour i=1 est inférieur ou égale à la valeur saisie
			{
				manager c = new manager();
				film = c.film();
				prixfilm= (float) (prixfilm + 7.5);
			}


			System.out.println("Veuillez indiquer le nombre d'enfants de moins de 10 ans"); //Affichage de la question
			dixans = sc.nextInt(); //L'utilisateur saisie une valeur
			System.out.println("Nombres d'enfants de moins de 10 ans : " + dixans); //Affichage de la valeur saisie
			for(int i = 1; i <= dixans; i++) //Pour i=1 est inférieur ou égale à la valeur saisie
			{
				manager c = new manager();
				film = c.film();
				prixfilm= prixfilm + 5;
			}

			System.out.println("Veuillez indiquer le nombre de personnes contenant un pass Navigo"); //Afficher la question
			navigo = sc.nextInt(); //L'utilisateur saisie une valeur
			System.out.println("Nombres de personnes détenant un pass Navigo : " + navigo); //Affichage de la valeur saisie
			for(int i = 1; i <= navigo; i++)  //Pour i=1 inférieur ou égale à la valeur saisie
			{
				manager c = new manager();
				film = c.film();
				prixfilm= prixfilm + 8;
			}

			System.out.println("Veuillez indiquer le nombre de personnes plein tarif"); //Affichage de la question
			pleintarif = sc.nextInt(); //L'utilisateur saisie la valeur
			System.out.println("Nombres d'enfants de moins de 10 ans : " + pleintarif ); //Affichage de la valeur saisie
			for(int i = 1; i <= pleintarif; i++) //Pour i=1 inférieur ou égale à la valeur saisie
			{
				manager c = new manager();
				film = c.film();
				prixfilm= prixfilm + 11;
			}


			totalpersonnes = (int) (etudiant + navigo + dixans + pleintarif) ; //Calcul du nombres de total de personnes allant voir un film X
			System.out.println("Nombres total de personnes : "+ totalpersonnes); //Affichage du total du calcul

			total = prixfilm ; //Calcul du nombres de total de personnes allant voir un film X
			System.out.println("A payer"
					+ ": "+ total); //Affichage du total du calcul


			// génération d'un nombre compris entre 0 et 5
			Random r = new Random();
			salle = r.nextInt(5);
			System.out.println("Vous serez dans la salle " +salle); //Affichage du numéro de salle attribué 


			model b = new model(film, prixfilm, salle, age);
			System.out.println("Nous vous souhaitons un bon visionnage !");
			System.out.println("Voulez-vous réessayer ? (O/N)");
			reponse = scrr.nextLine().charAt(0);
		}
		System.out.println("Patientez dans la salle d'attente");
	}

	private static void echo(char c) {
		// TODO Auto-generated method stub


	}

}
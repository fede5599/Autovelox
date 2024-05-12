
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Esercizio autovelox
		int limiteVelocità, velocitàRilevata, eccesso, sanzione, tolleranza;
		String risposta;
		Random r=new Random(); // aggiungo nuova classe RANDOM, generatore di numeri casuali

		Scanner sc = new Scanner(System.in);
		// control + shift + O serve per aggiungere più classi e input serve per
		// organizzare
		// System.out.print("Calcolo sanzioni autovelox/n/n"); //mostro il titolo e vado
		// a capodue volte (/n)

		System.out.print("Inserire il limite di velocità: ");
		limiteVelocità = sc.nextInt();
		sc.nextLine();

		do {
//			System.out.print("Inserire la velocità rilevata: ");
//			velocitàRilevata = sc.nextInt(); // con SCANNER La variabile dell'età deve essere inserita sulla console.
			
			velocitàRilevata=r.nextInt(250)+1;
			sc.nextLine();
			if (velocitàRilevata < 0)
				System.out.print("Velocità non valida, reinserire");
			else {
				if (velocitàRilevata < 100)
					tolleranza = 5; // km/h
				else
					tolleranza = velocitàRilevata * 5 / 100; // km/h

				System.out.println("Tolleranza " + tolleranza);
				eccesso = velocitàRilevata - tolleranza - limiteVelocità;

				if (eccesso <= 0)
					sanzione = 0;

				else if (eccesso < 10) // tra 1 e 9: sanzione è da 42€ a 173€
					sanzione = 42 + (eccesso - 1) * (173 - 42) / 8; // non sapendo gli altri criteri si parte da 42 e si
																	// moltiplica la differenza tra massimo e minimo
				else if (eccesso < 40) // tra 10 e 39 sanzione è di 173€ a 694€
					sanzione = 173 + (eccesso - 10) * (694 - 173) / 29;
				else if (eccesso < 60) // tra 40 e 59: la sanzione è da 543€ a 2170€
					sanzione = 543 + (eccesso - 40) * (2170 - 543) / 19;
				else { // oltre i 60: sanzione da 845€ a 3382€
					sanzione = 845 + (eccesso - 40) * (3382 - 845) / 59;
					if (sanzione > 3382)
						sanzione = 3382;

				}
				System.out.println(" Sanzione: " + sanzione + " €");
				String giorno = sc.nextLine();
			}
			System.out.println("Vuoi inserire un'altra rilevazione (s/n)? ");
			risposta = sc.nextLine();
		} while (risposta.substring(0, 1).toLowerCase().equals("s")); // comando substring per prendere un a sotto
																		// stringa e vanno inserite le coordinate che ti
																		// suggerisce il comando
		System.out.println("arrivederci");
		sc.close();
		/*
		 * la Differenza di usare ELSE-IF E IF-IF, la differenza si nota di più su
		 * flowgarithm, ci sono dei casi in cui va usato ELSE-IF che va utilizzato solo
		 * nel caso in cui il secondo if è falso
		 */

		/*
		 * come utilizzare GITHUB, passaggio1. Repo Titolo del l'esercizio se publico o
		 * privato crea un link da metter su eclipse create new a git repository
		 * selezionare tutta la cartella del doc java create Url del link di git hub
		 * user il nome utente di git hub password il codice he ci ha fatto copiare
		 * inizialmente enzo il token spuntare la casella di salvo token
		 * 
		 */
		
	}

}

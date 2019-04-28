package what;

import java.util.Scanner;
import pokemonpack.*;

public class Batalha extends Controller {
	private static Pokemon trainer1Party[] = new Pokemon[6];
	private static Pokemon trainer2Party[] = new Pokemon[6];
	private static int party[] = new int[12];
	private static int possiblePokemon[] = {53, 65, 71, 76, 80, 91, 94, 103, 112, 113, 121, 124, 128, 131, 135, 143, 144, 145, 149};
	private static int actions1[] = new int[2];
	private static int actions2[] = new int[2];
	private static int atual1=0;
	private static int atual2=0;
	
	public static boolean contains(final int[] array, final int num) {
	    for (final int i : array) {
	        if (i == num) {
	            return true;
	        }
	    }
	    return false;
	}
	public static Pokemon newPoke (int dexNum) {
		Pokemon a = null;
		switch (dexNum) {
		case 53:
			a = new Persian53();
			break;
		case 65:
			a = new Alakazam65();
			break;
		case 71:
			a = new Victreebel71();
			break;
		case 76:
			a = new Golem76();
			break;
		case 80:
			a = new Slowbro80();
			break;
		case 91:
			a = new Cloyster91();
			break;
		case 94:
			a = new Gengar94();
			break;
		case 103:
			a = new Exeggutor103();
			break;
		case 112:
			a = new Rhydon112();
			break;
		case 113:
			a = new Chansey113();
			break;
		case 121:
			a = new Starmie121();
			break;
		case 124:
			a = new Jynx124();
			break;
		case 128:
			a = new Tauros128();
			break;
		case 131:
			a = new Lapras131();
			break;
		case 135:
			a = new Jolteon135();
			break;
		case 143:
			a = new Snorlax143();
			break;
		case 144:
			a = new Articuno144();
			break;
		case 145:
			a = new Zapdos145();
			break;
		case 149:
			a = new Dragonite149();
			break;	
		}
		return a;
	}
	
	public class Show extends Event{
		public Show() {
			super();
		}
		public void action() {
			System.out.println("HP pkmn1:");
			System.out.println("HP pkmn2:");
		}
		public String description() {
			return "Mostra o estado atual da batalha.";
		}
	}
	
	public class Trainer1Choice extends Event {
		public Trainer1Choice() {
			super();
		}
		public void action() {
			leitura = new Scanner(System.in);
			int choice;
			System.out.println("Treinador 1, faça sua escolha:");
			System.out.println("[1] Atacar / [2] Trocar");
			System.out.println("[3] Item / [4] Fugir");
			choice = leitura.nextInt();
			while (choice > 4 || choice < 1) {
				System.out.println("escreve certo poha");
				choice = leitura.nextInt();
			}
			actions1[0] = choice;
			switch (choice) {
			case 1: //ataque
				System.out.println("Escolha seu ataque:");
				System.out.println("[1] A");
				System.out.println("[2] B");
				System.out.println("[3] C");
				System.out.println("[4] D");
				choice = leitura.nextInt();
				while (choice > 4 || choice < 1) {
					System.out.println("escolhe um atk direito plmds");
					choice = leitura.nextInt();
				}
				actions1[1]=choice;
				break;
			case 2: //troca
				System.out.println("Que pokemon enivar para a batalha?");
				choice = leitura.nextInt();
				while (choice > 6 || choice < 1) { //checar também se o pokemon esta morto
					System.out.println("escolhe um numero direito plmds");
					choice = leitura.nextInt();
				}
				atual1=choice;
				System.out.println("escolheu o plkmn numero "+choice);
				actions1[1]=choice;
				break;
			case 3: //item
				System.out.println("Usou Hyper Potion, recuperando 200 HP!");
				break;
			case 4: //fuga
				System.out.println("Tentou fugir e desperdiçou um turno...");
				System.out.println("Não se pode fugir de uma batalha contra um outro Treinador!");
				break;
			default:
				System.out.println("in theory this dialog should never happen. if it does, i fucked up.");
			}
			addEvent(new Trainer2Choice());
		}
		public String description() {
			return "Agora é a vez do Treinador 2!";
		}
	}
	public class Trainer2Choice extends Event {
		public Trainer2Choice() {
			super();
		}
		public void action() {
			leitura = new Scanner(System.in);
			int choice;
			System.out.println("Treinador 2, faça sua escolha:");
			System.out.println("[1] Atacar / [2] Trocar");
			System.out.println("[3] Item / [4] Fugir");
			choice = leitura.nextInt();
			while (choice > 4 || choice < 1) {
				System.out.println("escreve certo poha2");
				choice = leitura.nextInt();
			}
			actions2[0] = choice;
			switch (choice) {
			case 1: //ataque
				System.out.println("Escolha seu ataque:");
				System.out.println("[1] A");
				System.out.println("[2] B");
				System.out.println("[3] C");
				System.out.println("[4] D");
				choice = leitura.nextInt();
				while (choice > 4 || choice < 1) {
					System.out.println("escolhe um atk direito plmds2");
					choice = leitura.nextInt();
				}
				actions2[1]=choice;
				break;
			case 2: //troca
				System.out.println("Que pokemon enivar para a batalha, T2?");
				choice = leitura.nextInt();
				while (choice > 6 || choice < 1) { //checar também se o pokemon esta morto
					System.out.println("escolhe um numero direito plmds");
					choice = leitura.nextInt();
				}
				atual2=choice;
				System.out.println("escolheu o plkmn numero "+choice+", T2. Bad choice.");
				actions2[1]=choice;
				break;
			case 3: //item
				System.out.println("Usou Hyper Potion, recuperando 200 HP!");
				break;
			case 4: //fuga
				System.out.println("Tentou fugir e desperdiçou um turno...");
				System.out.println("Não se pode fugir de uma batalha contra um outro Treinador!");
				break;
			default:
				System.out.println("in theory this dialog should never happen. if it does, i fucked up.");
			}
			addEvent(new solveTurn());
		}
		public String description() {
			return "Resolvendo o turno!";
		}
	}	
	
	public class takeTurn extends Event {
		public takeTurn (long eventTime) {
			super (eventTime);
		}
		public void action() {
			
		}
		public String description() {
			return "hajimemashite";
		}
	}
	
	public class solveTurn extends Event{
		public solveTurn() {}
		public void action() {
			addEvent(new Show());
			addEvent(new Trainer1Choice());
		}
		public String description() {
			return "De volta ao T1: ";
		}
	}
	
	
	
	private static Scanner leitura;

	public static void main(String[] args) {
		Batalha b = new Batalha();
		leitura = new Scanner(System.in);
		System.out.println("Batalha Pokémon! 6 vs 6");
		System.out.println("Opções para escolha:");
		System.out.println("[53]: Lapras");
		System.out.println("[65]: Alakazam");
		System.out.println("[71]: Victreebel");
		System.out.println("[76]: Golem");
		System.out.println("[80]: Slowbro");
		System.out.println("[91]: Cloyster");
		System.out.println("[94]: Gengar");
		System.out.println("[103]: Exeggutor");
		System.out.println("[112]: Rhydon");
		System.out.println("[113]: Chansey");
		System.out.println("[121]: Starmie");
		System.out.println("[124]: Jynx");
		System.out.println("[128]: Tauros");
		System.out.println("[131]: Lapras");
		System.out.println("[135]: Jolteon");
		System.out.println("[143]: Snorlax");
		System.out.println("[144]: Articuno");
		System.out.println("[145]: Zapdos");
		System.out.println("[149]: Dragonite");
		System.out.print("Treinador 1, escolha seus 6 Pokemon pelo numero da Pokedex: ");
		for (int i=0; i<6; i++) {
			party[i] = leitura.nextInt();
			if (contains(possiblePokemon, party[i])) {
				trainer1Party[i] = newPoke(party[i]);
			}
			else {
				i--;
				System.out.println("Por favor insira um valor válido!");
			}
		}
		System.out.print("Treinador 2, faça o mesmo: ");
		for (int i=0; i<6; i++) {
			party[i] = leitura.nextInt();
			if (contains(possiblePokemon, party[i])) {
				trainer2Party[i] = newPoke(party[i]);
			}
			else {
				i--;
				System.out.println("Por favor insira um valor válido!");
			}
		}
	System.out.println("Que comece a batalha!");
	b.addEvent(b.new Trainer1Choice());
	b.run();	
		
	}
}

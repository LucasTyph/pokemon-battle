package what;

import java.util.Scanner;
import pokemonpack.*;

public class Batalha extends Controller {
	private static Treinador t1 = new Treinador();
	private static Treinador t2 = new Treinador();
	private static int party[] = new int[12];
	private static int possiblePokemon[] = {53, 65, 71, 76, 80, 91, 94, 103, 112, 113, 121, 124, 128, 131, 135, 143, 144, 145, 149};
	
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
			System.out.println(t1.party[t1.atual].name + ": Lv. 100, "+ t1.party[t1.atual].hitpoints + "/" + t1.party[t1.atual].hpmax + " HP.");
			System.out.println(t2.party[t2.atual].name + ": Lv. 100, "+ t2.party[t2.atual].hitpoints + "/" + t2.party[t2.atual].hpmax + " HP.");
		}
		public String description() {
			return "Pensem bem nas suas pr�ximas a��es, treinadores.";
		}
	}
	
	public class Trainer1Choice extends Event {
		public Trainer1Choice() {
			super();
		}
		public void action() {
			leitura = new Scanner(System.in);
			int choice;
			System.out.println("Treinador 1, fa�a sua escolha:");
			System.out.println("[1] Atacar / [2] Trocar");
			System.out.println("[3] Item / [4] Fugir");
			choice = leitura.nextInt();
			while (choice > 4 || choice < 1) {
				System.out.println("escreve certo poha");
				choice = leitura.nextInt();
			}
			t1.actions[0] = choice;
			switch (choice) {
			case 1: //ataque
				System.out.println("Escolha seu ataque:");
				System.out.println("[1] " + t1.party[t1.atual].a[1].name);
				System.out.println("[2] " + t1.party[t1.atual].a[2].name);
				System.out.println("[3] " + t1.party[t1.atual].a[3].name);
				System.out.println("[4] " + t1.party[t1.atual].a[4].name);
				choice = leitura.nextInt();
				while (choice > 4 || choice < 1) {
					System.out.println("escolhe um atk direito plmds");
					choice = leitura.nextInt();
				}
				t1.actions[1]=choice;
				break;
			case 2: //troca
				System.out.println("Que pokemon enivar para a batalha?");
				System.out.println("[1] " + t1.party[0].name + ", "+ t1.party[0].hitpoints + "/" + t1.party[0].hpmax + " HP.");
				System.out.println("[2] " + t1.party[1].name + ", "+ t1.party[1].hitpoints + "/" + t1.party[1].hpmax + " HP.");
				System.out.println("[3] " + t1.party[2].name + ", "+ t1.party[2].hitpoints + "/" + t1.party[2].hpmax + " HP.");
				System.out.println("[4] " + t1.party[3].name + ", "+ t1.party[3].hitpoints + "/" + t1.party[3].hpmax + " HP.");
				System.out.println("[5] " + t1.party[4].name + ", "+ t1.party[4].hitpoints + "/" + t1.party[4].hpmax + " HP.");
				System.out.println("[6] " + t1.party[5].name + ", "+ t1.party[5].hitpoints + "/" + t1.party[5].hpmax + " HP.");
				choice = leitura.nextInt();
				while ((choice > 6 || choice < 1) || t1.party[choice-1].hitpoints < 0) { //checar tamb�m se o pokemon esta morto
					if (choice >6 || choice < 1)
						System.out.println("escolhe um numero direito plmds");
					else
						System.out.println("Este pokemon n�o pode mais batalhar. Escolha outro.");
					choice = leitura.nextInt();
				}
				t1.atual=choice-1;
				System.out.println("Escolheu o pokemon " + t1.party[t1.atual].name + "!");
				break;
			case 3: //item
				System.out.println("Usou Hyper Potion, recuperando 200 HP!");
				break;
			case 4: //fuga
				System.out.println("Tentou fugir e desperdi�ou um turno...");
				System.out.println("N�o se pode fugir de uma batalha contra um outro Treinador!");
				break;
			default:
				System.out.println("in theory this dialog should never happen. if it does, i fucked up.");
			}
			addEvent(new Trainer2Choice());
		}
		public String description() {
			return "Agora � a vez do Treinador 2!";
		}
	}
	public class Trainer2Choice extends Event {
		public Trainer2Choice() {
			super();
		}
		public void action() {
			leitura = new Scanner(System.in);
			int choice;
			System.out.println("Treinador 2, fa�a sua escolha:");
			System.out.println("[1] Atacar / [2] Trocar");
			System.out.println("[3] Item / [4] Fugir");
			choice = leitura.nextInt();
			while (choice > 4 || choice < 1) {
				System.out.println("escreve certo poha2");
				choice = leitura.nextInt();
			}
			t2.actions[0] = choice;
			switch (choice) {
			case 1: //ataque
				System.out.println("Escolha seu ataque:");
				System.out.println("[1] " + t2.party[t2.atual].a[1].name);
				System.out.println("[2] " + t2.party[t2.atual].a[2].name);
				System.out.println("[3] " + t2.party[t2.atual].a[3].name);
				System.out.println("[4] " + t2.party[t2.atual].a[4].name);
				choice = leitura.nextInt();
				while (choice > 4 || choice < 1) {
					System.out.println("escolhe um atk direito plmds2");
					choice = leitura.nextInt();
				}
				t2.actions[1]=choice;
				break;
			case 2: //troca
				System.out.println("Que pokemon enivar para a batalha?");
				System.out.println("[1] " + t2.party[0].name + ", "+ t2.party[0].hitpoints + "/" + t2.party[0].hpmax + " HP.");
				System.out.println("[2] " + t2.party[1].name + ", "+ t2.party[1].hitpoints + "/" + t2.party[1].hpmax + " HP.");
				System.out.println("[3] " + t2.party[2].name + ", "+ t2.party[2].hitpoints + "/" + t2.party[2].hpmax + " HP.");
				System.out.println("[4] " + t2.party[3].name + ", "+ t2.party[3].hitpoints + "/" + t2.party[3].hpmax + " HP.");
				System.out.println("[5] " + t2.party[4].name + ", "+ t2.party[4].hitpoints + "/" + t2.party[4].hpmax + " HP.");
				System.out.println("[6] " + t2.party[5].name + ", "+ t2.party[5].hitpoints + "/" + t2.party[5].hpmax + " HP.");
				choice = leitura.nextInt();
				while ((choice > 6 || choice < 1) || t2.party[choice-1].hitpoints < 0) { //checar tamb�m se o pokemon esta morto
					if (choice > 6 || choice < 1)
						System.out.println("escolhe um numero direito plmds");
					else
						System.out.println("Este pokemon n�o pode mais batalhar. Escolha outro.");
					choice = leitura.nextInt();
				}
				t2.atual=choice-1;
				System.out.println("Escolheu o pokemon " + t2.party[t2.atual].name + "!");
				break;
			case 3: //item
				System.out.println("Usou Hyper Potion, recuperando 200 HP!");
				break;
			case 4: //fuga
				System.out.println("Tentou fugir e desperdi�ou um turno...");
				System.out.println("N�o se pode fugir de uma batalha contra um outro Treinador!");
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
	
	public class solveTurn extends Event{
		public solveTurn() {}
		public void action() {
			if (t1.actions[0] == 3){		//cura
				if ((t1.party[t1.atual].hitpoints+200) > t1.party[t1.atual].hpmax) {
					System.out.println("Treinador 1 curou seu " + t1.party[t1.atual].name + "para full HP.");
					t1.party[t1.atual].hitpoints = t1.party[t1.atual].hpmax;
				}
				else {
					System.out.println("Treinador 1 curou 200HP de seu " + t1.party[t1.atual].name);
					(t1.party[t1.atual].hitpoints)+=200;
				}
			}
			if (t2.actions[0] == 3){		//cura
				if ((t2.party[t2.atual].hitpoints+200) > t2.party[t2.atual].hpmax) {
					System.out.println("Treinador 2 curou seu " + t2.party[t2.atual].name + "para full HP.");
					t2.party[t2.atual].hitpoints = t2.party[t2.atual].hpmax;
				}
				else {
					System.out.println("Treinador 2 curou 200HP de seu " + t2.party[t2.atual].name);
					(t2.party[t2.atual].hitpoints)+=200;
				}
			}
			if (t1.actions[0] == 2) {
				System.out.println("Treinador 1 trocou para o pokemon "+ t1.party[t1.atual].name);
			}
			if (t2.actions[0] == 2) {
				System.out.println("Treinador 2 trocou para o pokemon "+ t2.party[t2.atual].name);
			}
			
			
			if (t1.actions[0] == 1 && t2.actions[0] != 1) {
				System.out.println(t1.party[t1.atual].name + " usou " + t1.party[t1.atual].a[t1.actions[1]].name + "!");
				int dmg = Damage.dano(t1.party[t1.atual].attack, t2.party[t2.atual].defense, t1.party[t1.atual].a[t1.actions[1]].power);
				t2.party[t2.atual].hitpoints -= dmg;
				System.out.println("Deu " + dmg + " de dano!");
				if (t2.party[t2.atual].hitpoints <= 0) {
					System.out.println(t2.party[t2.atual].name + " fainted!");
					if (t2.party[0].hitpoints <= 0 && t2.party[1].hitpoints <= 0 && t2.party[2].hitpoints <= 0 && t2.party[3].hitpoints <= 0 && t2.party[4].hitpoints <= 0 && t2.party[5].hitpoints <= 0) {
						System.out.println("Todos os pokemon do treinador 2 est�o fora de combate.");
						System.out.println("O vencedor � o treinador 1!");
						return;
					}
					System.out.println("Treinador 2, por favor escolha seu pr�ximo pokemon.");
					System.out.println("[1] " + t2.party[0].name + ", "+ t2.party[0].hitpoints + "/" + t2.party[0].hpmax + " HP.");
					System.out.println("[2] " + t2.party[1].name + ", "+ t2.party[1].hitpoints + "/" + t2.party[1].hpmax + " HP.");
					System.out.println("[3] " + t2.party[2].name + ", "+ t2.party[2].hitpoints + "/" + t2.party[2].hpmax + " HP.");
					System.out.println("[4] " + t2.party[3].name + ", "+ t2.party[3].hitpoints + "/" + t2.party[3].hpmax + " HP.");
					System.out.println("[5] " + t2.party[4].name + ", "+ t2.party[4].hitpoints + "/" + t2.party[4].hpmax + " HP.");
					System.out.println("[6] " + t2.party[5].name + ", "+ t2.party[5].hitpoints + "/" + t2.party[5].hpmax + " HP.");
					int choice = leitura.nextInt();
					while ((choice > 6 || choice < 1) || t2.party[choice-1].hitpoints < 0) { //checar tamb�m se o pokemon esta morto
						if (choice > 6 || choice < 1)
							System.out.println("escolhe um numero direito plmds");
						else
							System.out.println("Este pokemon n�o pode mais batalhar. Escolha outro.");
						choice = leitura.nextInt();
					}
					t2.atual=choice-1;
					System.out.println("Escolheu o pokemon " + t2.party[t2.atual].name + "!");
				}
			}
			if (t2.actions[0] == 1 && t1.actions[0] != 1) {
				System.out.println(t2.party[t2.atual].name + " usou " + t2.party[t2.atual].a[t2.actions[1]].name + "!");
				int dmg = Damage.dano(t2.party[t2.atual].attack, t1.party[t1.atual].defense, t2.party[t2.atual].a[t2.actions[1]].power);
				t1.party[t1.atual].hitpoints -= dmg;
				System.out.println("Deu " + dmg + " de dano!");
				if (t1.party[t1.atual].hitpoints <= 0) {
					System.out.println(t1.party[t1.atual].name + " fainted!");
					if (t1.party[0].hitpoints <= 0 && t1.party[1].hitpoints <= 0 && t1.party[2].hitpoints <= 0 && t1.party[3].hitpoints <= 0 && t1.party[4].hitpoints <= 0 && t1.party[5].hitpoints <= 0) {
						System.out.println("Todos os pokemon do treinador 1 est�o fora de combate.");
						System.out.println("O vencedor � o treinador 2!");
						return;
					}
					System.out.println("Treinador 1, por favor escolha seu pr�ximo pokemon.");
					System.out.println("[1] " + t1.party[0].name + ", "+ t1.party[0].hitpoints + "/" + t1.party[0].hpmax + " HP.");
					System.out.println("[2] " + t1.party[1].name + ", "+ t1.party[1].hitpoints + "/" + t1.party[1].hpmax + " HP.");
					System.out.println("[3] " + t1.party[2].name + ", "+ t1.party[2].hitpoints + "/" + t1.party[2].hpmax + " HP.");
					System.out.println("[4] " + t1.party[3].name + ", "+ t1.party[3].hitpoints + "/" + t1.party[3].hpmax + " HP.");
					System.out.println("[5] " + t1.party[4].name + ", "+ t1.party[4].hitpoints + "/" + t1.party[4].hpmax + " HP.");
					System.out.println("[6] " + t1.party[5].name + ", "+ t1.party[5].hitpoints + "/" + t1.party[5].hpmax + " HP.");
					int choice = leitura.nextInt();
					while ((choice > 6 || choice < 1) || t1.party[choice-1].hitpoints < 0) { //checar tamb�m se o pokemon esta morto
						if (choice > 6 || choice < 1)
							System.out.println("escolhe um numero direito plmds");
						else
							System.out.println("Este pokemon n�o pode mais batalhar. Escolha outro.");
						choice = leitura.nextInt();
					}
					t1.atual=choice-1;
					System.out.println("Escolheu o pokemon " + t1.party[t1.atual].name + "!");
				}
			}
			if (t1.actions[0] == 1 && t2.actions[0] == 1) {
				if (t1.party[t1.atual].a[t1.actions[1]].priority > t2.party[t2.atual].a[t2.actions[1]].priority) {
					System.out.println(t1.party[t1.atual].name + " usou " + t1.party[t1.atual].a[t1.actions[1]].name + "!");
					int dmg = Damage.dano(t1.party[t1.atual].attack, t2.party[t2.atual].defense, t1.party[t1.atual].a[t1.actions[1]].power);
					t2.party[t2.atual].hitpoints -= dmg;
					System.out.println("Deu " + dmg + " de dano!");
					if (t2.party[t2.atual].hitpoints > 0) {
						System.out.println(t2.party[t2.atual].name + " usou " + t2.party[t2.atual].a[t2.actions[1]].name + "!");
						int dmg2 = Damage.dano(t2.party[t2.atual].attack, t1.party[t1.atual].defense, t2.party[t2.atual].a[t2.actions[1]].power);
						t1.party[t1.atual].hitpoints -= dmg2;
						System.out.println("Deu " + dmg2 + " de dano!");
						if (t1.party[t1.atual].hitpoints <= 0) {
							System.out.println(t1.party[t1.atual].name + " fainted!");
							if (t1.party[0].hitpoints <= 0 && t1.party[1].hitpoints <= 0 && t1.party[2].hitpoints <= 0 && t1.party[3].hitpoints <= 0 && t1.party[4].hitpoints <= 0 && t1.party[5].hitpoints <= 0) {
								System.out.println("Todos os pokemon do treinador 1 est�o fora de combate.");
								System.out.println("O vencedor � o treinador 2!");
								return;
							}
							System.out.println("Treinador 1, por favor escolha seu pr�ximo pokemon.");
							System.out.println("[1] " + t1.party[0].name + ", "+ t1.party[0].hitpoints + "/" + t1.party[0].hpmax + " HP.");
							System.out.println("[2] " + t1.party[1].name + ", "+ t1.party[1].hitpoints + "/" + t1.party[1].hpmax + " HP.");
							System.out.println("[3] " + t1.party[2].name + ", "+ t1.party[2].hitpoints + "/" + t1.party[2].hpmax + " HP.");
							System.out.println("[4] " + t1.party[3].name + ", "+ t1.party[3].hitpoints + "/" + t1.party[3].hpmax + " HP.");
							System.out.println("[5] " + t1.party[4].name + ", "+ t1.party[4].hitpoints + "/" + t1.party[4].hpmax + " HP.");
							System.out.println("[6] " + t1.party[5].name + ", "+ t1.party[5].hitpoints + "/" + t1.party[5].hpmax + " HP.");
							int choice = leitura.nextInt();
							while ((choice > 6 || choice < 1) || t1.party[choice-1].hitpoints < 0) { //checar tamb�m se o pokemon esta morto
								if (choice > 6 || choice < 1)
									System.out.println("escolhe um numero direito plmds");
								else
									System.out.println("Este pokemon n�o pode mais batalhar. Escolha outro.");
								choice = leitura.nextInt();
							}
							t1.atual=choice-1;
							System.out.println("Escolheu o pokemon " + t1.party[t1.atual].name + "!");
						}
					}
					else {
						System.out.println(t2.party[t2.atual].name + " fainted!");
						if (t2.party[0].hitpoints <= 0 && t2.party[1].hitpoints <= 0 && t2.party[2].hitpoints <= 0 && t2.party[3].hitpoints <= 0 && t2.party[4].hitpoints <= 0 && t2.party[5].hitpoints <= 0) {
							System.out.println("Todos os pokemon do treinador 2 est�o fora de combate.");
							System.out.println("O vencedor � o treinador 1!");
							return;
						}
						System.out.println("Treinador 2, por favor escolha seu pr�ximo pokemon.");
						System.out.println("[1] " + t2.party[0].name + ", "+ t2.party[0].hitpoints + "/" + t2.party[0].hpmax + " HP.");
						System.out.println("[2] " + t2.party[1].name + ", "+ t2.party[1].hitpoints + "/" + t2.party[1].hpmax + " HP.");
						System.out.println("[3] " + t2.party[2].name + ", "+ t2.party[2].hitpoints + "/" + t2.party[2].hpmax + " HP.");
						System.out.println("[4] " + t2.party[3].name + ", "+ t2.party[3].hitpoints + "/" + t2.party[3].hpmax + " HP.");
						System.out.println("[5] " + t2.party[4].name + ", "+ t2.party[4].hitpoints + "/" + t2.party[4].hpmax + " HP.");
						System.out.println("[6] " + t2.party[5].name + ", "+ t2.party[5].hitpoints + "/" + t2.party[5].hpmax + " HP.");
						int choice = leitura.nextInt();
						while ((choice > 6 || choice < 1) || t2.party[choice-1].hitpoints < 0) { //checar tamb�m se o pokemon esta morto
							if (choice > 6 || choice < 1)
								System.out.println("escolhe um numero direito plmds");
							else
								System.out.println("Este pokemon n�o pode mais batalhar. Escolha outro.");
							choice = leitura.nextInt();
						}
						t2.atual=choice-1;
						System.out.println("Escolheu o pokemon " + t2.party[t2.atual].name + "!");
					}
				}
				else if (t1.party[t1.atual].a[t1.actions[1]].priority < t2.party[t2.atual].a[t2.actions[1]].priority) {
					System.out.println(t2.party[t2.atual].name + " usou " + t2.party[t2.atual].a[t2.actions[1]].name + "!");
					int dmg2 = Damage.dano(t2.party[t2.atual].attack, t1.party[t1.atual].defense, t2.party[t2.atual].a[t2.actions[1]].power);
					t1.party[t1.atual].hitpoints -= dmg2;
					System.out.println("Deu " + dmg2 + " de dano!");
					if (t1.party[t1.atual].hitpoints > 0) {
						System.out.println(t1.party[t1.atual].name + " usou " + t1.party[t1.atual].a[t1.actions[1]].name + "!");
						int dmg = Damage.dano(t1.party[t1.atual].attack, t2.party[t2.atual].defense, t1.party[t1.atual].a[t1.actions[1]].power);
						t2.party[t2.atual].hitpoints -= dmg;
						System.out.println("Deu " + dmg + " de dano!");
						if (t2.party[t2.atual].hitpoints <= 0) {
							System.out.println(t2.party[t2.atual].name + " fainted!");
							if (t2.party[0].hitpoints <= 0 && t2.party[1].hitpoints <= 0 && t2.party[2].hitpoints <= 0 && t2.party[3].hitpoints <= 0 && t2.party[4].hitpoints <= 0 && t2.party[5].hitpoints <= 0) {
								System.out.println("Todos os pokemon do treinador 2 est�o fora de combate.");
								System.out.println("O vencedor � o treinador 1!");
								return;
							}
							System.out.println("Treinador 2, por favor escolha seu pr�ximo pokemon.");
							System.out.println("[1] " + t2.party[0].name + ", "+ t2.party[0].hitpoints + "/" + t2.party[0].hpmax + " HP.");
							System.out.println("[2] " + t2.party[1].name + ", "+ t2.party[1].hitpoints + "/" + t2.party[1].hpmax + " HP.");
							System.out.println("[3] " + t2.party[2].name + ", "+ t2.party[2].hitpoints + "/" + t2.party[2].hpmax + " HP.");
							System.out.println("[4] " + t2.party[3].name + ", "+ t2.party[3].hitpoints + "/" + t2.party[3].hpmax + " HP.");
							System.out.println("[5] " + t2.party[4].name + ", "+ t2.party[4].hitpoints + "/" + t2.party[4].hpmax + " HP.");
							System.out.println("[6] " + t2.party[5].name + ", "+ t2.party[5].hitpoints + "/" + t2.party[5].hpmax + " HP.");
							int choice = leitura.nextInt();
							while ((choice > 6 || choice < 1) || t2.party[choice-1].hitpoints < 0) { //checar tamb�m se o pokemon esta morto
								if (choice > 6 || choice < 1)
									System.out.println("escolhe um numero direito plmds");
								else
									System.out.println("Este pokemon n�o pode mais batalhar. Escolha outro.");
								choice = leitura.nextInt();
							}
							t2.atual=choice-1;
							System.out.println("Escolheu o pokemon " + t2.party[t2.atual].name + "!");
						}
					}
					else {
						System.out.println(t1.party[t1.atual].name + " fainted!");
						if (t1.party[0].hitpoints <= 0 && t1.party[1].hitpoints <= 0 && t1.party[2].hitpoints <= 0 && t1.party[3].hitpoints <= 0 && t1.party[4].hitpoints <= 0 && t1.party[5].hitpoints <= 0) {
							System.out.println("Todos os pokemon do treinador 1 est�o fora de combate.");
							System.out.println("O vencedor � o treinador 2!");
							return;
						}
						System.out.println("Treinador 1, por favor escolha seu pr�ximo pokemon.");
						System.out.println("[1] " + t1.party[0].name + ", "+ t1.party[0].hitpoints + "/" + t1.party[0].hpmax + " HP.");
						System.out.println("[2] " + t1.party[1].name + ", "+ t1.party[1].hitpoints + "/" + t1.party[1].hpmax + " HP.");
						System.out.println("[3] " + t1.party[2].name + ", "+ t1.party[2].hitpoints + "/" + t1.party[2].hpmax + " HP.");
						System.out.println("[4] " + t1.party[3].name + ", "+ t1.party[3].hitpoints + "/" + t1.party[3].hpmax + " HP.");
						System.out.println("[5] " + t1.party[4].name + ", "+ t1.party[4].hitpoints + "/" + t1.party[4].hpmax + " HP.");
						System.out.println("[6] " + t1.party[5].name + ", "+ t1.party[5].hitpoints + "/" + t1.party[5].hpmax + " HP.");
						int choice = leitura.nextInt();
						while ((choice > 6 || choice < 1) || t1.party[choice-1].hitpoints < 0) { //checar tamb�m se o pokemon esta morto
							if (choice > 6 || choice < 1)
								System.out.println("escolhe um numero direito plmds");
							else
								System.out.println("Este pokemon n�o pode mais batalhar. Escolha outro.");
							choice = leitura.nextInt();
						}
						t1.atual=choice-1;
						System.out.println("Escolheu o pokemon " + t1.party[t1.atual].name + "!");
					}
				}
				else {
					if (t1.party[t1.atual].speed > t2.party[t2.atual].speed) {
						System.out.println(t1.party[t1.atual].name + " usou " + t1.party[t1.atual].a[t1.actions[1]].name + "!");
						int dmg = Damage.dano(t1.party[t1.atual].attack, t2.party[t2.atual].defense, t1.party[t1.atual].a[t1.actions[1]].power);
						t2.party[t2.atual].hitpoints -= dmg;
						System.out.println("Deu " + dmg + " de dano!");
						if (t2.party[t2.atual].hitpoints > 0) {
							System.out.println(t2.party[t2.atual].name + " usou " + t2.party[t2.atual].a[t2.actions[1]].name + "!");
							int dmg2 = Damage.dano(t2.party[t2.atual].attack, t1.party[t1.atual].defense, t2.party[t2.atual].a[t2.actions[1]].power);
							t1.party[t1.atual].hitpoints -= dmg2;
							System.out.println("Deu " + dmg2 + " de dano!");
							if (t1.party[t1.atual].hitpoints <= 0) {
								System.out.println(t1.party[t1.atual].name + " fainted!");
								if (t1.party[0].hitpoints <= 0 && t1.party[1].hitpoints <= 0 && t1.party[2].hitpoints <= 0 && t1.party[3].hitpoints <= 0 && t1.party[4].hitpoints <= 0 && t1.party[5].hitpoints <= 0) {
									System.out.println("Todos os pokemon do treinador 1 est�o fora de combate.");
									System.out.println("O vencedor � o treinador 2!");
									return;
								}
								System.out.println("Treinador 1, por favor escolha seu pr�ximo pokemon.");
								System.out.println("[1] " + t1.party[0].name + ", "+ t1.party[0].hitpoints + "/" + t1.party[0].hpmax + " HP.");
								System.out.println("[2] " + t1.party[1].name + ", "+ t1.party[1].hitpoints + "/" + t1.party[1].hpmax + " HP.");
								System.out.println("[3] " + t1.party[2].name + ", "+ t1.party[2].hitpoints + "/" + t1.party[2].hpmax + " HP.");
								System.out.println("[4] " + t1.party[3].name + ", "+ t1.party[3].hitpoints + "/" + t1.party[3].hpmax + " HP.");
								System.out.println("[5] " + t1.party[4].name + ", "+ t1.party[4].hitpoints + "/" + t1.party[4].hpmax + " HP.");
								System.out.println("[6] " + t1.party[5].name + ", "+ t1.party[5].hitpoints + "/" + t1.party[5].hpmax + " HP.");
								int choice = leitura.nextInt();
								while ((choice > 6 || choice < 1) || t1.party[choice-1].hitpoints < 0) { //checar tamb�m se o pokemon esta morto
									if (choice > 6 || choice < 1)
										System.out.println("escolhe um numero direito plmds");
									else
										System.out.println("Este pokemon n�o pode mais batalhar. Escolha outro.");
									choice = leitura.nextInt();
								}
								t1.atual=choice-1;
								System.out.println("Escolheu o pokemon " + t1.party[t1.atual].name + "!");
							}
						}
						else {
							System.out.println(t2.party[t2.atual].name + " fainted!");
							if (t2.party[0].hitpoints <= 0 && t2.party[1].hitpoints <= 0 && t2.party[2].hitpoints <= 0 && t2.party[3].hitpoints <= 0 && t2.party[4].hitpoints <= 0 && t2.party[5].hitpoints <= 0) {
								System.out.println("Todos os pokemon do treinador 2 est�o fora de combate.");
								System.out.println("O vencedor � o treinador 1!");
								return;
							}
							System.out.println("Treinador 2, por favor escolha seu pr�ximo pokemon.");
							System.out.println("[1] " + t2.party[0].name + ", "+ t2.party[0].hitpoints + "/" + t2.party[0].hpmax + " HP.");
							System.out.println("[2] " + t2.party[1].name + ", "+ t2.party[1].hitpoints + "/" + t2.party[1].hpmax + " HP.");
							System.out.println("[3] " + t2.party[2].name + ", "+ t2.party[2].hitpoints + "/" + t2.party[2].hpmax + " HP.");
							System.out.println("[4] " + t2.party[3].name + ", "+ t2.party[3].hitpoints + "/" + t2.party[3].hpmax + " HP.");
							System.out.println("[5] " + t2.party[4].name + ", "+ t2.party[4].hitpoints + "/" + t2.party[4].hpmax + " HP.");
							System.out.println("[6] " + t2.party[5].name + ", "+ t2.party[5].hitpoints + "/" + t2.party[5].hpmax + " HP.");
							int choice = leitura.nextInt();
							while ((choice > 6 || choice < 1) || t2.party[choice-1].hitpoints < 0) { //checar tamb�m se o pokemon esta morto
								if (choice > 6 || choice < 1)
									System.out.println("escolhe um numero direito plmds");
								else
									System.out.println("Este pokemon n�o pode mais batalhar. Escolha outro.");
								choice = leitura.nextInt();
							}
							t2.atual=choice-1;
							System.out.println("Escolheu o pokemon " + t2.party[t2.atual].name + "!");
						}
					}
					else {
						System.out.println(t2.party[t2.atual].name + " usou " + t2.party[t2.atual].a[t2.actions[1]].name + "!");
						int dmg2 = Damage.dano(t2.party[t2.atual].attack, t1.party[t1.atual].defense, t2.party[t2.atual].a[t2.actions[1]].power);
						t1.party[t1.atual].hitpoints -= dmg2;
						System.out.println("Deu " + dmg2 + " de dano!");
						if (t1.party[t1.atual].hitpoints > 0) {
							System.out.println(t1.party[t1.atual].name + " usou " + t1.party[t1.atual].a[t1.actions[1]].name + "!");
							int dmg = Damage.dano(t1.party[t1.atual].attack, t2.party[t2.atual].defense, t1.party[t1.atual].a[t1.actions[1]].power);
							t2.party[t2.atual].hitpoints -= dmg;
							System.out.println("Deu " + dmg + " de dano!");
							if (t2.party[t2.atual].hitpoints < 0) {
								System.out.println(t2.party[t2.atual].name + " fainted!");
								if (t2.party[0].hitpoints <= 0 && t2.party[1].hitpoints <= 0 && t2.party[2].hitpoints <= 0 && t2.party[3].hitpoints <= 0 && t2.party[4].hitpoints <= 0 && t2.party[5].hitpoints <= 0) {
									System.out.println("Todos os pokemon do treinador 2 est�o fora de combate.");
									System.out.println("O vencedor � o treinador 1!");
									return;
								}
								System.out.println("Treinador 2, por favor escolha seu pr�ximo pokemon.");
								System.out.println("[1] " + t2.party[0].name + ", "+ t2.party[0].hitpoints + "/" + t2.party[0].hpmax + " HP.");
								System.out.println("[2] " + t2.party[1].name + ", "+ t2.party[1].hitpoints + "/" + t2.party[1].hpmax + " HP.");
								System.out.println("[3] " + t2.party[2].name + ", "+ t2.party[2].hitpoints + "/" + t2.party[2].hpmax + " HP.");
								System.out.println("[4] " + t2.party[3].name + ", "+ t2.party[3].hitpoints + "/" + t2.party[3].hpmax + " HP.");
								System.out.println("[5] " + t2.party[4].name + ", "+ t2.party[4].hitpoints + "/" + t2.party[4].hpmax + " HP.");
								System.out.println("[6] " + t2.party[5].name + ", "+ t2.party[5].hitpoints + "/" + t2.party[5].hpmax + " HP.");
								int choice = leitura.nextInt();
								while ((choice > 6 || choice < 1) || t2.party[choice-1].hitpoints < 0) { //checar tamb�m se o pokemon esta morto
									if (choice > 6 || choice < 1)
										System.out.println("escolhe um numero direito plmds");
									else
										System.out.println("Este pokemon n�o pode mais batalhar. Escolha outro.");
									choice = leitura.nextInt();
								}
								t2.atual=choice-1;
								System.out.println("Escolheu o pokemon " + t2.party[t2.atual].name + "!");
							}
						}
						else {
							System.out.println(t1.party[t1.atual].name + " fainted!");
							if (t1.party[0].hitpoints <= 0 && t1.party[1].hitpoints <= 0 && t1.party[2].hitpoints <= 0 && t1.party[3].hitpoints <= 0 && t1.party[4].hitpoints <= 0 && t1.party[5].hitpoints <= 0) {
								System.out.println("Todos os pokemon do treinador 1 est�o fora de combate.");
								System.out.println("O vencedor � o treinador 2!");
								return;
							}
							System.out.println("Treinador 1, por favor escolha seu pr�ximo pokemon.");
							System.out.println("[1] " + t1.party[0].name + ", "+ t1.party[0].hitpoints + "/" + t1.party[0].hpmax + " HP.");
							System.out.println("[2] " + t1.party[1].name + ", "+ t1.party[1].hitpoints + "/" + t1.party[1].hpmax + " HP.");
							System.out.println("[3] " + t1.party[2].name + ", "+ t1.party[2].hitpoints + "/" + t1.party[2].hpmax + " HP.");
							System.out.println("[4] " + t1.party[3].name + ", "+ t1.party[3].hitpoints + "/" + t1.party[3].hpmax + " HP.");
							System.out.println("[5] " + t1.party[4].name + ", "+ t1.party[4].hitpoints + "/" + t1.party[4].hpmax + " HP.");
							System.out.println("[6] " + t1.party[5].name + ", "+ t1.party[5].hitpoints + "/" + t1.party[5].hpmax + " HP.");
							int choice = leitura.nextInt();
							while ((choice > 6 || choice < 1) || t1.party[choice-1].hitpoints < 0) { //checar tamb�m se o pokemon esta morto
								if (choice > 6 || choice < 1)
									System.out.println("escolhe um numero direito plmds");
								else
									System.out.println("Este pokemon n�o pode mais batalhar. Escolha outro.");
								choice = leitura.nextInt();
							}
							t1.atual=choice-1;
							System.out.println("Escolheu o pokemon " + t1.party[t1.atual].name + "!");
						}
					}
				}
			}
			
			
			addEvent(new Show());
			addEvent(new Trainer1Choice());
		}
		public String description() {
			return "Fim do turno.";
		}
	}
	
	
	
	private static Scanner leitura;

	public static void main(String[] args) {
		Batalha b = new Batalha();
		leitura = new Scanner(System.in);
		System.out.println("Batalha Pok�mon! 6 vs 6");
		System.out.println("Op��es para escolha:");
		System.out.println("[53]: Persian");
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
				t1.party[i] = newPoke(party[i]);
				System.out.println("Escolheu um " + t1.party[i].name + "!");
			}
			else {
				i--;
				System.out.println("Por favor insira um valor v�lido!");
			}
		}
		System.out.print("Treinador 2, fa�a o mesmo: ");
		for (int i=0; i<6; i++) {
			party[i] = leitura.nextInt();
			if (contains(possiblePokemon, party[i])) {
				t2.party[i] = newPoke(party[i]);
				System.out.println("Escolheu um " + t2.party[i].name + "!");
			}
			else {
				i--;
				System.out.println("Por favor insira um valor v�lido!");
			}
		}
	System.out.println("Que comece a batalha!");
	b.addEvent(b.new Trainer1Choice());
	b.run();
	}
}

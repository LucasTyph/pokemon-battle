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
			System.out.println(trainer1Party[atual1].name + ": Lv. 100, "+ trainer1Party[atual1].hitpoints + "/" + trainer1Party[atual1].hpmax + " HP.");
			System.out.println(trainer2Party[atual2].name + ": Lv. 100, "+ trainer2Party[atual2].hitpoints + "/" + trainer2Party[atual2].hpmax + " HP.");
		}
		public String description() {
			return "Pensem bem nas suas próximas ações, treinadores.";
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
				System.out.println("[1] " + trainer1Party[atual1].a[1].name);
				System.out.println("[2] " + trainer1Party[atual1].a[2].name);
				System.out.println("[3] " + trainer1Party[atual1].a[3].name);
				System.out.println("[4] " + trainer1Party[atual1].a[4].name);
				choice = leitura.nextInt();
				while (choice > 4 || choice < 1) {
					System.out.println("escolhe um atk direito plmds");
					choice = leitura.nextInt();
				}
				actions1[1]=choice;
				break;
			case 2: //troca
				System.out.println("Que pokemon enivar para a batalha?");
				System.out.println("[1] " + trainer1Party[0].name + ", "+ trainer1Party[0].hitpoints + "/" + trainer1Party[0].hpmax + " HP.");
				System.out.println("[2] " + trainer1Party[1].name + ", "+ trainer1Party[1].hitpoints + "/" + trainer1Party[1].hpmax + " HP.");
				System.out.println("[3] " + trainer1Party[2].name + ", "+ trainer1Party[2].hitpoints + "/" + trainer1Party[2].hpmax + " HP.");
				System.out.println("[4] " + trainer1Party[3].name + ", "+ trainer1Party[3].hitpoints + "/" + trainer1Party[3].hpmax + " HP.");
				System.out.println("[5] " + trainer1Party[4].name + ", "+ trainer1Party[4].hitpoints + "/" + trainer1Party[4].hpmax + " HP.");
				System.out.println("[6] " + trainer1Party[5].name + ", "+ trainer1Party[5].hitpoints + "/" + trainer1Party[5].hpmax + " HP.");
				choice = leitura.nextInt();
				while ((choice > 6 || choice < 1) || trainer1Party[choice-1].hitpoints < 0) { //checar também se o pokemon esta morto
					if (choice >6 || choice < 1)
						System.out.println("escolhe um numero direito plmds");
					else
						System.out.println("Este pokemon não pode mais batalhar. Escolha outro.");
					choice = leitura.nextInt();
				}
				atual1=choice-1;
				System.out.println("Escolheu o pokemon " + trainer1Party[atual1].name + "!");
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
				System.out.println("[1] " + trainer2Party[atual2].a[1].name);
				System.out.println("[2] " + trainer2Party[atual2].a[2].name);
				System.out.println("[3] " + trainer2Party[atual2].a[3].name);
				System.out.println("[4] " + trainer2Party[atual2].a[4].name);
				choice = leitura.nextInt();
				while (choice > 4 || choice < 1) {
					System.out.println("escolhe um atk direito plmds2");
					choice = leitura.nextInt();
				}
				actions2[1]=choice;
				break;
			case 2: //troca
				System.out.println("Que pokemon enivar para a batalha?");
				System.out.println("[1] " + trainer2Party[0].name + ", "+ trainer2Party[0].hitpoints + "/" + trainer2Party[0].hpmax + " HP.");
				System.out.println("[2] " + trainer2Party[1].name + ", "+ trainer2Party[1].hitpoints + "/" + trainer2Party[1].hpmax + " HP.");
				System.out.println("[3] " + trainer2Party[2].name + ", "+ trainer2Party[2].hitpoints + "/" + trainer2Party[2].hpmax + " HP.");
				System.out.println("[4] " + trainer2Party[3].name + ", "+ trainer2Party[3].hitpoints + "/" + trainer2Party[3].hpmax + " HP.");
				System.out.println("[5] " + trainer2Party[4].name + ", "+ trainer2Party[4].hitpoints + "/" + trainer2Party[4].hpmax + " HP.");
				System.out.println("[6] " + trainer2Party[5].name + ", "+ trainer2Party[5].hitpoints + "/" + trainer2Party[5].hpmax + " HP.");
				choice = leitura.nextInt();
				while ((choice > 6 || choice < 1) || trainer2Party[choice-1].hitpoints < 0) { //checar também se o pokemon esta morto
					if (choice > 6 || choice < 1)
						System.out.println("escolhe um numero direito plmds");
					else
						System.out.println("Este pokemon não pode mais batalhar. Escolha outro.");
					choice = leitura.nextInt();
				}
				atual2=choice-1;
				System.out.println("Escolheu o pokemon " + trainer2Party[atual2].name + "!");
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
	
	public class solveTurn extends Event{
		public solveTurn() {}
		public void action() {
			if (actions1[0] == 3){		//cura
				if ((trainer1Party[atual1].hitpoints+200) > trainer1Party[atual1].hpmax) {
					System.out.println("Treinador 1 curou seu " + trainer1Party[atual1].name + "para full HP.");
					trainer1Party[atual1].hitpoints = trainer1Party[atual1].hpmax;
				}
				else {
					System.out.println("Treinador 1 curou 200HP de seu " + trainer1Party[atual1].name);
					(trainer1Party[atual1].hitpoints)+=200;
				}
			}
			if (actions2[0] == 3){		//cura
				if ((trainer2Party[atual2].hitpoints+200) > trainer2Party[atual2].hpmax) {
					System.out.println("Treinador 2 curou seu " + trainer2Party[atual2].name + "para full HP.");
					trainer2Party[atual2].hitpoints = trainer2Party[atual2].hpmax;
				}
				else {
					System.out.println("Treinador 2 curou 200HP de seu " + trainer2Party[atual2].name);
					(trainer2Party[atual2].hitpoints)+=200;
				}
			}
			if (actions1[0] == 2) {
				System.out.println("Treinador 1 trocou para o pokemon "+ trainer1Party[atual1].name);
			}
			if (actions2[0] == 2) {
				System.out.println("Treinador 2 trocou para o pokemon "+ trainer2Party[atual2].name);
			}
			
			
			if (actions1[0] == 1 && actions2[0] != 1) {
				System.out.println(trainer1Party[atual1].name + " usou " + trainer1Party[atual1].a[actions1[1]].name + "!");
				int dmg = Damage.dano(trainer1Party[atual1].attack, trainer2Party[atual2].defense, trainer1Party[atual1].a[actions1[1]].power);
				trainer2Party[atual2].hitpoints -= dmg;
				System.out.println("Deu " + dmg + " de dano!");
				if (trainer2Party[atual2].hitpoints <= 0) {
					System.out.println(trainer2Party[atual2].name + " fainted!");
					if (trainer2Party[0].hitpoints <= 0 && trainer2Party[1].hitpoints <= 0 && trainer2Party[2].hitpoints <= 0 && trainer2Party[3].hitpoints <= 0 && trainer2Party[4].hitpoints <= 0 && trainer2Party[5].hitpoints <= 0) {
						System.out.println("Todos os pokemon do treinador 2 estão fora de combate.");
						System.out.println("O vencedor é o treinador 1!");
						return;
					}
					System.out.println("Treinador 2, por favor escolha seu próximo pokemon.");
					System.out.println("[1] " + trainer2Party[0].name + ", "+ trainer2Party[0].hitpoints + "/" + trainer2Party[0].hpmax + " HP.");
					System.out.println("[2] " + trainer2Party[1].name + ", "+ trainer2Party[1].hitpoints + "/" + trainer2Party[1].hpmax + " HP.");
					System.out.println("[3] " + trainer2Party[2].name + ", "+ trainer2Party[2].hitpoints + "/" + trainer2Party[2].hpmax + " HP.");
					System.out.println("[4] " + trainer2Party[3].name + ", "+ trainer2Party[3].hitpoints + "/" + trainer2Party[3].hpmax + " HP.");
					System.out.println("[5] " + trainer2Party[4].name + ", "+ trainer2Party[4].hitpoints + "/" + trainer2Party[4].hpmax + " HP.");
					System.out.println("[6] " + trainer2Party[5].name + ", "+ trainer2Party[5].hitpoints + "/" + trainer2Party[5].hpmax + " HP.");
					int choice = leitura.nextInt();
					while ((choice > 6 || choice < 1) || trainer2Party[choice-1].hitpoints < 0) { //checar também se o pokemon esta morto
						if (choice > 6 || choice < 1)
							System.out.println("escolhe um numero direito plmds");
						else
							System.out.println("Este pokemon não pode mais batalhar. Escolha outro.");
						choice = leitura.nextInt();
					}
					atual2=choice-1;
					System.out.println("Escolheu o pokemon " + trainer2Party[atual2].name + "!");
				}
			}
			if (actions2[0] == 1 && actions1[0] != 1) {
				System.out.println(trainer2Party[atual2].name + " usou " + trainer2Party[atual2].a[actions2[1]].name + "!");
				int dmg = Damage.dano(trainer2Party[atual2].attack, trainer1Party[atual1].defense, trainer2Party[atual2].a[actions2[1]].power);
				trainer1Party[atual1].hitpoints -= dmg;
				System.out.println("Deu " + dmg + " de dano!");
				if (trainer1Party[atual1].hitpoints <= 0) {
					System.out.println(trainer1Party[atual1].name + " fainted!");
					if (trainer1Party[0].hitpoints <= 0 && trainer1Party[1].hitpoints <= 0 && trainer1Party[2].hitpoints <= 0 && trainer1Party[3].hitpoints <= 0 && trainer1Party[4].hitpoints <= 0 && trainer1Party[5].hitpoints <= 0) {
						System.out.println("Todos os pokemon do treinador 1 estão fora de combate.");
						System.out.println("O vencedor é o treinador 2!");
						return;
					}
					System.out.println("Treinador 1, por favor escolha seu próximo pokemon.");
					System.out.println("[1] " + trainer1Party[0].name + ", "+ trainer1Party[0].hitpoints + "/" + trainer1Party[0].hpmax + " HP.");
					System.out.println("[2] " + trainer1Party[1].name + ", "+ trainer1Party[1].hitpoints + "/" + trainer1Party[1].hpmax + " HP.");
					System.out.println("[3] " + trainer1Party[2].name + ", "+ trainer1Party[2].hitpoints + "/" + trainer1Party[2].hpmax + " HP.");
					System.out.println("[4] " + trainer1Party[3].name + ", "+ trainer1Party[3].hitpoints + "/" + trainer1Party[3].hpmax + " HP.");
					System.out.println("[5] " + trainer1Party[4].name + ", "+ trainer1Party[4].hitpoints + "/" + trainer1Party[4].hpmax + " HP.");
					System.out.println("[6] " + trainer1Party[5].name + ", "+ trainer1Party[5].hitpoints + "/" + trainer1Party[5].hpmax + " HP.");
					int choice = leitura.nextInt();
					while ((choice > 6 || choice < 1) || trainer1Party[choice-1].hitpoints < 0) { //checar também se o pokemon esta morto
						if (choice > 6 || choice < 1)
							System.out.println("escolhe um numero direito plmds");
						else
							System.out.println("Este pokemon não pode mais batalhar. Escolha outro.");
						choice = leitura.nextInt();
					}
					atual1=choice-1;
					System.out.println("Escolheu o pokemon " + trainer1Party[atual1].name + "!");
				}
			}
			if (actions1[0] == 1 && actions2[0] == 1) {
				if (trainer1Party[atual1].a[actions1[1]].priority > trainer2Party[atual2].a[actions2[1]].priority) {
					System.out.println(trainer1Party[atual1].name + " usou " + trainer1Party[atual1].a[actions1[1]].name + "!");
					int dmg = Damage.dano(trainer1Party[atual1].attack, trainer2Party[atual2].defense, trainer1Party[atual1].a[actions1[1]].power);
					trainer2Party[atual2].hitpoints -= dmg;
					System.out.println("Deu " + dmg + " de dano!");
					if (trainer2Party[atual2].hitpoints > 0) {
						System.out.println(trainer2Party[atual2].name + " usou " + trainer2Party[atual2].a[actions2[1]].name + "!");
						int dmg2 = Damage.dano(trainer2Party[atual2].attack, trainer1Party[atual1].defense, trainer2Party[atual2].a[actions2[1]].power);
						trainer1Party[atual1].hitpoints -= dmg2;
						System.out.println("Deu " + dmg2 + " de dano!");
						if (trainer1Party[atual1].hitpoints <= 0) {
							System.out.println(trainer1Party[atual1].name + " fainted!");
							if (trainer1Party[0].hitpoints <= 0 && trainer1Party[1].hitpoints <= 0 && trainer1Party[2].hitpoints <= 0 && trainer1Party[3].hitpoints <= 0 && trainer1Party[4].hitpoints <= 0 && trainer1Party[5].hitpoints <= 0) {
								System.out.println("Todos os pokemon do treinador 1 estão fora de combate.");
								System.out.println("O vencedor é o treinador 2!");
								return;
							}
							System.out.println("Treinador 1, por favor escolha seu próximo pokemon.");
							System.out.println("[1] " + trainer1Party[0].name + ", "+ trainer1Party[0].hitpoints + "/" + trainer1Party[0].hpmax + " HP.");
							System.out.println("[2] " + trainer1Party[1].name + ", "+ trainer1Party[1].hitpoints + "/" + trainer1Party[1].hpmax + " HP.");
							System.out.println("[3] " + trainer1Party[2].name + ", "+ trainer1Party[2].hitpoints + "/" + trainer1Party[2].hpmax + " HP.");
							System.out.println("[4] " + trainer1Party[3].name + ", "+ trainer1Party[3].hitpoints + "/" + trainer1Party[3].hpmax + " HP.");
							System.out.println("[5] " + trainer1Party[4].name + ", "+ trainer1Party[4].hitpoints + "/" + trainer1Party[4].hpmax + " HP.");
							System.out.println("[6] " + trainer1Party[5].name + ", "+ trainer1Party[5].hitpoints + "/" + trainer1Party[5].hpmax + " HP.");
							int choice = leitura.nextInt();
							while ((choice > 6 || choice < 1) || trainer1Party[choice-1].hitpoints < 0) { //checar também se o pokemon esta morto
								if (choice > 6 || choice < 1)
									System.out.println("escolhe um numero direito plmds");
								else
									System.out.println("Este pokemon não pode mais batalhar. Escolha outro.");
								choice = leitura.nextInt();
							}
							atual1=choice-1;
							System.out.println("Escolheu o pokemon " + trainer1Party[atual1].name + "!");
						}
					}
					else {
						System.out.println(trainer2Party[atual2].name + " fainted!");
						if (trainer2Party[0].hitpoints <= 0 && trainer2Party[1].hitpoints <= 0 && trainer2Party[2].hitpoints <= 0 && trainer2Party[3].hitpoints <= 0 && trainer2Party[4].hitpoints <= 0 && trainer2Party[5].hitpoints <= 0) {
							System.out.println("Todos os pokemon do treinador 2 estão fora de combate.");
							System.out.println("O vencedor é o treinador 1!");
							return;
						}
						System.out.println("Treinador 2, por favor escolha seu próximo pokemon.");
						System.out.println("[1] " + trainer2Party[0].name + ", "+ trainer2Party[0].hitpoints + "/" + trainer2Party[0].hpmax + " HP.");
						System.out.println("[2] " + trainer2Party[1].name + ", "+ trainer2Party[1].hitpoints + "/" + trainer2Party[1].hpmax + " HP.");
						System.out.println("[3] " + trainer2Party[2].name + ", "+ trainer2Party[2].hitpoints + "/" + trainer2Party[2].hpmax + " HP.");
						System.out.println("[4] " + trainer2Party[3].name + ", "+ trainer2Party[3].hitpoints + "/" + trainer2Party[3].hpmax + " HP.");
						System.out.println("[5] " + trainer2Party[4].name + ", "+ trainer2Party[4].hitpoints + "/" + trainer2Party[4].hpmax + " HP.");
						System.out.println("[6] " + trainer2Party[5].name + ", "+ trainer2Party[5].hitpoints + "/" + trainer2Party[5].hpmax + " HP.");
						int choice = leitura.nextInt();
						while ((choice > 6 || choice < 1) || trainer2Party[choice-1].hitpoints < 0) { //checar também se o pokemon esta morto
							if (choice > 6 || choice < 1)
								System.out.println("escolhe um numero direito plmds");
							else
								System.out.println("Este pokemon não pode mais batalhar. Escolha outro.");
							choice = leitura.nextInt();
						}
						atual2=choice-1;
						System.out.println("Escolheu o pokemon " + trainer2Party[atual2].name + "!");
					}
				}
				else if (trainer1Party[atual1].a[actions1[1]].priority < trainer2Party[atual2].a[actions2[1]].priority) {
					System.out.println(trainer2Party[atual2].name + " usou " + trainer2Party[atual2].a[actions2[1]].name + "!");
					int dmg2 = Damage.dano(trainer2Party[atual2].attack, trainer1Party[atual1].defense, trainer2Party[atual2].a[actions2[1]].power);
					trainer1Party[atual1].hitpoints -= dmg2;
					System.out.println("Deu " + dmg2 + " de dano!");
					if (trainer1Party[atual1].hitpoints > 0) {
						System.out.println(trainer1Party[atual1].name + " usou " + trainer1Party[atual1].a[actions1[1]].name + "!");
						int dmg = Damage.dano(trainer1Party[atual1].attack, trainer2Party[atual2].defense, trainer1Party[atual1].a[actions1[1]].power);
						trainer2Party[atual2].hitpoints -= dmg;
						System.out.println("Deu " + dmg + " de dano!");
						if (trainer2Party[atual2].hitpoints <= 0) {
							System.out.println(trainer2Party[atual2].name + " fainted!");
							if (trainer2Party[0].hitpoints <= 0 && trainer2Party[1].hitpoints <= 0 && trainer2Party[2].hitpoints <= 0 && trainer2Party[3].hitpoints <= 0 && trainer2Party[4].hitpoints <= 0 && trainer2Party[5].hitpoints <= 0) {
								System.out.println("Todos os pokemon do treinador 2 estão fora de combate.");
								System.out.println("O vencedor é o treinador 1!");
								return;
							}
							System.out.println("Treinador 2, por favor escolha seu próximo pokemon.");
							System.out.println("[1] " + trainer2Party[0].name + ", "+ trainer2Party[0].hitpoints + "/" + trainer2Party[0].hpmax + " HP.");
							System.out.println("[2] " + trainer2Party[1].name + ", "+ trainer2Party[1].hitpoints + "/" + trainer2Party[1].hpmax + " HP.");
							System.out.println("[3] " + trainer2Party[2].name + ", "+ trainer2Party[2].hitpoints + "/" + trainer2Party[2].hpmax + " HP.");
							System.out.println("[4] " + trainer2Party[3].name + ", "+ trainer2Party[3].hitpoints + "/" + trainer2Party[3].hpmax + " HP.");
							System.out.println("[5] " + trainer2Party[4].name + ", "+ trainer2Party[4].hitpoints + "/" + trainer2Party[4].hpmax + " HP.");
							System.out.println("[6] " + trainer2Party[5].name + ", "+ trainer2Party[5].hitpoints + "/" + trainer2Party[5].hpmax + " HP.");
							int choice = leitura.nextInt();
							while ((choice > 6 || choice < 1) || trainer2Party[choice-1].hitpoints < 0) { //checar também se o pokemon esta morto
								if (choice > 6 || choice < 1)
									System.out.println("escolhe um numero direito plmds");
								else
									System.out.println("Este pokemon não pode mais batalhar. Escolha outro.");
								choice = leitura.nextInt();
							}
							atual2=choice-1;
							System.out.println("Escolheu o pokemon " + trainer2Party[atual2].name + "!");
						}
					}
					else {
						System.out.println(trainer1Party[atual1].name + " fainted!");
						if (trainer1Party[0].hitpoints <= 0 && trainer1Party[1].hitpoints <= 0 && trainer1Party[2].hitpoints <= 0 && trainer1Party[3].hitpoints <= 0 && trainer1Party[4].hitpoints <= 0 && trainer1Party[5].hitpoints <= 0) {
							System.out.println("Todos os pokemon do treinador 1 estão fora de combate.");
							System.out.println("O vencedor é o treinador 2!");
							return;
						}
						System.out.println("Treinador 1, por favor escolha seu próximo pokemon.");
						System.out.println("[1] " + trainer1Party[0].name + ", "+ trainer1Party[0].hitpoints + "/" + trainer1Party[0].hpmax + " HP.");
						System.out.println("[2] " + trainer1Party[1].name + ", "+ trainer1Party[1].hitpoints + "/" + trainer1Party[1].hpmax + " HP.");
						System.out.println("[3] " + trainer1Party[2].name + ", "+ trainer1Party[2].hitpoints + "/" + trainer1Party[2].hpmax + " HP.");
						System.out.println("[4] " + trainer1Party[3].name + ", "+ trainer1Party[3].hitpoints + "/" + trainer1Party[3].hpmax + " HP.");
						System.out.println("[5] " + trainer1Party[4].name + ", "+ trainer1Party[4].hitpoints + "/" + trainer1Party[4].hpmax + " HP.");
						System.out.println("[6] " + trainer1Party[5].name + ", "+ trainer1Party[5].hitpoints + "/" + trainer1Party[5].hpmax + " HP.");
						int choice = leitura.nextInt();
						while ((choice > 6 || choice < 1) || trainer1Party[choice-1].hitpoints < 0) { //checar também se o pokemon esta morto
							if (choice > 6 || choice < 1)
								System.out.println("escolhe um numero direito plmds");
							else
								System.out.println("Este pokemon não pode mais batalhar. Escolha outro.");
							choice = leitura.nextInt();
						}
						atual1=choice-1;
						System.out.println("Escolheu o pokemon " + trainer1Party[atual1].name + "!");
					}
				}
				else {
					if (trainer1Party[atual1].speed > trainer2Party[atual2].speed) {
						System.out.println(trainer1Party[atual1].name + " usou " + trainer1Party[atual1].a[actions1[1]].name + "!");
						int dmg = Damage.dano(trainer1Party[atual1].attack, trainer2Party[atual2].defense, trainer1Party[atual1].a[actions1[1]].power);
						trainer2Party[atual2].hitpoints -= dmg;
						System.out.println("Deu " + dmg + " de dano!");
						if (trainer2Party[atual2].hitpoints > 0) {
							System.out.println(trainer2Party[atual2].name + " usou " + trainer2Party[atual2].a[actions2[1]].name + "!");
							int dmg2 = Damage.dano(trainer2Party[atual2].attack, trainer1Party[atual1].defense, trainer2Party[atual2].a[actions2[1]].power);
							trainer1Party[atual1].hitpoints -= dmg2;
							System.out.println("Deu " + dmg2 + " de dano!");
							if (trainer1Party[atual1].hitpoints <= 0) {
								System.out.println(trainer1Party[atual1].name + " fainted!");
								if (trainer1Party[0].hitpoints <= 0 && trainer1Party[1].hitpoints <= 0 && trainer1Party[2].hitpoints <= 0 && trainer1Party[3].hitpoints <= 0 && trainer1Party[4].hitpoints <= 0 && trainer1Party[5].hitpoints <= 0) {
									System.out.println("Todos os pokemon do treinador 1 estão fora de combate.");
									System.out.println("O vencedor é o treinador 2!");
									return;
								}
								System.out.println("Treinador 1, por favor escolha seu próximo pokemon.");
								System.out.println("[1] " + trainer1Party[0].name + ", "+ trainer1Party[0].hitpoints + "/" + trainer1Party[0].hpmax + " HP.");
								System.out.println("[2] " + trainer1Party[1].name + ", "+ trainer1Party[1].hitpoints + "/" + trainer1Party[1].hpmax + " HP.");
								System.out.println("[3] " + trainer1Party[2].name + ", "+ trainer1Party[2].hitpoints + "/" + trainer1Party[2].hpmax + " HP.");
								System.out.println("[4] " + trainer1Party[3].name + ", "+ trainer1Party[3].hitpoints + "/" + trainer1Party[3].hpmax + " HP.");
								System.out.println("[5] " + trainer1Party[4].name + ", "+ trainer1Party[4].hitpoints + "/" + trainer1Party[4].hpmax + " HP.");
								System.out.println("[6] " + trainer1Party[5].name + ", "+ trainer1Party[5].hitpoints + "/" + trainer1Party[5].hpmax + " HP.");
								int choice = leitura.nextInt();
								while ((choice > 6 || choice < 1) || trainer1Party[choice-1].hitpoints < 0) { //checar também se o pokemon esta morto
									if (choice > 6 || choice < 1)
										System.out.println("escolhe um numero direito plmds");
									else
										System.out.println("Este pokemon não pode mais batalhar. Escolha outro.");
									choice = leitura.nextInt();
								}
								atual1=choice-1;
								System.out.println("Escolheu o pokemon " + trainer1Party[atual1].name + "!");
							}
						}
						else {
							System.out.println(trainer2Party[atual2].name + " fainted!");
							if (trainer2Party[0].hitpoints <= 0 && trainer2Party[1].hitpoints <= 0 && trainer2Party[2].hitpoints <= 0 && trainer2Party[3].hitpoints <= 0 && trainer2Party[4].hitpoints <= 0 && trainer2Party[5].hitpoints <= 0) {
								System.out.println("Todos os pokemon do treinador 2 estão fora de combate.");
								System.out.println("O vencedor é o treinador 1!");
								return;
							}
							System.out.println("Treinador 2, por favor escolha seu próximo pokemon.");
							System.out.println("[1] " + trainer2Party[0].name + ", "+ trainer2Party[0].hitpoints + "/" + trainer2Party[0].hpmax + " HP.");
							System.out.println("[2] " + trainer2Party[1].name + ", "+ trainer2Party[1].hitpoints + "/" + trainer2Party[1].hpmax + " HP.");
							System.out.println("[3] " + trainer2Party[2].name + ", "+ trainer2Party[2].hitpoints + "/" + trainer2Party[2].hpmax + " HP.");
							System.out.println("[4] " + trainer2Party[3].name + ", "+ trainer2Party[3].hitpoints + "/" + trainer2Party[3].hpmax + " HP.");
							System.out.println("[5] " + trainer2Party[4].name + ", "+ trainer2Party[4].hitpoints + "/" + trainer2Party[4].hpmax + " HP.");
							System.out.println("[6] " + trainer2Party[5].name + ", "+ trainer2Party[5].hitpoints + "/" + trainer2Party[5].hpmax + " HP.");
							int choice = leitura.nextInt();
							while ((choice > 6 || choice < 1) || trainer2Party[choice-1].hitpoints < 0) { //checar também se o pokemon esta morto
								if (choice > 6 || choice < 1)
									System.out.println("escolhe um numero direito plmds");
								else
									System.out.println("Este pokemon não pode mais batalhar. Escolha outro.");
								choice = leitura.nextInt();
							}
							atual2=choice-1;
							System.out.println("Escolheu o pokemon " + trainer2Party[atual2].name + "!");
						}
					}
					else {
						System.out.println(trainer2Party[atual2].name + " usou " + trainer2Party[atual2].a[actions2[1]].name + "!");
						int dmg2 = Damage.dano(trainer2Party[atual2].attack, trainer1Party[atual1].defense, trainer2Party[atual2].a[actions2[1]].power);
						trainer1Party[atual1].hitpoints -= dmg2;
						System.out.println("Deu " + dmg2 + " de dano!");
						if (trainer1Party[atual1].hitpoints > 0) {
							System.out.println(trainer1Party[atual1].name + " usou " + trainer1Party[atual1].a[actions1[1]].name + "!");
							int dmg = Damage.dano(trainer1Party[atual1].attack, trainer2Party[atual2].defense, trainer1Party[atual1].a[actions1[1]].power);
							trainer2Party[atual2].hitpoints -= dmg;
							System.out.println("Deu " + dmg + " de dano!");
							if (trainer2Party[atual2].hitpoints < 0) {
								System.out.println(trainer2Party[atual2].name + " fainted!");
								if (trainer2Party[0].hitpoints <= 0 && trainer2Party[1].hitpoints <= 0 && trainer2Party[2].hitpoints <= 0 && trainer2Party[3].hitpoints <= 0 && trainer2Party[4].hitpoints <= 0 && trainer2Party[5].hitpoints <= 0) {
									System.out.println("Todos os pokemon do treinador 2 estão fora de combate.");
									System.out.println("O vencedor é o treinador 1!");
									return;
								}
								System.out.println("Treinador 2, por favor escolha seu próximo pokemon.");
								System.out.println("[1] " + trainer2Party[0].name + ", "+ trainer2Party[0].hitpoints + "/" + trainer2Party[0].hpmax + " HP.");
								System.out.println("[2] " + trainer2Party[1].name + ", "+ trainer2Party[1].hitpoints + "/" + trainer2Party[1].hpmax + " HP.");
								System.out.println("[3] " + trainer2Party[2].name + ", "+ trainer2Party[2].hitpoints + "/" + trainer2Party[2].hpmax + " HP.");
								System.out.println("[4] " + trainer2Party[3].name + ", "+ trainer2Party[3].hitpoints + "/" + trainer2Party[3].hpmax + " HP.");
								System.out.println("[5] " + trainer2Party[4].name + ", "+ trainer2Party[4].hitpoints + "/" + trainer2Party[4].hpmax + " HP.");
								System.out.println("[6] " + trainer2Party[5].name + ", "+ trainer2Party[5].hitpoints + "/" + trainer2Party[5].hpmax + " HP.");
								int choice = leitura.nextInt();
								while ((choice > 6 || choice < 1) || trainer2Party[choice-1].hitpoints < 0) { //checar também se o pokemon esta morto
									if (choice > 6 || choice < 1)
										System.out.println("escolhe um numero direito plmds");
									else
										System.out.println("Este pokemon não pode mais batalhar. Escolha outro.");
									choice = leitura.nextInt();
								}
								atual2=choice-1;
								System.out.println("Escolheu o pokemon " + trainer2Party[atual2].name + "!");
							}
						}
						else {
							System.out.println(trainer1Party[atual1].name + " fainted!");
							if (trainer1Party[0].hitpoints <= 0 && trainer1Party[1].hitpoints <= 0 && trainer1Party[2].hitpoints <= 0 && trainer1Party[3].hitpoints <= 0 && trainer1Party[4].hitpoints <= 0 && trainer1Party[5].hitpoints <= 0) {
								System.out.println("Todos os pokemon do treinador 1 estão fora de combate.");
								System.out.println("O vencedor é o treinador 2!");
								return;
							}
							System.out.println("Treinador 1, por favor escolha seu próximo pokemon.");
							System.out.println("[1] " + trainer1Party[0].name + ", "+ trainer1Party[0].hitpoints + "/" + trainer1Party[0].hpmax + " HP.");
							System.out.println("[2] " + trainer1Party[1].name + ", "+ trainer1Party[1].hitpoints + "/" + trainer1Party[1].hpmax + " HP.");
							System.out.println("[3] " + trainer1Party[2].name + ", "+ trainer1Party[2].hitpoints + "/" + trainer1Party[2].hpmax + " HP.");
							System.out.println("[4] " + trainer1Party[3].name + ", "+ trainer1Party[3].hitpoints + "/" + trainer1Party[3].hpmax + " HP.");
							System.out.println("[5] " + trainer1Party[4].name + ", "+ trainer1Party[4].hitpoints + "/" + trainer1Party[4].hpmax + " HP.");
							System.out.println("[6] " + trainer1Party[5].name + ", "+ trainer1Party[5].hitpoints + "/" + trainer1Party[5].hpmax + " HP.");
							int choice = leitura.nextInt();
							while ((choice > 6 || choice < 1) || trainer1Party[choice-1].hitpoints < 0) { //checar também se o pokemon esta morto
								if (choice > 6 || choice < 1)
									System.out.println("escolhe um numero direito plmds");
								else
									System.out.println("Este pokemon não pode mais batalhar. Escolha outro.");
								choice = leitura.nextInt();
							}
							atual1=choice-1;
							System.out.println("Escolheu o pokemon " + trainer1Party[atual1].name + "!");
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
		System.out.println("Batalha Pokémon! 6 vs 6");
		System.out.println("Opções para escolha:");
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
				trainer1Party[i] = newPoke(party[i]);
				System.out.println("Escolheu um " + trainer1Party[i].name + "!");
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
				System.out.println("Escolheu um " + trainer2Party[i].name + "!");
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

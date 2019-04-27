package what;

import java.util.Scanner;

public class Batalha extends Controller {
	private static int trainer1Party[] = new int[6];
	private static int trainer2Party[] = new int[6];
	private static int possiblePokemon[] = {65, 76, 91, 94, 103, 113, 124, 135, 144, 149};
	

	
	
	
	
	
	
	private static Scanner leitura;

	public static void main(String[] args) {
		leitura = new Scanner(System.in);
		System.out.println("Batalha Pokémon! 6 vs 6");
		System.out.println("Opções para escolha:");
		System.out.println("[65]: Alakazam");
		System.out.println("[76]: Golem");
		System.out.println("[91]: Cloyster");
		System.out.println("[94]: Gengar");
		System.out.println("[103]: Exeggutor");
		System.out.println("[113]: Chansey");
		System.out.println("[124]: Jynx");
		System.out.println("[135]: Jolteon");
		System.out.println("[144]: Articuno");
		System.out.println("[149]: Dragonite");
		System.out.println("[]: ");
		System.out.print("Treinador 1, escolha seus 6 Pokemon pelo numero da Pokedex: ");
		for (int i=0; i<6; i++) {
			trainer1Party[i] = leitura.nextInt();
			System.out.println("number " + trainer1Party[i]);
		}
		System.out.print("Treinador 2, faça o mesmo: ");
		for (int i=0; i<6; i++) {
			trainer2Party[i] = leitura.nextInt();
			System.out.println("number " + trainer2Party[i]);
		}
	}
}

package pokemonpack;

public class Damage {
	static int dano (int atk, int def, int pwr) {
		double random = Math.random()*(0.15)+0.85;
		return (int)(((42*pwr*atk/50/def)+2)*random);
	}
}

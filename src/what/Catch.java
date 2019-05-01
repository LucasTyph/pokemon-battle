package what;

import pokemonpack.*;

public class Catch {
	public static int odds(Pokemon target, int catchRate) {
		int valor = (3*target.hpmax - 2*target.hitpoints)*catchRate/(3*target.hpmax);
		if (valor > 255) {
			return 255;
		}
		else return valor;
	}
}

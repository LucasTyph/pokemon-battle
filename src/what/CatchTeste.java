package what;

import java.util.Random;
import pokemonpack.*;

public class CatchTeste {
	private static Random r = new Random();
	public static void main(String[] args) {
		Pokemon x = new Zapdos145();
		int y = 255;
		System.out.println(r.nextInt(256) + " -- " + Catch.odds(x, y));
		System.out.println(r.nextInt(256) + " -- " + Catch.odds(x, y));
		System.out.println(r.nextInt(256) + " -- " + Catch.odds(x, y));
		System.out.println(r.nextInt(256) + " -- " + Catch.odds(x, y));
		x.hitpoints=0;
		System.out.println(r.nextInt(256) + " -- " + Catch.odds(x, y));
		System.out.println(r.nextInt(256) + " -- " + Catch.odds(x, y));
		System.out.println(r.nextInt(256) + " -- " + Catch.odds(x, y));
		System.out.println(r.nextInt(256) + " -- " + Catch.odds(x, y));
	}
}

package pokemonpack;

public class Exeggutor103 extends Pokemon implements Tipos{
	public Exeggutor103() {
		super(grass, psychic, 394, 317, 295, 229, 103, "Exeggutor");
		a[1] = new HyperBeam();
		a[2] = new Psychic();
		a[3] = new EggBomb();
		a[4] = new SolarBeam();
	}
}
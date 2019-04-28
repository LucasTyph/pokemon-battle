package pokemonpack;

public class Exeggutor103 extends Pokemon {
	public Exeggutor103() {
		super(394, 317, 295, 229, 103, "Exeggutor");
		Attack a[] = new Attack[5];
		a[1] = new HyperBeam();
		a[2] = new Psychic();
		a[3] = new EggBomb();
		a[4] = new SolarBeam();
	}
}
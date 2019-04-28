package pokemonpack;

public class Tauros128 extends Pokemon{
	public Tauros128() {
		super(354, 328, 317, 350, 128, "Tauros");
		a[1] = new Earthquake();
		a[2] = new RockSlide();
		a[3] = new DoubleEdge();
		a[4] = new SkullBash();
	}
}
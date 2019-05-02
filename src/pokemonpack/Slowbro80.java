package pokemonpack;

public class Slowbro80 extends Pokemon implements Tipos{
	public Slowbro80() {
		super(water, 394, 273, 350, 174, 80, "Slowbro");
		a[1] = new Surf();
		a[2] = new Psychic();
		a[3] = new HyperBeam();
		a[4] = new IceBeam();
	}
}

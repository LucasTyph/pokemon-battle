package pokemonpack;

public class Starmie121 extends Pokemon implements Tipos{
	public Starmie121() {
		super(water, psychic, 324, 273, 295, 361, 121, "Starmie");
		a[1] = new IceBeam();
		a[2] = new Psywave();
		a[3] = new HydroPump();
		a[4] = new TakeDown();
	}
}

package pokemonpack;

public class Starmie121 extends Pokemon{
	public Starmie121() {
		super(324, 273, 295, 361, 121, "Starmie");
		Attack a[] = new Attack[5];
		a[1] = new IceBeam();
		a[2] = new TakeDown();
		a[3] = new HydroPump();
		a[4] = new Psywave();
	}
}

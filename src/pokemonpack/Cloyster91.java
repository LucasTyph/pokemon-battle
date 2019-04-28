package pokemonpack;

public class Cloyster91 extends Pokemon{
	public Cloyster91(){
		super(304, 317, 504, 262, 91, "Cloyster");
		Attack a[] = new Attack[5];
		a[1] = new HyperBeam();
		a[2] = new SpikeCannon();
		a[3] = new Surf();
		a[4] = new IceBeam();
	}
}
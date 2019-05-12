package pokemonpack;

public class Cloyster91 extends Pokemon implements Tipos{
	public Cloyster91(){
		super(water, ice, 304, 317, 504, 262, 91, "Cloyster");
		a[1] = new HyperBeam();
		a[2] = new SpikeCannon();
		a[3] = new Surf();
		a[4] = new IceBeam();
	}
}
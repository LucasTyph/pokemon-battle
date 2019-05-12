package pokemonpack;

public class Lapras131 extends Pokemon implements Tipos{
	public Lapras131() {
		super(water, ice, 464, 295, 284, 240, 131, "Lapras");
		a[1] = new HydroPump();
		a[2] = new IceBeam();
		a[3] = new Surf();
		a[4] = new BodySlam();
	}
}

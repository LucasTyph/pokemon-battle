package pokemonpack;

public class Lapras131 extends Pokemon{
	public Lapras131() {
		super(464, 295, 284, 240, 131, "Lapras");
		Attack a[] = new Attack[5];
		a[1] = new HydroPump();
		a[2] = new IceBeam();
		a[3] = new Surf();
		a[4] = new BodySlam();
	}
}

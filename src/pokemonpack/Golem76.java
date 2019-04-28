package pokemonpack;

public class Golem76 extends Pokemon {
	public Golem76() {
		super (364, 350, 394, 207, 76, "Golem");
		Attack a[] = new Attack[5];
		a[1] = new HyperBeam();
		a[2] = new Earthquake();
		a[3] = new DoubleEdge();
		a[4] = new RockSlide();
	}
}
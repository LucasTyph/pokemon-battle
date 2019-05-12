package pokemonpack;

public class Golem76 extends Pokemon implements Tipos{
	public Golem76() {
		super (rock, ground, 364, 350, 394, 207, 76, "Golem");
		a[1] = new HyperBeam();
		a[2] = new Earthquake();
		a[3] = new DoubleEdge();
		a[4] = new RockSlide();
	}
}
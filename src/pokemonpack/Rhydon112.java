package pokemonpack;

public class Rhydon112 extends Pokemon implements Tipos{
	public Rhydon112() {
		super(ground, 414, 394, 372, 196, 112, "Rhydon");
		a[1] = new RockSlide();
		a[2] = new Earthquake();
		a[3] = new BodySlam();
		a[4] = new Megahorn();
	}
}

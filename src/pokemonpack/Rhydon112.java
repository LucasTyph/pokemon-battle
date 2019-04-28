package pokemonpack;

public class Rhydon112 extends Pokemon{
	public Rhydon112() {
		super(414, 394, 372, 196, 112, "Rhydon");
		Attack a[] = new Attack[5];
		a[1] = new RockSlide();
		a[2] = new Earthquake();
		a[3] = new BodySlam();
		a[4] = new Megahorn();
	}
}

package pokemonpack;

public class Gengar94 extends Pokemon {
	public Gengar94() {
		super (324, 251, 240, 350, 94, "Gengar");
		Attack a[] = new Attack[5];
		a[1] = new HyperBeam();
		a[2] = new Thunderbolt();
		a[3] = new ShadowBall();
		a[4] = new DreamEater();
	}
}

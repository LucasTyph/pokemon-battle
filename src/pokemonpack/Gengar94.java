package pokemonpack;

public class Gengar94 extends Pokemon implements Tipos{
	public Gengar94() {
		super (ghost, dft, 324, 251, 240, 350, 94, "Gengar");
		a[1] = new HyperBeam();
		a[2] = new Thunderbolt();
		a[3] = new ShadowBall();
		a[4] = new DreamEater();
	}
}

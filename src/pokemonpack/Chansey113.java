package pokemonpack;

public class Chansey113 extends Pokemon implements Tipos{
	public Chansey113(){
		super(normal,704, 119, 119, 218, 113, "Chansey");
		a[1] = new SkullBash();
		a[2] = new Thunderbolt();
		a[3] = new EggBomb();
		a[4] = new FireBlast();
	}
}
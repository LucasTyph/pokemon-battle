package pokemonpack;

public class Chansey113 extends Pokemon {
	public Chansey113(){
		super(704, 119, 119, 218, 113, "Chansey");
		Attack a[] = new Attack[5];
		a[1] = new SkullBash();
		a[2] = new Thunderbolt();
		a[3] = new EggBomb();
		a[4] = new FireBlast();
	}
}
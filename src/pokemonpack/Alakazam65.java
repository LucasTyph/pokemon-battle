package pokemonpack;

public class Alakazam65 extends Pokemon implements Tipos{
	
	public Alakazam65(){
		super(psychic, dft, 314, 218, 207, 372, 65, "Alakazam");
		a[1] = new HyperBeam();
		a[2] = new Psychic();
		a[3] = new QuickAttack();
		a[4] = new Fly();
	}

}

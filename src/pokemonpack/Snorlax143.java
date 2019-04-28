package pokemonpack;

public class Snorlax143 extends Pokemon{
	public Snorlax143() {
		super(524, 350, 251, 174, 143, "Snorlax");
		Attack a[] = new Attack[5];
		a[1] = new GigaImpact();
		a[2] = new DoubleEdge();
		a[3] = new TakeDown();
		a[4] = new Superpower();
	}
}
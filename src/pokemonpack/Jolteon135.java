package pokemonpack;

public class Jolteon135 extends Pokemon {
	public Jolteon135(){
		super(334, 251, 240, 394, 135, "Jolteon");
		Attack a[] = new Attack[5];
		a[1] = new QuickAttack();
		a[2] = new PinMissile();
		a[3] = new Thunder();
		a[4] = new Thunderbolt();
	}
}
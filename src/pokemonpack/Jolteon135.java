package pokemonpack;

public class Jolteon135 extends Pokemon implements Tipos{
	public Jolteon135(){
		super(eletric, dft, 334, 251, 240, 394, 135, "Jolteon");
		a[1] = new QuickAttack();
		a[2] = new PinMissile();
		a[3] = new Thunder();
		a[4] = new Thunderbolt();
	}
}
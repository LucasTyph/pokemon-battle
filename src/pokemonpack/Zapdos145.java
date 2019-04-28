package pokemonpack;

public class Zapdos145 extends Pokemon{
	public Zapdos145() {
		super(364, 306, 295, 328, 145, "Zapdos");
		Attack a[] = new Attack[5];
		a[1] = new Thunder();
		a[2] = new SkyAttack();
		a[3] = new HyperBeam();
		a[4] = new ZapCannon();
	}
}
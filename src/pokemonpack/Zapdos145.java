package pokemonpack;

public class Zapdos145 extends Pokemon implements Tipos{
	public Zapdos145() {
		super(eletric, flying, 364, 306, 295, 328, 145, "Zapdos");
		a[1] = new Thunder();
		a[2] = new SkyAttack();
		a[3] = new HyperBeam();
		a[4] = new ZapCannon();
	}
}
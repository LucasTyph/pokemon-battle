package pokemonpack;

public class Persian53  extends Pokemon{
	public Persian53() {
		super(334, 262, 240, 361, 53, "Persian");
		Attack a[] = new Attack[5];
		a[1] = new FurySwipes();
		a[2] = new ShadowBall();
		a[3] = new BodySlam();
		a[4] = new AerialAce();
	}
}


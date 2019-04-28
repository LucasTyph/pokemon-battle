package pokemonpack;

public class Attack {
	public int power;
	public String name;
	private Attack(int power, String name) {
		this.power=power;
		this.name=name;
	}
	
	public class HyperBeam extends Attack{
		public HyperBeam() {
			super(150, "Hyper Beam");
		}
	}
	public class SkyAttack extends Attack{
		public SkyAttack() {
			super(140, "Sky Attack");
		}
	}
	public class SkullBash extends Attack {
		public SkullBash(){
			super(130, "Skull Bash");
		}
	}
	public class HJK extends Attack {
		public HJK(){
			super(130, "High Jump Kick");
		}
	}
	public class Thrash extends Attack {
		public Thrash(){
			super(120, "Thrash");
		}
	}
	public class SolarBeam extends Attack {
		public SolarBeam(){
			super(120, "Solar Beam");
		}
	}
	public class PetalDance extends Attack {
		public PetalDance(){
			super(120, "Petal Dance");
		}
	}
	public class Thunder extends Attack {
		public Thunder(){
			super(110, "Thunder");
		}
	}
	public class HydroPump extends Attack {
		public HydroPump(){
			super(110, "Hydro Pump");
		}
	}
	public class FireBlast extends Attack {
		public FireBlast(){
			super(110, "Fire Blast");
		}
	}
	public class Earthquake extends Attack {
		public Earthquake(){
			super(100, "Earthquake");
		}
	}
	public class Thunderbolt extends Attack {
		public Thunderbolt(){
			super(90, "Thunderbolt");
		}
	}
	public class Surf extends Attack{
		public Surf(){
			super(90, "Surf");
		}
	}
	public class Psychic extends Attack{
		public Psychic(){
			super(90, "Psychic");
		}
	}
	public class IceBeam extends Attack{
		public IceBeam(){
			super(90, "Ice Beam");
		}
	}
	public class Fly extends Attack{
		public Fly(){
			super(90, "Fly");
		}
	}
	public class Flamethrower extends Attack{
		public Flamethrower(){
			super(90, "Flamethrower");
		}
	}	
}

	
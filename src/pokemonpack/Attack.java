package pokemonpack;

public class Attack {
	public int power;
	public String name;
	public int priority;
	public Attack(int power, String name) {
		this.power=power;
		this.name=name;
		priority = 0;
	}
	public Attack(int power, String name, int priority) {
		this.power=power;
		this.name=name;
		this.priority=priority;
	}
}

	class HyperBeam extends Attack{
		public HyperBeam() {
			super(150, "Hyper Beam");
		}
	}
	class SkyAttack extends Attack{
		SkyAttack() {
			super(140, "Sky Attack");
		}
	}
	class SkullBash extends Attack {
		SkullBash(){
			super(130, "Skull Bash");
		}
	}
	class HJK extends Attack {
		HJK(){
			super(130, "High Jump Kick");
		}
	}
	class Thrash extends Attack {
		Thrash(){
			super(120, "Thrash");
		}
	}
	class SolarBeam extends Attack {
		SolarBeam(){
			super(120, "Solar Beam");
		}
	}
	class PetalDance extends Attack {
		PetalDance(){
			super(120, "Petal Dance");
		}
	}
	class Thunder extends Attack {
		Thunder(){
			super(110, "Thunder");
		}
	}
	class HydroPump extends Attack {
		HydroPump(){
			super(110, "Hydro Pump");
		}
	}
	class FireBlast extends Attack {
		FireBlast(){
			super(110, "Fire Blast");
		}
	}
	class Earthquake extends Attack {
		Earthquake(){
			super(100, "Earthquake");
		}
	}
	class Thunderbolt extends Attack {
		Thunderbolt(){
			super(90, "Thunderbolt");
		}
	}
	class Surf extends Attack{
		Surf(){
			super(90, "Surf");
		}
	}
	class Psychic extends Attack{
		Psychic(){
			super(90, "Psychic");
		}
	}
	class IceBeam extends Attack{
		IceBeam(){
			super(90, "Ice Beam");
		}
	}
	class Fly extends Attack{
		Fly(){
			super(90, "Fly");
		}
	}
	class Flamethrower extends Attack{
		Flamethrower(){
			super(90, "Flamethrower");
		}
	}
	class KarateChop extends Attack{
	    public KarateChop() {
	        super(50, "Karate Chop");
	    }
	}
	class QuickAttack extends Attack {
		public QuickAttack() {
			super (40, "Quick Attack", 1);
		}
	}

	
package pokemonpack;

public class Attack implements Tipos {
	public int tipodoataque;
	public int power;
	public String name;
	public int priority;
	public int tipohit;
	public Attack(int power, String name, int tip, int thit) {
		this.power=power;
		this.name=name;
		this.tipodoataque=tip;
		this.tipohit = thit;
		priority = 0;
	}
	public Attack(int power, String name, int priority, int tip, int thit) {
		this.power=power;
		this.name=name;
		this.priority=priority;
		this.tipodoataque = tip;
		this.tipohit = thit;
	}
}

	class HyperBeam extends Attack{
		public HyperBeam() {
			super(150, "Hyper Beam", normal, 1);
		}
	}
	class SkyAttack extends Attack{
		public SkyAttack() {
			super(140, "Sky Attack", flying, 1);
		}
	}
	class SkullBash extends Attack {
		public SkullBash(){
			super(130, "Skull Bash", normal, 1);
		}
	}
	class HJK extends Attack {
		public HJK(){
			super(130, "High Jump Kick", fighting, 1);
		}
	}
	class Thrash extends Attack {
		public Thrash(){
			super(120, "Thrash", normal, 1);
		}
	}
	class SolarBeam extends Attack {
		public SolarBeam(){
			super(120, "Solar Beam", grass, 1);
		}
	}
	class PetalDance extends Attack {
		public PetalDance(){
			super(120, "Petal Dance", grass, 1);
		}
	}
	class Thunder extends Attack {
		public Thunder(){
			super(110, "Thunder", eletric, 1);
		}
	}
	class HydroPump extends Attack {
		public HydroPump(){
			super(110, "Hydro Pump", water, 1);
		}
	}
	class FireBlast extends Attack {
		public FireBlast(){
			super(110, "Fire Blast", fire, 1);
		}
	}
	class Earthquake extends Attack {
		public Earthquake(){
			super(100, "Earthquake", ground, 1);
		}
	}
	class Thunderbolt extends Attack {
		public Thunderbolt(){
			super(90, "Thunderbolt", eletric, 1);
		}
	}
	class Surf extends Attack{
		public Surf(){
			super(90, "Surf", water, 1);
		}
	}
	class Psychic extends Attack{
		public Psychic(){
			super(90, "Psychic", psychic, 1);
		}
	}
	class IceBeam extends Attack{
		public IceBeam(){
			super(90, "Ice Beam", ice, 1);
		}
	}
	class Fly extends Attack{
		public Fly(){
			super(90, "Fly", flying, 1);
		}
	}
	class Flamethrower extends Attack{
		public Flamethrower(){
			super(90, "Flamethrower", fire, 1);
		}
	}
	class KarateChop extends Attack{
	    public KarateChop() {
	        super(50, "Karate Chop", fighting, 1);
	    }
	}
	class QuickAttack extends Attack {
		public QuickAttack() {
			super (40, "Quick Attack", 1, normal, 1);
		}
	}
	class EggBomb extends Attack {
		public EggBomb() {
			super (100, "Egg Bomb", normal, 1);
		}
	}
	class SpikeCannon extends Attack {
		
		public SpikeCannon () {
			super (20, "Spike Cannon", normal, 2);
		}
	}
	class ThunderPunch extends Attack {
		public ThunderPunch() {
			super (75, "Thunder Punch", ice, 1);
		}
	}
	class DreamEater extends Attack {
		public DreamEater () {
			super (100, "Dream Eater", fairy, 1);
		}
	}
	class ShadowBall extends Attack {
		public ShadowBall () {
			super (80, "Shadow Ball", ghost, 1);
		}
	}
	class DoubleEdge extends Attack {
		public DoubleEdge () {
			super (100, "Double-Edge", normal, 1);
		}
	}
	class RockSlide extends Attack {
		public RockSlide () {
			super (75, "Rock Slide", rock, 1);
		}
	}
	class PinMissile extends Attack {
		public PinMissile () {
			super (25, "Pin Missile", bug, 2);
		}
	}
	class BodySlam extends Attack {
		public BodySlam () {
			super (85, "Body Slam", normal, 1);
		}
	}
	class FurySwipes extends Attack {
		public FurySwipes () {
			super (20, "Fury Swipes", normal, 2);
		}
	}
	class AerialAce extends Attack {
		public AerialAce () {
			super (60, "Aerial Ace", flying, 1);
		}
	}
	class Megahorn extends Attack {
		public Megahorn () {
			super (120, "Megahorn", bug, 1);
		}
	}
	class Superpower extends Attack {
		public Superpower () {
			super (120, "Superpower", fighting, 1);
		}
	}
	class GigaImpact extends Attack {
		public GigaImpact () {
			super (150, "Giga Impact", normal, 1);
		}
	}
	class TakeDown extends Attack {
		public TakeDown () {
			super (90, "Take Down", normal, 1);
			
		}
	}
	class Psywave extends Attack {
		public Psywave () {
			super (50, "Psywave", psychic, 3);
		}
	}
	class Acid extends Attack {
		public Acid () {
			super (40, "Acid", poison, 1);
		}
	}
	class PowerWipe extends Attack {
		public PowerWipe () {
			super(120, "Power Wipe", grass, 1);
		}
	}
	class ZapCannon extends Attack {
		public ZapCannon () {
			super (150, "Zap Cannon", eletric, 1);
		}
	}

	
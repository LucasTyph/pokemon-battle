package pokemonpack;

public class Attack implements Tipos {
	public int tipodoataque;
	public int power;
	public String name;
	public int priority;
	public Attack(int power, String name, int tip) {
		this.power=power;
		this.name=name;
		this.tipodoataque=tip;
		priority = 0;
	}
	public Attack(int power, String name, int priority, int tip) {
		this.power=power;
		this.name=name;
		this.priority=priority;
		this.tipodoataque = tip;
	}
}

	class HyperBeam extends Attack{
		public HyperBeam() {
			super(150, "Hyper Beam", normal);
		}
	}
	class SkyAttack extends Attack{
		SkyAttack() {
			super(140, "Sky Attack", flying);
		}
	}
	class SkullBash extends Attack {
		SkullBash(){
			super(130, "Skull Bash", normal);
		}
	}
	class HJK extends Attack {
		HJK(){
			super(130, "High Jump Kick", fighting);
		}
	}
	class Thrash extends Attack {
		Thrash(){
			super(120, "Thrash", normal);
		}
	}
	class SolarBeam extends Attack {
		SolarBeam(){
			super(120, "Solar Beam", grass);
		}
	}
	class PetalDance extends Attack {
		PetalDance(){
			super(120, "Petal Dance", grass);
		}
	}
	class Thunder extends Attack {
		Thunder(){
			super(110, "Thunder", eletric);
		}
	}
	class HydroPump extends Attack {
		HydroPump(){
			super(110, "Hydro Pump", water);
		}
	}
	class FireBlast extends Attack {
		FireBlast(){
			super(110, "Fire Blast", fire);
		}
	}
	class Earthquake extends Attack {
		Earthquake(){
			super(100, "Earthquake", ground);
		}
	}
	class Thunderbolt extends Attack {
		Thunderbolt(){
			super(90, "Thunderbolt", eletric);
		}
	}
	class Surf extends Attack{
		Surf(){
			super(90, "Surf", water);
		}
	}
	class Psychic extends Attack{
		Psychic(){
			super(90, "Psychic", psychic);
		}
	}
	class IceBeam extends Attack{
		IceBeam(){
			super(90, "Ice Beam", ice);
		}
	}
	class Fly extends Attack{
		Fly(){
			super(90, "Fly", flying);
		}
	}
	class Flamethrower extends Attack{
		Flamethrower(){
			super(90, "Flamethrower", fire);
		}
	}
	class KarateChop extends Attack{
	    public KarateChop() {
	        super(50, "Karate Chop", fighting);
	    }
	}
	class QuickAttack extends Attack {
		public QuickAttack() {
			super (40, "Quick Attack", 1, normal);
		}
	}
	class EggBomb extends Attack {
		public EggBomb() {
			super (100, "Egg Bomb", normal);
		}
	}
	class SpikeCannon extends Attack {
		
		public SpikeCannon () {
			super (	(int)(Math.round(Math.random()*3)+2)*20, "Spike Cannon", normal);
		}
	}
	class ThunderPunch extends Attack {
		public ThunderPunch() {
			super (75, "Thunder Punch", ice);
		}
	}
	class DreamEater extends Attack {
		public DreamEater () {
			super (100, "Dream Eater", fairy);
		}
	}
	class ShadowBall extends Attack {
		public ShadowBall () {
			super (80, "Shadow Ball", ghost);
		}
	}
	class DoubleEdge extends Attack {
		public DoubleEdge () {
			super (100, "Double-Edge", normal);
		}
	}
	class RockSlide extends Attack {
		public RockSlide () {
			super (75, "Rock Slide", rock);
		}
	}
	class PinMissile extends Attack {
		public PinMissile () {
			super ((int)(Math.round(Math.random()*3)+2)*25, "Pin Missile", bug);
		}
	}
	class BodySlam extends Attack {
		public BodySlam () {
			super (85, "Body Slam", normal);
		}
	}
	class FurySwipes extends Attack {
		public FurySwipes () {
			super ( (int)(Math.round(Math.random()*3)+2)*20, "Fury Swipes", normal);
		}
	}
	class AerialAce extends Attack {
		public AerialAce () {
			super (60, "Aerial Ace", flying);
		}
	}
	class Megahorn extends Attack {
		public Megahorn () {
			super (120, "Megahorn", bug);
		}
	}
	class Superpower extends Attack {
		public Superpower () {
			super (120, "Superpower", fighting);
		}
	}
	class GigaImpact extends Attack {
		public GigaImpact () {
			super (150, "Giga Impact", normal);
		}
	}
	class TakeDown extends Attack {
		public TakeDown () {
			super (90, "Take Down", normal);
			
		}
	}
	class Psywave extends Attack {
		public Psywave () {
			super ( (int)(Math.round(Math.random()*100) + 50), "Psywave", psychic);
		}
	}
	class Acid extends Attack {
		public Acid () {
			super (40,"Acid", poison);
		}
	}
	class PowerWipe extends Attack {
		public PowerWipe () {
			super(120, "Power Wipe", grass);
		}
	}
	class ZapCannon extends Attack {
		public ZapCannon () {
			super (150, "Zap Cannon", eletric);
		}
	}

	
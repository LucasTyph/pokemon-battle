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
	class EggBomb extends Attack {
		public EggBomb() {
			super (100, "Egg Bomb");
		}
	}
	class SpikeCannon extends Attack {
		
		public SpikeCannon () {
			super (	(int)(Math.round(Math.random()*3)+2)*20, "Spike Cannon");
		}
	}
	class ThunderPunch extends Attack {
		public ThunderPunch() {
			super (75, "Thunder Punch");
		}
	}
	class DreamEater extends Attack {
		public DreamEater () {
			super (100, "Dream Eater");
		}
	}
	class ShadowBall extends Attack {
		public ShadowBall () {
			super (80, "Shadow Ball");
		}
	}
	class DoubleEdge extends Attack {
		public DoubleEdge () {
			super (100, "Double-Edge");
		}
	}
	class RockSlide extends Attack {
		public RockSlide () {
			super (75, "Rock Slide");
		}
	}
	class PinMissile extends Attack {
		public PinMissile () {
			super ((int)(Math.round(Math.random()*3)+2)*25, "Pin Missile");
		}
	}
	class BodySlam extends Attack {
		public BodySlam () {
			super (85, "Body Slam");
		}
	}
	class FurySwipes extends Attack {
		public FurySwipes () {
			super ( (int)(Math.round(Math.random()*3)+2)*20, "Fury Swipes");
		}
	}
	class AerialAce extends Attack {
		public AerialAce () {
			super (60, "Aerial Ace");
		}
	}
	class Megahorn extends Attack {
		public Megahorn () {
			super (120, "Megahorn");
		}
	}
	class Superpower extends Attack {
		public Superpower () {
			super (120, "Superpower");
		}
	}
	class GigaImpact extends Attack {
		public GigaImpact () {
			super (150, "Giga Impact");
		}
	}
	class TakeDown extends Attack {
		public TakeDown () {
			super (90, "Take Down");
			
		}
	}
	class Psywave extends Attack {
		public Psywave () {
			super ( (int)(Math.round(Math.random()*100) + 50), "Psywave");
		}
	}
	class Acid extends Attack {
		public Acid () {
			super (40,"Acid");
		}
	}
	class PowerWipe extends Attack {
		public PowerWipe () {
			super(120, "Power Wipe");
		}
	}
	class ZapCannon extends Attack {
		public ZapCannon () {
			super (150, "Zap Cannon");
		}
	}

	
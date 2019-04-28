package pokemonpack;

public class Pokemon {
	public int tipo;
	public int hitpoints;
	public int attack;
	public int defense;
	public int speed;
	public int dexNum;
	public int hpmax;
	public String name;
	public Attack a[] = new Attack[5];
	
	Pokemon (int hp, int a, int d, int s, int num, String name){
		this.attack=a;
		this.hitpoints=hp;
		this.defense=d;
		this.speed=s;
		this.dexNum=num;
		this.name = name;
		this.hpmax=hp;
	}
}

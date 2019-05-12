package pokemonpack;

public class Pokemon implements Tipos{
	public int tipo;
	public int tiposec;
	public int hitpoints;
	public double attack;
	public double defense;
	public int speed;
	public int dexNum;
	public int hpmax;
	public String name;
	public Attack a[] = new Attack[5];
	
	Pokemon (int tip, int tips, int hp, int a, int d, int s, int num, String name){
		this.attack=a;
		this.hitpoints=hp;
		this.defense=d;
		this.speed=s;
		this.dexNum=num;
		this.name = name;
		this.hpmax=hp;
		this.tipo=tip;
		this.tiposec = tips;
	}
}

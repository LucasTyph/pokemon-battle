package pokemonpack;

public class Pokemon {
	public int tipo;
	public int hitpoints;
	public int attack;
	public int defense;
	public int speed;
	public int dexNum;
	
	Pokemon (int hp, int a, int d, int s, int num){
		this.attack=a;
		this.hitpoints=hp;
		this.defense=d;
		this.speed=s;
		this.dexNum=num;
	}
}

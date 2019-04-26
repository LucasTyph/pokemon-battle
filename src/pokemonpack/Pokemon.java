package pokemonpack;

public class Pokemon {
	int hitpoints;
	int attack;
	int defense;
	int speed;
	int dexNum;
	
	Pokemon (int hp, int a, int d, int s, int num){
		this.attack=a;
		this.hitpoints=hp;
		this.defense=d;
		this.speed=s;
		this.dexNum=num;
	}
}

package pokemonpack;

public class Damage {
	public static int dano (double atk, double def, int pwr, int tiphit, int tipmove, int tipofense, int tipdefense) {
		double tab[][] = new double[18][18];{
			tab[0][0] = 1.0; tab[0][1] = 1.0; tab[0][2] = 1.0; tab[0][3] = 1.0; tab[0][4] = 1.0; tab[0][5] = 0.5; tab[0][6] = 1.0; tab[0][7] = 0.0; tab[0][8] = 0.5; tab[0][9] = 1.0; tab[0][10] = 1.0; tab[0][11] = 1.0; tab[0][12] = 1.0; tab[0][13] = 1.0; tab[0][14] = 1.0; tab[0][15] = 1.0; tab[0][16] = 1.0; tab[0][17] = 1.0;
			tab[1][0] = 2.0; tab[1][1] = 1.0; tab[1][2] = 0.5; tab[1][3] = 0.5; tab[1][4] = 1.0; tab[1][5] = 2.0; tab[1][6] = 0.5; tab[1][7] = 0.0; tab[1][8] = 2.0; tab[1][9] = 1.0; tab[1][10] = 1.0; tab[1][11] = 1.0; tab[1][12] = 1.0; tab[1][13] = 0.5; tab[1][14] = 2.0; tab[1][15] = 1.0; tab[1][16] = 2.0; tab[1][17] = 0.5;
			tab[2][0] = 1.0; tab[2][1] = 2.0; tab[2][2] = 1.0; tab[2][3] = 1.0; tab[2][4] = 1.0; tab[2][5] = 0.5; tab[2][6] = 2.0; tab[2][7] = 1.0; tab[2][8] = 0.5; tab[2][9] = 1.0; tab[2][10] = 1.0; tab[2][11] = 2.0; tab[2][12] = 0.5; tab[2][13] = 1.0; tab[2][14] = 1.0; tab[2][15] = 1.0; tab[2][16] = 1.0; tab[2][17] = 1.0;
			tab[3][0] = 1.0; tab[3][1] = 1.0; tab[3][2] = 1.0; tab[3][3] = 0.5; tab[3][4] = 0.5; tab[3][5] = 0.5; tab[3][6] = 1.0; tab[3][7] = 0.5; tab[3][8] = 0.0; tab[3][9] = 1.0; tab[3][10] = 1.0; tab[3][11] = 2.0; tab[3][12] = 1.0; tab[3][13] = 1.0; tab[3][14] = 1.0; tab[3][15] = 1.0; tab[3][16] = 1.0; tab[3][17] = 2.0;
			tab[4][0] = 1.0; tab[4][1] = 1.0; tab[4][2] = 0.0; tab[4][3] = 2.0; tab[4][4] = 1.0; tab[4][5] = 2.0; tab[4][6] = 0.5; tab[4][7] = 1.0; tab[4][8] = 2.0; tab[4][9] = 2.0; tab[4][10] = 1.0; tab[4][11] = 0.5; tab[4][12] = 2.0; tab[4][13] = 1.0; tab[4][14] = 1.0; tab[4][15] = 1.0; tab[4][16] = 1.0; tab[4][17] = 1.0;
			tab[5][0] = 1.0; tab[5][1] = 0.5; tab[5][2] = 2.0; tab[5][3] = 1.0; tab[5][4] = 0.5; tab[5][5] = 1.0; tab[5][6] = 2.0; tab[5][7] = 1.0; tab[5][8] = 0.5; tab[5][9] = 2.0; tab[5][10] = 1.0; tab[5][11] = 1.0; tab[5][12] = 1.0; tab[5][13] = 1.0; tab[5][14] = 2.0; tab[5][15] = 1.0; tab[5][16] = 1.0; tab[5][17] = 1.0;
			tab[6][0] = 1.0; tab[6][1] = 0.5; tab[6][2] = 0.5; tab[6][3] = 0.5; tab[6][4] = 1.0; tab[6][5] = 1.0; tab[6][6] = 1.0; tab[6][7] = 0.5; tab[6][8] = 0.5; tab[6][9] = 0.5; tab[6][10] = 1.0; tab[6][11] = 2.0; tab[6][12] = 1.0; tab[6][13] = 2.0; tab[6][14] = 1.0; tab[6][15] = 1.0; tab[6][16] = 2.0; tab[6][17] = 0.5;
			tab[7][0] = 0.0; tab[7][1] = 1.0; tab[7][2] = 1.0; tab[7][3] = 1.0; tab[7][4] = 1.0; tab[7][5] = 1.0; tab[7][6] = 1.0; tab[7][7] = 2.0; tab[7][8] = 1.0; tab[7][9] = 1.0; tab[7][10] = 1.0; tab[7][11] = 1.0; tab[7][12] = 1.0; tab[7][13] = 2.0; tab[7][14] = 1.0; tab[7][15] = 1.0; tab[7][16] = 0.5; tab[7][17] = 1.0;
			tab[8][0] = 1.0; tab[8][1] = 1.0; tab[8][2] = 1.0; tab[8][3] = 1.0; tab[8][4] = 1.0; tab[8][5] = 2.0; tab[8][6] = 1.0; tab[8][7] = 1.0; tab[8][8] = 0.5; tab[8][9] = 0.5; tab[8][10] = 0.5; tab[8][11] = 1.0; tab[8][12] = 0.5; tab[8][13] = 1.0; tab[8][14] = 2.0; tab[8][15] = 1.0; tab[8][16] = 1.0; tab[8][17] = 2.0;
			tab[9][0] = 1.0; tab[9][1] = 1.0; tab[9][2] = 1.0; tab[9][3] = 1.0; tab[9][4] = 1.0; tab[9][5] = 0.5; tab[9][6] = 2.0; tab[9][7] = 1.0; tab[9][8] = 2.0; tab[9][9] = 0.5; tab[9][10] = 0.5; tab[9][11] = 2.0; tab[9][12] = 1.0; tab[9][13] = 1.0; tab[9][14] = 2.0; tab[9][15] = 0.5; tab[9][16] = 1.0; tab[9][17] = 1.0;
			tab[10][0] = 1.0; tab[10][1] = 1.0; tab[10][2] = 1.0; tab[10][3] = 1.0; tab[10][4] = 2.0; tab[10][5] = 2.0; tab[10][6] = 1.0; tab[10][7] = 1.0; tab[10][8] = 1.0; tab[10][9] = 2.0; tab[10][10] = 0.5; tab[10][11] = 0.5; tab[10][12] = 1.0; tab[10][13] = 1.0; tab[10][14] = 1.0; tab[10][15] = 0.5; tab[10][16] = 1.0; tab[10][17] = 1.0;
			tab[11][0] = 1.0; tab[11][1] = 1.0; tab[11][2] = 0.5; tab[11][3] = 0.5; tab[11][4] = 2.0; tab[11][5] = 2.0; tab[11][6] = 0.5; tab[11][7] = 1.0; tab[11][8] = 0.5; tab[11][9] = 0.5; tab[11][10] = 2.0; tab[11][11] = 0.5; tab[11][12] = 1.0; tab[11][13] = 1.0; tab[11][14] = 1.0; tab[11][15] = 0.5; tab[11][16] = 1.0; tab[11][17] = 1.0;
			tab[12][0] = 1.0; tab[12][1] = 1.0; tab[12][2] = 2.0; tab[12][3] = 1.0; tab[12][4] = 0.0; tab[12][5] = 1.0; tab[12][6] = 1.0; tab[12][7] = 1.0; tab[12][8] = 1.0; tab[12][9] = 1.0; tab[12][10] = 2.0; tab[12][11] = 0.5; tab[12][12] = 0.5; tab[12][13] = 1.0; tab[12][14] = 1.0; tab[12][15] = 0.5; tab[12][16] = 1.0; tab[12][17] = 1.0;
			tab[13][0] = 1.0; tab[13][1] = 2.0; tab[13][2] = 1.0; tab[13][3] = 2.0; tab[13][4] = 1.0; tab[13][5] = 1.0; tab[13][6] = 1.0; tab[13][7] = 0.5; tab[13][8] = 1.0; tab[13][9] = 1.0; tab[13][10] = 1.0; tab[13][11] = 1.0; tab[13][12] = 1.0; tab[13][13] = 0.5; tab[13][14] = 1.0; tab[13][15] = 1.0; tab[13][16] = 0.0; tab[13][17] = 1.0;
			tab[14][0] = 1.0; tab[14][1] = 1.0; tab[14][2] = 2.0; tab[14][3] = 1.0; tab[14][4] = 2.0; tab[14][5] = 1.0; tab[14][6] = 1.0; tab[14][7] = 1.0; tab[14][8] = 0.5; tab[14][9] = 0.5; tab[14][10] = 0.5; tab[14][11] = 2.0; tab[14][12] = 1.0; tab[14][13] = 1.0; tab[14][14] = 0.5; tab[14][15] = 2.0; tab[14][16] = 1.0; tab[14][17] = 1.0;
			tab[15][0] = 1.0; tab[15][1] = 1.0; tab[15][2] = 1.0; tab[15][3] = 1.0; tab[15][4] = 1.0; tab[15][5] = 1.0; tab[15][6] = 1.0; tab[15][7] = 1.0; tab[15][8] = 0.5; tab[15][9] = 1.0; tab[15][10] = 1.0; tab[15][11] = 1.0; tab[15][12] = 1.0; tab[15][13] = 1.0; tab[15][14] = 1.0; tab[15][15] = 2.0; tab[15][16] = 1.0; tab[15][17] = 0.0;
			tab[16][0] = 1.0; tab[16][1] = 0.5; tab[16][2] = 1.0; tab[16][3] = 1.0; tab[16][4] = 1.0; tab[16][5] = 1.0; tab[16][6] = 1.0; tab[16][7] = 2.0; tab[16][8] = 1.0; tab[16][9] = 1.0; tab[16][10] = 1.0; tab[16][11] = 1.0; tab[16][12] = 1.0; tab[16][13] = 2.0; tab[16][14] = 1.0; tab[16][15] = 1.0; tab[16][16] = 0.5; tab[16][17] = 0.5;
			tab[17][0] = 1.0; tab[17][1] = 2.0; tab[17][2] = 1.0; tab[17][3] = 0.5; tab[17][4] = 1.0; tab[17][5] = 1.0; tab[17][6] = 1.0; tab[17][7] = 1.0; tab[17][8] = 0.5; tab[17][9] = 0.5; tab[17][10] = 1.0; tab[17][11] = 1.0; tab[17][12] = 1.0; tab[17][13] = 1.0; tab[17][14] = 1.0; tab[17][15] = 2.0; tab[17][16] = 2.0; tab[17][17] = 1.0;
		}
		double random;
		double critical;
		double stab;
		int cont = 0;
		if (tipmove == tipofense)
			stab = 1.5;
		else
			stab = 1.0;
		int dmg = 0;
		if (tab[tipmove][tipdefense] == 0.0) { // Aqui verificamos uma condi��o extraordinaria de damage = 0
			System.out.println("the opponent is immune to this attack");
			return dmg;
		}
		if (tipmove == tipofense) // aqui, verifica-se o stab
			stab = 1.5;
		else
			stab = 1.0;
		
		switch (tiphit) {
		
		case 1: // Ataques deste tipo "hitam" apenas uma vez
			random = Math.random()*(0.15)+0.85;
			critical =  Math.round(Math.random()/1.6);

			if (tab[tipmove][tipdefense] == 2.0)
				System.out.println("It's super effective");
			if (tab[tipmove][tipdefense] == 0.5)
				System.out.println("It's not very effective");
			if (critical == 1.0)
				System.out.println("It's a critical hit");
			dmg = (int)((((42*pwr*(atk/def))/50.0)+2)*(1 + critical/2)*tab[tipmove][tipdefense]*stab*random);
			break;
			
		case 2: // Ataques deste tipo "hitam" de 2 a 5 vezes. Pin Missile, Spike Cannon e Fury Swipes s�o exemplos
			int parcial;
			int number = (int) Math.round(Math.random()*3) + 2;
			if (tipmove == tipofense)
				stab = 1.5;
			else
				stab = 1.0;
			
			while ( cont < number ) {
				random = Math.random()*(0.15)+0.85;
				critical =  Math.round(Math.random()/1.6);
				parcial = dmg;
				if (tab[tipmove][tipdefense] == 2.0)
					System.out.println("It's super effective");
				if (tab[tipmove][tipdefense] == 0.5)
					System.out.println("It's not very effective");
				if (critical == 1.0)
					System.out.println("It's a critical hit");
				System.out.println("It's " + (cont + 1) + "� hit");
				dmg += (int)((((42*pwr*(atk/def))/50.0)+2)*(1 + critical/2)*tab[tipmove][tipdefense]*stab*random);
				parcial = dmg - parcial;
				System.out.println("Causou " + parcial + " de dano!");
				cont++;
			}
			break;
		
		case 3: // Ataques deste tipo obedecem a formula: level * ( random(0 a 100) + pwr) / 100. Psywave() � um deles
			random = Math.random()*(0.15)+0.85;
			critical =  Math.round(Math.random()/1.6);
			int pwr2 = (int) Math.round(Math.random()*100);
			if (tipmove == tipofense)
				stab = 1.5;
			else
				stab = 1.0;
			if (tab[tipmove][tipdefense] == 2.0)
				System.out.println("It's super effective");
			if (tab[tipmove][tipdefense] == 0.5)
				System.out.println("It's not very effective");
			if (critical == 1.0)
				System.out.println("It's a critical hit");
			dmg = (int)((((42*(pwr+pwr2)*(atk/def))/50.0)+2)*(1 + critical/2)*tab[tipmove][tipdefense]*stab*random);
			break;	
		}
		return dmg;

	}
}
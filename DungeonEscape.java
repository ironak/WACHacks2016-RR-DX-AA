public class DungeonEscape {
	public static int PlayerHealth, DragonHealth, PlayerDamage, DragonDamage;
	double p, r, d, n;

	public DungeonEscape() {
		DragonHealth = 1875;
		PlayerHealth = 1000;
		System.out
				.println("You are in a dungeon.  The exit is trapped by a dragon.  "
						+ "Your only option is to fight it.");
		for (int i = 0; i < 100000; i++) {
			p = Math.random();
			r = Math.random();
			d = Math.random();
			n = Math.random();
			if (p > 0.25) {
				if (r <= 0.4) {
					PlayerDamage = 3;
					DragonHealth = DragonHealth - PlayerDamage;
					System.out
							.println("You dealt 3 damage to the dragon.  It now has "
									+ DragonHealth + "HP left");
				} else if (r > 0.4 && r <= 0.7) {
					PlayerDamage = 4;
					DragonHealth = DragonHealth - PlayerDamage;
					System.out
							.println("You dealt 4 damage to the dragon.  It now has "
									+ DragonHealth + "HP left");
				} else if (r > 0.7 && r <= 0.9) {
					PlayerDamage = 5;
					DragonHealth = DragonHealth - PlayerDamage;
					System.out
							.println("You dealt 5 damage to the dragon.  It now has "
									+ DragonHealth + "HP left");
				} else {
					PlayerDamage = 8;
					DragonHealth = DragonHealth - PlayerDamage;
					System.out
							.println("You dealt 8 damage to the dragon.  It now has "
									+ DragonHealth + "HP left");
				}
			} else {
				System.out.println("You missed");
			}
			if (d <= 0.25) {
				if (n <= 0.56) {
					DragonDamage = 6;
					PlayerHealth = PlayerHealth - DragonDamage;
					System.out
							.println("The dragon dealt 6 damage to you.  You now have "
									+ PlayerHealth + "HP left");
				} else if (n > 0.56 && n <= 0.88) {
					DragonDamage = 7;
					PlayerHealth = PlayerHealth - DragonDamage;
					System.out
							.println("The dragon dealt 7 damage to you.  You now have "
									+ PlayerHealth + "HP left");
				} else if (n > 0.88 && n <= 0.96) {
					DragonDamage = 8;
					PlayerHealth = PlayerHealth - DragonDamage;
					System.out
							.println("The dragon dealt 8 damage to you.  You now have "
									+ PlayerHealth + "HP left");
				} else {
					DragonDamage = 10;
					PlayerHealth = PlayerHealth - DragonDamage;
					System.out
							.println("The dragon dealt 10 damage to you.  You now have "
									+ PlayerHealth + "HP left");
				}
			}
			if (PlayerHealth <= 0) {
				System.out
						.println("You were killed by the dragon.  Better luck next time and thank you for playing.");
				i = 100000;
			} else if (DragonHealth <= 0) {
				System.out
						.println("Congratulations.  You have successfully slayed the dragon.  Thank you for playing.");
				i = 100000;
			} else {

			}
		}
	}
/*
	public static void main(String[] args) {
		new DungeonEscape();
	}*/
}
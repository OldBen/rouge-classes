package pl.oldben.rouge;


public class Player {
	private Weapon weapon;

	public Player(Weapon weapon) {
		this.weapon = weapon;
	}

	public int Attack()	{
		return weapon.Slash() + 2;
	}
}

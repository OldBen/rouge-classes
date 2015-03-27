package pl.oldben.rouge;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class PlayerTest {
	@Test
	public void testAttack()	{
		Player player = new Player(new Weapon());

		assertEquals(7, player.Attack());



	}
	@Test
	public void testMockAttack()	{
		Weapon weapon = mock(Weapon.class);
		when(weapon.Slash()).thenReturn(3);
		Player player = new Player(weapon);

		assertEquals(5,player.Attack());



	}
}

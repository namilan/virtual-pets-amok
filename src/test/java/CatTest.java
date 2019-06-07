import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	
	int health;
	int hunger;
	int thirst;
	int litterBox;
	
	Cat underTest = new Cat();
	
	@Test
	public void doesCatHealthGetterWork() {
		underTest.health = 75;
		assertEquals(75, underTest.getHealth());
	}
	
	@Test
	public void doesCatHungerGetterWork() {
		underTest.hunger = 25;
		assertEquals(25, underTest.getHunger());
	}
	
	@Test
	public void doesCatThirstGetterWork() {
		underTest.thirst = 35;
		assertEquals(35, underTest.getThirst());
	}
	
	@Test
	public void doesCatLitterBoxGetterWork() {
		underTest.litterBox = 25;
		assertEquals(25, underTest.getCatLitterBox());
	}
	
	@Test
	public void isCatHungerMethodWorking_ShouldReturnTrue() {
		underTest.hunger = 50;
		assertTrue(underTest.isHungry());
	}
	
	@Test
	public void isCatNotHungryMethodWorking_ShouldReturnTrue() {
		underTest.hunger = 50;
		assertTrue(underTest.isNotHungry());
	}
	
	@Test
	public void isCatThirstMethodWorking_ShouldReturnTrue() {
		underTest.thirst = 50;
		assertTrue(underTest.isThirsty());
	}
	
	@Test
	public void isCatNotThirstyMethodWorking_ShouldReturnTrue() {
		underTest.thirst = 50;
		assertTrue(underTest.isNotThirsty());
	}
	
	@Test
	public void isCatLitterBoxClean_ShouldReturnTrue() {
		underTest.litterBox = 50;
		assertTrue(underTest.isLitterBoxClean());
	}
	
	@Test
	public void isCatLitterBoxDirty_ShouldReturnTrue() {
		underTest.litterBox = 50;
		assertTrue(underTest.isLitterBoxDirty());
	}
	
	@Test
	public void isHealthTickWorking() {
		underTest.health = 75;
		underTest.getHealth();
		assertEquals(75, underTest.getHealth());
	}
	
	@Test
	public void isLitterBoxTickWorking() {
		underTest.litterBox = 50;
		underTest.getCatLitterBox();
		assertEquals(50, underTest.getCatLitterBox());
	}
	
	@Test
	public void isHungerTickWorking() {
		underTest.hunger = 50;
		underTest.getHunger();
		assertEquals(50, underTest.getHunger());
	}
	
	@Test
	public void isThirstTickWorking() {
		underTest.thirst = 50;
		underTest.getThirst();
		assertEquals(50, underTest.getThirst());
	}

}

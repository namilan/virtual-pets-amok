import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DogTest {
	
	int health = 50;
	int hunger = 30;
	int thirst = 15;
	int cageCleanliness = 75;
	int walk = 50;
	
	Dog underTest = new Dog();
	
	@Test
	public void doesHealtGetterWork() {
		underTest.health = 50;
		assertEquals(50, underTest.getHealth());
	}
	
	@Test
	public void doesHungerGetterWork() {
		underTest.hunger = 30;
		assertEquals(30, underTest.getHunger());
	}
	
	@Test
	public void doesThirstGetterWork() {
		underTest.thirst = 15;
		assertEquals(15, underTest.getThirst());
	}
	
	@Test
	public void doesCageClealinessGetterWork() {
		underTest.cageCleanliness = 75;
		assertEquals(75, underTest.getCleanliness());
	}
	
	@Test
	public void isDogNeedingWalkMethodWorking_ShouldReturnTrue() {
		underTest.walk = 50;
		assertTrue(underTest.isDogNeedingWalked());
	}
	
	@Test
	public void isDogHungerMethodWorking_ShouldReturnTrue() {
		underTest.hunger = 50;
		assertTrue(underTest.isHungry());
	}
	
	@Test
	public void isDogThirstyMethodWorking_ShouldReturnTrue() {
		underTest.thirst = 50;
		assertTrue(underTest.isThirsty());
	}
	
	@Test
	public void isDogCageCleanMethodWorking_ShouldReturnTrue(){
		underTest.cageCleanliness = 75;
		assertTrue(underTest.isDogCageClean());
	}
	
	@Test
	public void isHealthTickWorking() {
		underTest.health = 75;
		underTest.getHealth();
		assertEquals(75, underTest.getHealth());
	}
	
	@Test
	public void isCageCleanlinessTickWorking() {
		underTest.cageCleanliness = 50;
		underTest.getCleanliness();
		assertEquals(50, underTest.getCleanliness());
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

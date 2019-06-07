import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {
	
	private String userPetName;

	VirtualPet underTest = new VirtualPet (userPetName);
	
	@Test
	public void doesPetNameGetterWork () {
		String userPetName = "";
		underTest.name = userPetName;
		assertEquals("", underTest.getUserPetName());
	}
	
	@Test
	public void doesUserPetBoredGetterWork() {
		underTest.bored = 25;
		assertEquals(25, underTest.getUserPetBored());
	}
	
	@Test
	public void doesUserPetHappinessGetterWork() {
		underTest.happiness = 50;
		assertEquals(50, underTest.getUserPetHappiness());
	}
	
	@Test
	public void doesBoredMethodWork_ShouldReturnTrue() {
		underTest.bored = 25;
		assertTrue(underTest.petIsNotBored());
	}
	
	@Test
	public void doesBoredTickWork() {
		underTest.bored = 25;
		assertEquals(25, underTest.getUserPetBored());
	}
	
	@Test
	public void doesHappinessTickWork() {
		underTest.happiness = 50;
		assertEquals(50, underTest.getUserPetHappiness());
	}
	

}

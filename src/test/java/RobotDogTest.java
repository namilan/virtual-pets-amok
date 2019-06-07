import org.junit.Test;

public class RobotDogTest {
	
	int health = 75;
	int maintenance = 55;
	int oil = 62;
	
	RobotDogTest underTest = new RobotDogTest();
	
	@Test
	public void doesGetMaintenanceGetterWork() {
	underTest.maintenance = 55;
//	assertEquals(55, underTest.getMaintenance());
	}
	
	@Test
	public void doesOilGetterWork() {
		underTest.oil = 62;
//		assertEquals(62, underTest.getOil());
	}
	
	@Test
	public void isNeedingOilMethodWorking_ShouldReturnTrue() {
		underTest.oil = 62;
//		assertTrue(62, underTest.isNeedingOil());
	}
	
	@Test
	public void isNeedingMaintenanceMethodWorking_ShouldReturnTrue() {
		underTest.maintenance = 55;
//		assertTrue(55, underTest.isNeedingMaintenance());
	}
	
	@Test
	public void isRobotCatHealthTickWorking() {
		underTest.health = 75;
//		underTest.getHealth();
//		assertEquals(75, underTest.getHealth());
	}
	
	@Test
	public void isRobotCatOilTickWorking() {
		underTest.oil = 62;
//		underTest.getOil();
//		assertEquals(62, underTest.getOil());
	}
	
	@Test
	public void isRobotMaintenanceTickWorking() {
		underTest.maintenance = 55;
//		underTest.GetMaintenance();
//		assertEquals(55, underTest.getMaintenance());
	}
}
	

